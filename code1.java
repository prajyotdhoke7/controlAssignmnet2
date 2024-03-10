/*1. Write a program to check whether the given number is in the range of 1 to 1000 or
not.(take hardcoded values)
Input 1: num = 100;
Output: 100 is in the range 1 to 1000.
Input 2: num = 0;
Output: 0 is not in the range 1 to 1000.
Input 3: num = -11;
Output: -11 is not in the range 1 to 1000.*/
class Code1{
	public static void main(String[] args){
		int num=100;
		if( num>0 && num<1000){
			System.out.println(num+"is in the range 1 to 1000.");
		}
		else{
			System.out.println(num + " is not in the range 1 to 1000.");
		}
		int num1=0;
                if( num1>0 && num1<1000){
                        System.out.println(num1+"is in the range 1 to 1000.");
                }
                else{
                        System.out.println(num1 + " is not in the range 1 to 1000.");
                }
		int num2=-11;
                if( num2>0 && num2<1000){
                        System.out.println(num2+"is in the range 1 to 1000.");
                }
                else{
                        System.out.println(num2 + " is not in the range 1 to 1000.");
                }
	}
}
