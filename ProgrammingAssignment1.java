//Java code to return count of valid registration numbers according to SGGS format

class SY2022bit052 {
    public static void main(String[] args) {
        
        SY2022bit052 instance = new SY2022bit052();
        int validRegistrationsCount = instance.getValidRegistrationsCount(args);
        System.out.println(validRegistrationsCount);
    }

    public int getValidRegistrationsCount(String[] registrations) {
        int count = 0;

        for (String registration : registrations) {
            registration = registration.strip().toLowerCase();
            if (registration.length() != 10) {
                continue;
            }

            boolean are_initial_4_digit = year_check(registration.substring(0, 4));
            boolean are_middle_3_word = branch_check(registration.substring(4, 7));
            boolean are_last_3_digit = digit_check(registration.substring(7));

            if (are_initial_4_digit && are_last_3_digit && are_middle_3_word) {
                count++;
            }
        }

        return count;
    }

    private boolean branch_check(String string) {
        String[] validDepartments = {"bit", "bcs", "bch", "bme"};
        for (String department : validDepartments) {
            if (string.equals(department)) {
                return true;
            }
        }
        return false;
    }

    private boolean year_check(String year) {
        for(int i = 0; i < year.length(); i++){
            if(!Character.isDigit(year.charAt(i))){

                return false;
            }
        }
        int int_year = Integer.parseInt(year);
        return int_year >= 2000 && int_year <= 2024;
    }

    private boolean digit_check(String input_string){

        for(int i = 0; i < input_string.length(); i++){
            if(!Character.isDigit(input_string.charAt(i))){

                return false;
            }
        }return true;
    }
}



		
	
	
	
		
	






