public class MinusCommand implements OperationCommand {

    private KeyReceiver receiver;

    public MinusCommand(KeyReceiver keyReceiver) {
        receiver = keyReceiver;
    }

    public void execute() {
        receiver.getNumbers();
        receiver.subtraction();
    }
}
