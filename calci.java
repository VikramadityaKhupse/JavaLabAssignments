public class calci {
	private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    private static double sum(double n1, double n2) {
        return n1 + n2;
    }
    private static double multi(double n1, double n2) {
        return n1 * n2;
    }
    private static double diff(double n1, double n2) {
        return n1 - n2;
    }
    private static double sqrt(double n1) {
        if (n1 >= 0) {
            return Math.sqrt(n1);
        } else {
            System.out.println("Error: Square root of a negative number is not allowed.");
            System.exit(1);
            return 0;  
        }
    }
    private static double div(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            System.exit(1);
            return 0;  
        }
    }
    private static double mod(double n1, double n2) {
        if (n2 != 0) {
            return n1 % n2;
        } else {
            System.out.println("Error: Modulus by zero is not allowed.");
            System.exit(1);
            return 0;  
        }
    }

    public static void main(String[] args) {
     

        
        String operation = args[0];
        double operand1 = Double.parseDouble(args[1]);
        double operand2 = 0;  

        if (args.length == 3) {
            operand2 = Double.parseDouble(args[2]);
        }
        
        double result = 0;

        switch (operation.toLowerCase()) {
            case "add":
                result = sum(operand1, operand2);
                break;
            case "subtract":
                result = diff(operand1, operand2);
                break;
            case "multiply":
                result = multi(operand1, operand2);
                break;
            case "divide":
                result = div(operand1, operand2);
                break;
            case "modulus":
                result = mod(operand1, operand2);
                break;
            case "power":
                result = Math.pow(operand1, operand2);
                break;
            case "sqrt":
      
                result = sqrt(operand1);
                break;
            case "factorial":
                result = factorial((int) operand1);
                break;
            default:
                System.out.println("Error: Invalid operation.");
                System.exit(1);
        }

        System.out.println("Result: " + result);
    }

    


    
}

