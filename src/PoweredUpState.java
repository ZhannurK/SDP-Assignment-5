class PoweredUpState implements CharacterState {
    @Override
    public void attack(Character attacker, Character opponent, FightingStrategy strategy) {
        System.out.println("Powered-up attack!");
        strategy.fight(attacker, opponent, 1.5); // 1.5x damage in powered-up state
    }
}