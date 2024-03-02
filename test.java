class test{
	
	int num = 100;
	
	static public void main(String[] args){
	

		
		System.out.println(isPrimeApproach1(2));
		System.out.println(isPrimeApproach1(13));
		System.out.println(isPrimeApproach1(11));
		System.out.println(isPrimeApproach1(49));
		System.out.println(isPrimeApproach1(91));
		System.out.println('\n');
		System.out.println(isPrimeApproach2(2));
		System.out.println(isPrimeApproach2(13));
		System.out.println(isPrimeApproach2(11));
		System.out.println(isPrimeApproach2(49));
		System.out.println(isPrimeApproach2(91));
		
		
	
	
	}

	
	private static boolean isPrimeApproach1(int number) {
        for (int i = 2; i < 10; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPrimeApproach2(long number) {
        for (int i = 2; i < 10; i++) {
            if (number % i != 0) {
                continue;
            }else{
            	return false;
            }
        }
        return true;
    }
	
	
	
	
	
}
