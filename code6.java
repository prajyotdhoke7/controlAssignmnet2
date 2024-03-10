/*6. Write a program to verify the age of the voter where the age should be positive. (that
means no negative values are allowed, take hardcoded values).
Input 1: 21
Output: Valid age for voting
Input 2: -31
Output: Invalid age*/
class Code6{
	public static void main(String[] args){
		int age=21;
		if( age>=18){
			System.out.println("Valid age for voting");
		}
		else if(age<18&&age>=0){
			System.out.println("Not valid for voting");
		}
		else{
			System.out.println("Invalid age");
		}
		int age1=-31;
                if( age1>=18){
                        System.out.println("Valid age for voting");
                }
                else if(age1<18&&age1>=0){
                        System.out.println("Not valid for voting");
                }
                else{
                        System.out.println("Invalid age");
                }
	}
}	
