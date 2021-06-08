import java.util.Scanner;

public class Operation {
    Scanner input = new Scanner(System.in);
    private char operation;
    private boolean error = true;

    public char getOperation() {
        return operation;
    }

    public void setOperation() {
        System.out.println("Введите действие +, -, /, *");
        try {
            char inputOperation = input.next(".").charAt(0);
            switch (inputOperation) {
                case '+':
                case '-':
                case '/':
                case '*':
                    operation = inputOperation;
                    break;
                default:
                    System.out.println("Операция не найдена.. завершаю работу..");
                    setErrorFalse();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ошибка!");
            setErrorFalse();
        }
    }

    public boolean isError() {
        return error;
    }

    public void setErrorFalse() {
        error = false;
    }
}
