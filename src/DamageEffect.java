class DamageEffect implements EffectVisitor {
    private final int damageAmount;

    public DamageEffect(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    @Override
    public void applyEffect(Character character) {
        System.out.println("Applying " + damageAmount + " damage over time.");
        character.takeDamage(damageAmount);
    }
}