public class DivideCommand implements OperationCommand {
    private KeyReceiver receiver;

    public DivideCommand(KeyReceiver keyReceiver) {
        receiver = keyReceiver;
    }

    public void execute() {
        receiver.getNumbers();
        receiver.division();
    }
}
