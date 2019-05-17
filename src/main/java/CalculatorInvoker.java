import java.util.ArrayList;
import java.util.List;

public class CalculatorInvoker {
    private List<OperationCommand> operationsHistory = new ArrayList<OperationCommand>();

    public void CallCommand(OperationCommand command) {
        command.execute();
        operationsHistory.add(command);
    }
}
