/*8. Write a program to check whether the student passed with:
first class with distinction, first class, second class, pass and fail according to his percent
grades. (You have to adjust range by your own for first class, second class and for pass)
Input 1: percent= 85.00
Output: Passed : first class with distinction
Input 2: percent=75.00
Output: Passed : first class with distinction
Input 3: percent=60.00
Output: Passed : first class

Input 4: percent=54.00
Output: Passed : second class
Input: percent=47
Output: Pass*/
class Code8{
	public static void main(String[] args){
		float per=85.00f;
		if(per>=75.00){
			System.out.println("Passed : first class with distinction");
		}
		else if(per>=60.00){
			 System.out.println("Passed : first class ");
                }
		else if(per>47.00){
                         System.out.println("Passed : second class ");
		}
		else if(per>33.00){
                         System.out.println("Passed");
		}
		else{	
                         System.out.println("Fail");
		}
		float per1=75.00f;
                if(per1>=75.00){
                        System.out.println("Passed : first class with distinction");
                }
                else if(per1>=60.00){
                         System.out.println("Passed : first class ");                                                                                                       }
                else if(per1>47.00){
                         System.out.println("Passed : second class ");                                                                                                      }
                else if(per1>33.00){
                         System.out.println("Passed");
                }
                else{                                                                                                                                                                System.out.println("Fail");
                }
		float per2=54.00f;
                if(per2>=75.00){
                        System.out.println("Passed : first class with distinction");
                }
                else if(per2>=60.00){
                         System.out.println("Passed : first class ");                                                                                                       }
                else if(per2>47.00){
                         System.out.println("Passed : second class ");                                                                                                      }
                else if(per2>33.00){
                         System.out.println("Passed");
                }
                else{                                                                                                                                                                System.out.println("Fail");
                }
		float per3=47.00f;
                if(per3>=75.00){
                        System.out.println("Passed : first class with distinction");
                }
                else if(per3>=60.00){
                         System.out.println("Passed : first class ");                                                                                                       }
                else if(per3>47.00){
                         System.out.println("Passed : second class ");                                                                                                      }
                else if(per3>33.00){
                         System.out.println("Passed");
                }
                else{                                                                                                                                                                System.out.println("Fail");
                }
	}
}



