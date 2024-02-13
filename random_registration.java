class RegistrationGenerator {
    private static long time = System.currentTimeMillis();


    private static char randChar() {
        String alphabets = "abcdefghijklmnopqrstuvwxyz"; 
        return alphabets.charAt((int)(System.currentTimeMillis()%26));
    }
    private static long randYear() {
	return 	time % 10000;
	    
     }
    
    private static long randLastThree() {
	return 	time % 1000;
	    
     }
    
    
    
    

    private static String generateRegistrationNumber() {
        String registrationNumber;
        // Generate initial 4-digit year
        registrationNumber = Long.toString(randYear());

        // Generate 3 small letters
        registrationNumber += randChar();
        registrationNumber += randChar();
        registrationNumber += randChar();

        // Generate last 3 digits
        registrationNumber += Long.toString(randLastThree());

        return registrationNumber;
    }

    public static void main(String[] args) {
        long startTime, endTime;
        int[] sizes = {1000, 5000, 20000, 50000};
        //System.out.println(generateRegistrationNumber());

        for (int size : sizes) {
            String[] registrations = new String[size];

            
            startTime = System.currentTimeMillis();

            //Generate registration numbers
            for (int i = 0; i < size; i++) {
                registrations[i] = generateRegistrationNumber();
            }

            
            endTime = System.currentTimeMillis();

           
            long elapsedTime = endTime - startTime;

            System.out.println("Time taken to generate " + size + " registration numbers: " + elapsedTime + " milliseconds.");
        }
    }
}

