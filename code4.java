/*4. A student has passed his 12 th standard exam he thinks he might get marks upto 85
percent. Suggest the better career field depending upon the marks assumption.(take
hardcoded values)
Input 1: percentage >85.00;
Output: Medical
Input 2: percentage <=85.00 and percentage >75.00;
Output: Engineering;
Input 1: percentage<=75.00 and percentage>=65.00;
Output: pharmacy or bachelor in science;
You have to write the code using different values of percentage.*/
class Code4{
	public static void main(String[] args){
		float per=86.95f;
		if(per>85.00){
			System.out.println("Medical");
		}
		else if(per<=85.00 && per>75.00){
			System.out.println("Engineering");
		}
		else if(per<=75.00 && per>=65.00){
			System.out.println("Pharmacy or bachelor in science");
		}
		else{
			System.out.println("Bhai Dukan is best");
		}
		float per1=81.95f;
                if(per>85.00){
                        System.out.println("Medical");
                }
                else if(per1<=85.00 && per1>75.00){
                        System.out.println("Engineering");
                }
                else if(per1<=75.00 && per1>=65.00){
                        System.out.println("Pharmacy or bachelor in science");
                }
                else{
                        System.out.println("Bhai Dukan is best");
                }
		float per2=76.95f;
                if(per2>85.00){
                        System.out.println("Medical");
                }
                else if(per2<=85.00 && per2>75.00){
                        System.out.println("Engineering");
                }
                else if(per2<=75.00 && per2>=65.00){
                        System.out.println("Pharmacy or bachelor in science");
                }
                else{
                        System.out.println("Bhai Dukan is best");
                }
		float per3=46.95f;
                if(per3>85.00){
                        System.out.println("Medical");
                }
                else if(per3<=85.00 && per3>75.00){
                        System.out.println("Engineering");
                }
                else if(per3<=75.00 && per3>=65.00){
                        System.out.println("Pharmacy or bachelor in science");
                }
                else{
                        System.out.println("Bhai Dukan is best");
                }
	}
}

