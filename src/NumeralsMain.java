public class NumeralsMain {
    public static void main(String... args) {
        Numerals upto10 = new Numerals(10);
        for (int n : upto10) {
            for (int m : upto10) {
                System.out.println("1%2d/%%m/"+ n + m);

            }
        }
    }
}
