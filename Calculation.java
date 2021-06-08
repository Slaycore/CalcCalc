public class Calculation {
    private int result;

    public int getResult() {
        return result;
    }

    public void outputResult() {
        System.out.println("Результат: " + getResult());
    }

    public void setResult(int number1, char action, int number2) {
        switch (action) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
        }
    }
}
