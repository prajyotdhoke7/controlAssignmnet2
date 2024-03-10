/*7. Calculate the profit or loss.
Write a program that takes cost price and selling price(take it hardcoded) and calculates its
profit or loss.
Input 1:
sellingPrice: 1200
costPrice: 1000
Output: Profit of 200
Input 2:
sellingPrice: 300
costPrice: 500
Output: loss of 200
Input 3:
sellingPrice: 900
costPrice: 900
Output: No profit no loss*/
class Code7{
	public static void main(String[] args){
		int sellingPrice=1200;
		int costPrice=1000;
		if(sellingPrice>costPrice){
			System.out.println("Profit of "+(sellingPrice-costPrice));
		}
		else if(sellingPrice==costPrice){
			System.out.println("No profit no lose");
		}
		else{
			System.out.println("Lose of "+(costPrice-sellingPrice));
		}
		int sellingPrice1=300;
                int costPrice1=500;
                if(sellingPrice1>costPrice1){
                        System.out.println("Profit of "+(sellingPrice1-costPrice1));
                }
		else if(sellingPrice1==costPrice1){
                        System.out.println("No profit no lose");
                }
                else{
                        System.out.println("Lose of "+(costPrice1-sellingPrice1));
                }
		int sellingPrice2=900;
                int costPrice2=900;
                if(sellingPrice2>costPrice2){
                        System.out.println("Profit of "+(sellingPrice2-costPrice2));
                }
		else if(sellingPrice2==costPrice2){
                        System.out.println("No profit no lose");
                }
                else{
                        System.out.println("Lose of "+(costPrice2-sellingPrice2));
                }
	}
}
