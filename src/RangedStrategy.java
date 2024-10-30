class RangedStrategy implements FightingStrategy {
    @Override
    public void fight(Character attacker, Character opponent) {
        System.out.println("Performing a ranged attack!");
        opponent.takeDamage((int) (attacker.getAttackPower() * 1.1)); // Ranged attacks do slightly more damage
    }
}