public class Calculator {
    private OperationFactory operationFactory;

    public Calculator(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public ComplexNumber calculate(String operationType, ComplexNumber a, ComplexNumber b) {
        Operation operation = operationFactory.createOperation(operationType);
        return operation.execute(a, b);
    }
}

