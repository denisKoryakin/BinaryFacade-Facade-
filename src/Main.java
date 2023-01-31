public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        String binary1 = "1000011"; /* 67 */
        String binary2 = "0011101"; /* 29 */
        System.out.println(bins.sum(binary1, binary2));
        System.out.println(bins.mult(binary1, binary2));
    }
}
