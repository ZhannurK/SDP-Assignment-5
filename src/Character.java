class Character {
    private CharacterState currentState;
    private FightingStrategy currentStrategy;
    private final int attackPower;
    private final int defense;
    private int health;

    public Character(CharacterState state, FightingStrategy strategy, int attackPower, int defense, int health) {
        this.currentState = state;
        this.currentStrategy = strategy;
        this.attackPower = attackPower;
        this.defense = defense;
        this.health = health;
    }

    public void setState(CharacterState state) {
        this.currentState = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.currentStrategy = strategy;
    }

    public void attack(Character opponent) {
        currentState.attack(this, opponent, currentStrategy);
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - defense, 0);
        health -= actualDamage;
        System.out.println("Character takes " + actualDamage + " damage. Health now: " + health);
        if (health <= 0) {
            setState(new DefeatedState());
            System.out.println("Character is defeated.");
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void applyEffect(EffectVisitor visitor) {
        visitor.applyEffect(this);
    }
}