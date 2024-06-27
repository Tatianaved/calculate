import java.util.logging.Logger;

public class LoggingDecorator implements Operation {
    private Operation operation;
    private Logger logger = Logger.getLogger(LoggingDecorator.class.getName());

    public LoggingDecorator(Operation operation) {
        this.operation = operation;
    }

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = operation.execute(a, b);
        logger.info("Operation: " + operation.getClass().getSimpleName() +
                    ", Operands: " + a + ", " + b +
                    ", Result: " + result);
        return result;
    }
}
