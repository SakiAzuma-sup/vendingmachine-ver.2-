package azumaS;

import java.util.Scanner;

public class AddMoney extends ChooseCheap {

	public static void addMoney(int money, int cost) {
			Scanner scanner = new Scanner(System.in) ;
			//drinkの数字を使って、その値段になるまでループしたい。
					while(money < cost) {
						System.out.println("") ;
						System.out.println("お金を投入してください。") ;
						System.out.println("") ;
						System.out.println("現在の投入金額"+money) ;
						System.out.print("投入金額：") ;
						money = money+scanner.nextInt() ;
					}
		}
	//###############################################################################

	public AddMoney() {
		super();
	}

}