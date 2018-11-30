public class Calculator {
    public void sumOfAB(double a, double b) {
        double sum = a + b;
        System.out.print(sum);
    }
    public void subtractBFromA (double a, double b) {
        double subtraction = a - b;
        System.out.println(subtraction);
    }
    public static void main(String args[]) {
        Calculator calculate = new Calculator();
        calculate.subtractBFromA(2,4);
        calculate.sumOfAB(6,8);
    }

}


