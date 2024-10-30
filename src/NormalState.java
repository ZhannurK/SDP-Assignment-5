class NormalState implements CharacterState {
    @Override
    public void attack(Character attacker, Character opponent, FightingStrategy strategy) {
        System.out.println("Normal attack.");
        strategy.fight(attacker, opponent);
    }
}