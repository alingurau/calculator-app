public class PlusCommand implements OperationCommand {
    private KeyReceiver receiver;


    public PlusCommand(KeyReceiver keyReceiver) {
        receiver = keyReceiver;
    }

    public void execute() {
        receiver.getNumbers();
        receiver.addition();
    }

}
