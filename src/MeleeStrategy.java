class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight(Character attacker, Character opponent) {
        System.out.println("Performing a melee attack!");
        opponent.takeDamage(attacker.getAttackPower());
    }
}