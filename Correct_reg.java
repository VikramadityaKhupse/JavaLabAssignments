//Java code to return count of valid registration numbers according to SGGS format
class Correct_reg {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println("Valid registrations count: " + check_reg(args));
    }

    public static int check_reg(String[] args) {
        int count = 0;

        for (String registration : args) {
            if (registration.length() != 10) {
                continue;
            }

            boolean isValid = true;

            for (int j = 0; j < 10; j++) {
                if (j < 3 && !Character.isDigit(registration.charAt(j))) {
                    isValid = false;
                    break;
                }

                if (j > 3 && j < 7) {
                    if (!branch_check(registration.substring(4, 7))) {
                        isValid = false;
                        break;
                    }
                }

                if (j > 6 && !Character.isDigit(registration.charAt(j))) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println(registration);
                count++;
            }
        }

        return count;
    }

    private static boolean branch_check(String string) {
        String[] branches = {"bit", "bec", "bpd", "bel", "bcs"};
        for (String branch : branches) {
            if (string.equals(branch)) {
                return true;
            }
        }
        return false;
    }
}

		
	
	
	
		
	






