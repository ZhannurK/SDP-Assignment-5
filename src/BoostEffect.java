class BoostEffect implements EffectVisitor {
    private final int duration;
    private int cooldown;

    public BoostEffect(int duration, int cooldown) {
        this.duration = duration;
        this.cooldown = cooldown;
    }

    @Override
    public void applyEffect(Character character) {
        if (cooldown <= 0) {
            System.out.println("Applying boost effect. Duration: " + duration);
            character.setState(new PoweredUpState());
            cooldown = 5; // Reset cooldown after use
        } else {
            System.out.println("Boost effect is on cooldown for " + cooldown + " turns.");
            cooldown--;
        }
    }
}