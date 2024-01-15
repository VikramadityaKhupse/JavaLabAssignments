public class calci {

    public static void main(String[] args) {
     
        if (args.length < 3) {
            System.out.println("Usage: java calci <operation> <operand1> <operand2>");
            System.exit(1);
        }

        String operation = args[0];
        double operand1 = Double.parseDouble(args[1]);
        double operand2 = Double.parseDouble(args[2]);
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

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    
}

