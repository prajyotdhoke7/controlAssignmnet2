/*5. Write a program to check whether the given float value is divisible by 6 or not. (take
hardcoded values)
Input 1: floatNum = 120f;
Output: 120 is divisible by 6.
Input 2: floatNum = 89.96f;
Output: 89.96 is not divisible by 6.*/
class Code5{
	public static void main(String[] args){
		float num=120f;
		if(num%6==0){
			System.out.println(num + " is divisible by 6.");
		}
		else{
			System.out.println(num+ " is not divisible by 6");
		}
		float num1=89.96f;
                if(num1%6==0){
                        System.out.println(num1 + " is divisible by 6.");
                }
                else{
                        System.out.println(num1+ " is not divisible by 6");
                }
	}
}
