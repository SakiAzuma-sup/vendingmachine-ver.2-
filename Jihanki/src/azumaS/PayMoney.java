package azumaS;

import java.util.Scanner;

public class PayMoney {
	
	//“ü‹à#################################################################################
	//####################################################################################
	public int payMoney(int cost, int zankin) {
		int money = 0 ;
		Scanner scanner = new Scanner(System.in) ;
		
		money = zankin ;
		
		while(money < cost) {
			System.out.println("") ;
			System.out.println("‚¨‹à‚ð“Š“ü‚µ‚Ä‚­‚¾‚³‚¢B") ;
			System.out.println("") ;
			System.out.println("Œ»Ý‚Ì“Š“ü‹àŠz"+money) ;
			System.out.print("“Š“ü‹àŠzF") ;
			money = money+scanner.nextInt() ;
		}

		return money;
	}

}
