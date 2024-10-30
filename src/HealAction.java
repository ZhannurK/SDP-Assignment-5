class HealAction extends GameAction {
    private Character character;
    private int healAmount;

    public HealAction(Character character, int healAmount) {
        this.character = character;
        this.healAmount = healAmount;
    }

    @Override
    protected void performAction() {
        System.out.println("Healing character by " + healAmount + " points.");
        character.takeDamage(-healAmount); // Negative damage heals
    }
}