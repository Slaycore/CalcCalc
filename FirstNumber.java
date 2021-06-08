import java.util.Scanner;

public class FirstNumber {
    Scanner input = new Scanner(System.in);
    private int first;
    private int firstFromRoman;
    protected boolean arabCheckFirst = true;
    protected boolean romanCheckFirst = true;
    private boolean error = true;
    private Roman inputToRome;

    public int getFirst() {
            return first;
    }

    public void setFirst() {
        System.out.println("Введите первое число от 1 до 10");
        if(input.hasNextInt()) {
            try {
                int inputFirst = input.nextInt();
                if (inputFirst > 0 && inputFirst < 11) {
                    first = inputFirst;
                    setRomanFirstFalse();
                }
                else {
                    System.out.println("Введено неправильное число.. завершаю работу..");
                    setErrorFalse();
                }
            } catch (Exception e) {
                System.out.println("Ошибка!");
                setErrorFalse();
            }
        } else {
            try {
                inputToRome = Roman.valueOf(input.nextLine().toUpperCase());
                inputToRome.romanToInt(inputToRome);
                firstFromRoman = inputToRome.getFlip();
                if (firstFromRoman > 0 && firstFromRoman < 11) {
                    first = firstFromRoman;
                    setArabFirstFalse();
                } else {
                    System.out.println("Введено неправильное число.. завершаю работу..");
                    setErrorFalse();
                }
            } catch (Exception e) {
                System.out.println("Ошибка!!");
                setErrorFalse();
            }
        }
    }

    public boolean isError() {
        return error;
    }

    public void setErrorFalse() {
        error = false;
    }

    public void setRomanFirstFalse() {
        romanCheckFirst = false;
    }

    public boolean getArabFirst() {
        return arabCheckFirst;
    }

    public void setArabFirstFalse() {
        arabCheckFirst = false;
    }

}
