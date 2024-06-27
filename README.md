Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.


Пояснение:
Класс ComplexNumber: Представляет комплексное число.

Интерфейс Operation: Определяет метод execute для выполнения операции над комплексными числами.

Классы AdditionOperation, MultiplicationOperation, DivisionOperation: Реализуют операции сложения, умножения и деления соответственно.

Класс OperationFactory: Фабрика для создания операций.

Класс Calculator: Выполняет операции над комплексными числами, используя фабрику операций.

Класс LoggingDecorator: Добавляет логирование операций.

Класс Main: Демонстрирует использование калькулятора и выполнение операций с логированием.