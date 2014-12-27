public class GenerateGCD{
    public static void main(String [] args) {
        int gcd;
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[0]);
        while (int1 != 0) {
            int2 = int2 % int1;
            int temp;
            temp = int1;
            int1 = int2;
            int2 = temp;
        }
        gcd = int2;
        System.out.println("The Greatest Common Divisor is " + gcd);
    }
}
