package azumaS;

import java.util.Scanner;

public class AddMoney {

	public void addMoney(int money, int cost) {
		
		//��ɓ���#######################################################################
		//�Œ���z�͒����Ă邯�ǁA�ǉ��������Ƃ�##################################################
			Scanner scanner = new Scanner(System.in) ;

					while(money < cost) {
						System.out.println("") ;
						System.out.println("�����𓊓����Ă��������B") ;
						System.out.println("") ;
						System.out.println("���݂̓������z"+money) ;
						System.out.print("�������z�F") ;
						money = money+scanner.nextInt() ;
					}
	}
}
