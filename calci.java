public class calci {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        // Parse the command line arguments to integers
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Add the numbers
            int sum = num1 + num2;

            // Display the result
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers as command line arguments.");
        }
    }
}

