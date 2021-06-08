import java.util.Scanner;

public class SecondNumber{
    Scanner input = new Scanner(System.in);
    private int second;
    private int secondFromRoman;
    private boolean error = true;
    private Roman inputToRome;

    public int getSecond() {
            return second;
    }

    public void setSecondArab() {
        System.out.println("Введите второе число: ");
        try {
            int inputSecond = input.nextInt();
            if (inputSecond > 0 && inputSecond < 11) {
                second = inputSecond;
            } else {
                System.out.println("Введено неправильное число.. завершаю работу..");
                setErrorFalse();
            }
        } catch (Exception e) {
            System.out.println("Ошибка!");
            setErrorFalse();
        }
    }

    public void setSecondRoman() {
        System.out.println("Введите второе число: ");
        try {
            inputToRome = Roman.valueOf(input.nextLine().toUpperCase());
            inputToRome.romanToInt(inputToRome);
            secondFromRoman = inputToRome.getFlip();
            if (secondFromRoman > 0 && secondFromRoman < 11) {
                second = secondFromRoman;
            } else {
                System.out.println("Введено неправильное число.. завершаю работу..");
                setErrorFalse();
            }
        } catch (Exception e) {
            System.out.println("Ошибка!!");
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
