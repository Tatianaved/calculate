public class OperationFactory {
    public Operation createOperation(String operationType) {
        switch (operationType) {
            case "addition":
                return new AdditionOperation();
            case "multiplication":
                return new MultiplicationOperation();
            case "division":
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}
