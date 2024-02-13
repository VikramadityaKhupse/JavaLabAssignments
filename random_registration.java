private class CustomRandomGenerator {
    private static long seed = System.currentTimeMillis();
    
   
    private static final long MULTIPLIER = 1103515245L;
    private static final long INCREMENT = 12345L;
    private static final long MODULUS = (long) Math.pow(2, 31);
    
    public static int nextInt() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return (int) seed;
    }
    
    public static char nextChar() {
        int randomInt = nextInt();
        return (char) ('a' + randomInt % 26);
    }
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.print(nextInt() + " ");
        }
        System.out.println();
        
        for (int i = 0; i < 10; i++) {
            System.out.print(nextChar() + " ");
        }
        System.out.println();
    }
}

