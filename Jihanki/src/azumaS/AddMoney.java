package azumaS;

import java.util.Scanner;

public class AddMoney extends ChooseCheap {

	public static void addMoney(int money, int cost) {
			Scanner scanner = new Scanner(System.in) ;
			//drink�̐������g���āA���̒l�i�ɂȂ�܂Ń��[�v�������B
					while(money < cost) {
						System.out.println("") ;
						System.out.println("�����𓊓����Ă��������B") ;
						System.out.println("") ;
						System.out.println("���݂̓������z"+money) ;
						System.out.print("�������z�F") ;
						money = money+scanner.nextInt() ;
					}
		}
	//###############################################################################

	public AddMoney() {
		super();
	}

}