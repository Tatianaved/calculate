import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        // Настраиваем логгер
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);

        // Создаем фабрику и калькулятор
        OperationFactory operationFactory = new OperationFactory();
        Calculator calculator = new Calculator(operationFactory);

        // Создаем комплексные числа
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        // Выполняем операции с логированием
        Operation addition = new LoggingDecorator(new AdditionOperation());
        Operation multiplication = new LoggingDecorator(new MultiplicationOperation());
        Operation division = new LoggingDecorator(new DivisionOperation());

        ComplexNumber addResult = addition.execute(a, b);
        ComplexNumber mulResult = multiplication.execute(a, b);
        ComplexNumber divResult = division.execute(a, b);

        // Выводим результаты
        System.out.println("Addition result: " + addResult);
        System.out.println("Multiplication result: " + mulResult);
        System.out.println("Division result: " + divResult);
    }
}
