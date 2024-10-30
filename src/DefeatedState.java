class DefeatedState implements CharacterState {
    @Override
    public void attack(Character attacker, Character opponent, FightingStrategy strategy) {
        System.out.println("Cannot attack; character is defeated.");
    }
}