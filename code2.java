/*2. Write a program to check whether the given number is in the table of 13 or not.
Input 1: num =156;
Output: 156 is in the table of 13
Input 2: num =144;
Output: 144 is not in the table of 13*/
class Code2{
	public static void main(String[] args){
		int num1=156;
		if(num1%13==0){
			System.out.println(num1+" is in the table of 13.");
		}
		else{
			System.out.println(num1+" is not in table of 13.");
		}
		int num2=144;
                if(num2%13==0){
                        System.out.println(num2+" is in the table of 13.");
                }
                else{
                        System.out.println(num2+" is not in table of 13.");
                }
	}
}



