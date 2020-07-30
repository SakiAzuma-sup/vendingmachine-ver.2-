package azumaS;

import java.util.Scanner;

public class AddMoney {

	public void addMoney(int money, int cost) {
		
		//æ‚É“ü‹à#######################################################################
		//Å’á‹àŠz‚Í’´‚¦‚Ä‚é‚¯‚ÇA’Ç‰Á‚µ‚½‚¢‚Æ‚«##################################################
			Scanner scanner = new Scanner(System.in) ;

					while(money < cost) {
						System.out.println("") ;
						System.out.println("‚¨‹à‚ğ“Š“ü‚µ‚Ä‚­‚¾‚³‚¢B") ;
						System.out.println("") ;
						System.out.println("Œ»İ‚Ì“Š“ü‹àŠz"+money) ;
						System.out.print("“Š“ü‹àŠzF") ;
						money = money+scanner.nextInt() ;
					}
	}
}
