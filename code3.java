/*3.Write a program to check whether the given character is a vowel or consonant.(take hard
coded values)
Input 1: ‘a’
Output: a is vowel
Input 2: ‘D’
Output: D is consonant*/
class Code3{
	public static void main(String[] args){
		char ch= 'a';
		if(ch=='a' || ch=='e'||ch=='o'||ch=='i'||ch=='u'){
			System.out.println(ch+ " is vowel");
				}
		else{	
			System.out.println(ch+ " is consonant");
		}
		char ch2= 'd';
                if(ch2=='a' || ch2=='e'||ch2=='o'||ch2=='i'||ch2=='u'){
                        System.out.println(ch2+ " is vowel");
                                }
                else{
                        System.out.println(ch2+ " is consonant");
                }
	}
}
