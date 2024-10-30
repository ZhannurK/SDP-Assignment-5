interface FightingStrategy {
    void fight(Character attacker, Character opponent);

    default void fight(Character attacker, Character opponent, double multiplier) {
        int damage = (int) (attacker.getAttackPower() * multiplier);
        opponent.takeDamage(damage);
    }
}