public class MultiplyCommand implements OperationCommand {

    private KeyReceiver receiver;

    public MultiplyCommand(KeyReceiver keyReceiver) {
        receiver = keyReceiver;
    }

    public void execute() {
        receiver.getNumbers();
        receiver.multiply();
    }
}
