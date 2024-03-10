/*9. Write a program in java to accept three numbers and check whether they are
pythagorean triplets or not.
Example:
a=3, b=4,c=5
If
a*a+b*b =c*c
Its pythagorean triplet
Else
Not a pythagorean triplet
Input:
a=3,b=4,c=5
Output : it is a pythagorean triplet
Input:
a=2,b=2,c=2
Output : it is not a pythagorean triplet*/
class Code9{
	public static void main(String[] args){
		int a=3;
		int b=4;
		int c=5;
		if(((a*a)+(b*b))==(c*c)){
			System.out.println("Its pythagorean triplet");
		}
		else{
			System.out.println("Not a pythagorean triplet");
		}
		int a1=2;
                int b1=2;
                int c1=2;
                if(((a1*a1)+(b1*b1))==(c1*c1)){
                        System.out.println("Its pythagorean triplet");
                }
                else{
                        System.out.println("Not a pythagorean triplet");
                }
	}
}
