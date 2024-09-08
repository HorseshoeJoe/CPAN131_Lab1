public class Lab1 {
    public static void main(String[] args) {
        //Declare integer variables and results
        int n1 = 16;
        int n2 = 3;
        int result;

        //Operations

        result = n1 + n2;
        System.out.println("Addition: " + result);

        result = n1 - n2;
        System.out.println("Subtraction: " + result);

        result = n1 * n2;
        System.out.println("Multiplication: " + result);

        result = n1 / n2;
        System.out.println("Integer Division: " + result);

        result = n1 % n2;
        System.out.println("Modulo Operator: " + result);

        n1++;
        n2++;
        System.out.println("Increment n1: " + n1);
        System.out.println("Increment n2: " + n2);

        //Declare double variables and results
        double doubleN1 = 16.0;
        double doubleN2 = 3.0;
        double doubleResult;

        //Double operations
        doubleResult = doubleN1 / doubleN2;
        System.out.println("Double Division: " + doubleResult);

        long roundedResult = Math.round(doubleResult);
        System.out.println("Rounded Division: " + roundedResult);

        doubleResult = Math.pow(doubleN1, 3); //cube doubleN1
        System.out.println("doubleN1 Cubed: " + doubleResult);

        doubleResult = Math.sqrt(doubleN2); //square doubleN2
        System.out.println("doubleN2 Squared: " + doubleResult);

    }
}