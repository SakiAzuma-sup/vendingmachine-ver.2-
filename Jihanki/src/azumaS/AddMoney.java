package azumaS;

import java.util.Scanner;

public class AddMoney {

	public void addMoney(int money, int cost) {
		
		//先に入金#######################################################################
		//最低金額は超えてるけど、追加したいとき##################################################
			Scanner scanner = new Scanner(System.in) ;

					while(money < cost) {
						System.out.println("") ;
						System.out.println("お金を投入してください。") ;
						System.out.println("") ;
						System.out.println("現在の投入金額"+money) ;
						System.out.print("投入金額：") ;
						money = money+scanner.nextInt() ;
					}
	}
}
