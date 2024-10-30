class MagicStrategy implements FightingStrategy {
    @Override
    public void fight(Character attacker, Character opponent) {
        System.out.println("Casting a magic spell!");
        opponent.takeDamage((int) (attacker.getAttackPower() * 1.3)); // Magic attacks do even more damage
    }
}