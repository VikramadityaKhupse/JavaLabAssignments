class Correct_reg{
	public static void main(String[] args){
		System.out.println(args.length);
		System.out.println(check_reg(args));

	
	}
	
	public static int check_reg(String[] args){
		int count = 0;
		
		
		for(int i = 0; i < args.length; i++){
			if(args[i].length() != 10){
				continue;
			}
			
			
			boolean starting_4_digit = true;
			boolean ending_3_digit = true;
			boolean middle_3_words = true;
			
			for(int j = 0; j < 10; j++){
			if(j < 3){
				if(!Character.isDigit(args[i].charAt(j))){
					starting_4_digit = false;
				}
			}
			
			if( j > 3 && j < 7){
				
				if(branch_check(args[i].substring(4, 7)) == false){
					middle_3_words = false;				
				}
			}
			
			if( j > 6){
				if(!Character.isDigit(args[i].charAt(j))){
					ending_3_digit = false;
				}
			}
			
			
			}
			if(starting_4_digit && ending_3_digit && middle_3_words){
				System.out.println(args[i]);
				count++;
			
			}
			
			
			
		
		}
		return count;
	}
	
	private static boolean branch_check(String string){
		String[] branches = {"bit", "bec", "bpd", "bel", "bcs"};

		for(int i = 0; i < 5; i++){
			if(string.equals(branches[i])){
			return true;
				
			}
		
		}
		return false;
		
	
	}
	
		
	
}





