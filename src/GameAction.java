abstract class GameAction {
    public final void executeAction() {
        prepare();
        performAction();
        conclude();
    }

    protected abstract void performAction();

    private void prepare() {
        System.out.println("Preparing to execute action...");
    }

    private void conclude() {
        System.out.println("Action execution completed.");
    }
}