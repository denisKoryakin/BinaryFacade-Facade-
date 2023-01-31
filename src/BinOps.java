

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int aDec = binToDec(a);
        int bDec = binToDec(b);
        int sum = aDec + bDec;
        return decToBin(sum);
    }

    public String mult(String a, String b) {
        int aDec = binToDec(a);
        int bDec = binToDec(b);
        int mult = aDec * bDec;
        return decToBin(mult);
    }

    private int binToDec(String binary) {
        return Integer.parseInt(binary, 2);
    }

    private String decToBin(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}