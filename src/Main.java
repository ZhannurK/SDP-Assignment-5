public class Main {
    public static void main(String[] args) {
        Character character1 = new Character(new NormalState(), new MeleeStrategy(), 20, 5, 100);
        Character character2 = new Character(new NormalState(), new RangedStrategy(), 18, 3, 80);

        character1.attack(character2);
        character1.setStrategy(new MagicStrategy());
        character1.attack(character2);

        BoostEffect boost = new BoostEffect(3, 2);
        character1.applyEffect(boost);
        character1.attack(character2);

        DamageEffect damageOverTime = new DamageEffect(10);
        for (int i = 0; i < 3; i++) {
            character2.applyEffect(damageOverTime);
        }

        GameAction healAction = new HealAction(character2, 15);
        healAction.executeAction();
    }
}