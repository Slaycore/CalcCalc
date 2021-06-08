public class ConvertResultToRoman {
    private StringBuilder romanResult = new StringBuilder();
    private int convertInt[] = {1, 4, 5, 9, 10, 40, 50, 90, 100};
    private String convertString[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};

    public void setRomanResult(int result) {
        if (result == 0)
            romanResult.append("В римских числах нет нулей :))");
        else {
            int count = 0;
            for (int x = convertInt.length - 1; x >= 0; x--) {
                count = result / convertInt[x];
                result %= convertInt[x];
                while (count > 0) {
                    romanResult.append(convertString[x]);
                    count--;
                }
            }
        }
    }

    public void outputRomanResult() {
        System.out.println("Результат: " + romanResult.toString());
    }

}