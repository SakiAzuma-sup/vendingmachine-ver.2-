package azumaS;

import java.util.Scanner;

public class PayMoney {
	
	//入金#################################################################################
	//####################################################################################
	public int payMoney(int cost, int zankin) {
		int money = 0 ;
		Scanner scanner = new Scanner(System.in) ;
		
		money = zankin ;
		
		while(money < cost) {
			System.out.println("") ;
			System.out.println("お金を投入してください。") ;
			System.out.println("") ;
			System.out.println("現在の投入金額"+money) ;
			System.out.print("投入金額：") ;
			money = money+scanner.nextInt() ;
		}

		return money;
	}

}
