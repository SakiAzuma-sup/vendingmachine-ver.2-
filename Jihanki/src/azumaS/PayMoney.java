package azumaS;

import java.util.Scanner;

public class PayMoney {
	
	public int payMoney(int cost) {
		int money = 0 ;
		Scanner scanner = new Scanner(System.in) ;
		
		while(money < cost) {
			System.out.println("") ;
			System.out.println("�����𓊓����Ă��������B") ;
			System.out.println("") ;
			System.out.println("���݂̓������z"+money) ;
			System.out.print("�������z�F") ;
			money = money+scanner.nextInt() ;
		}

		return money;
	}

}
