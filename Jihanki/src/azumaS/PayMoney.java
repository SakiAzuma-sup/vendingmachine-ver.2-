package azumaS;

import java.util.Scanner;

public class PayMoney {
	
	public int payMoney(int cost) {
		int money = 0 ;
		Scanner scanner = new Scanner(System.in) ;
		
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
