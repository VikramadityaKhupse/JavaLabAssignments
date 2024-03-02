class Father{
	static int balance = 23_00_000;
	String surname = "Gandhi";
	
	public static void main(String[] args){
	
		Father son = new Father();
		Father daughter = new Father();
		System.out.println(son.surname);
		System.out.println(daughter.surname);
		//System.out.println(Father.surname);
		
		son.surname = "Modi";
		daughter.surname = "Giri";
		//Father.surname = "Godse";
		System.out.println(son.surname);
		System.out.println(daughter.surname);
		//System.out.println(Father.surname);
		
		
	
	}	
	

}

