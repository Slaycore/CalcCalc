public class Calculator {
    public static void main(String[] args) {
        FirstNumber inputFirstNumber = new FirstNumber();
        Operation inputOperation = new Operation();
        SecondNumber inputSecondNumber = new SecondNumber();
        Calculation Result = new Calculation();
        ConvertResultToRoman RomanResult = new ConvertResultToRoman();

        inputFirstNumber.setFirst();
        if (inputFirstNumber.isError()) {
            inputOperation.setOperation();
            if ((inputOperation.isError())) {
                if(inputFirstNumber.getArabFirst())
                inputSecondNumber.setSecondArab();
                else
                    inputSecondNumber.setSecondRoman();
                if (inputSecondNumber.isError()) {
                    Result.setResult(inputFirstNumber.getFirst(), inputOperation.getOperation(), inputSecondNumber.getSecond());
                    if (inputFirstNumber.getArabFirst())
                        Result.outputResult();
                    else {
                        RomanResult.setRomanResult(Result.getResult());
                        RomanResult.outputRomanResult();
                    }
                }
                else
                    System.out.println("Программа завершена!");
            }
            else
                System.out.println("Программа завершена!");
        }
        else
            System.out.println("Программа завершена!");
    }
}
