package azumaS;

import java.util.List;

	public class MoneyCheck {

		private More80yen more = new More80yen();
		private ChooseCheapItem cheap = new ChooseCheapItem();
		private AddMoney addm = new AddMoney();
		private ListProduct listp = new ListProduct();
		private ItemChoose itemc = new ItemChoose();
		
		//��ɓ���############################################################################
		//�Œቿ�i�𒴂����Ƃ��́A���̑���I��########################################################
		public int moneyCheck(int drink, int money, List<String> name, List<Integer> price, List<String> botan, int zankin) {
			int paymore;
			int cost;
			if (money < 100) {
				paymore = more.more80yen () ;
		
				switch(paymore) {
				case 1 :
					//�\�[�_����
					botan.set(0, "�~") ;
					System.out.println("------------------------------") ;
					for (int i=0; i<name.size(); ++i) {
						System.out.println((i+1)+" | "+botan.get(i)+" | "+name.get(i)+" | ��"+price.get(i)) ;
					}
					System.out.println("------------------------------") ;
						//�\�[�_����
					drink = cheap.chooseCheapItem(drink);
					break ;
				case 2 :
					//�����ǉ�����
					cost = 100 ;
						//������ǉ�����
					addm. addMoney(money, cost) ;
						//���X�g�\��
					listp.listProduct (name, price, botan) ;
						//���i�I��
					drink = itemc.itemChoose () ;
					break ;
				case 9 :
					//�I������
					//�V�X�e���I��
					System.out.println("���肪�Ƃ��������܂����B") ;
					System.out.println("�܂��̂��z�������҂����Ă���܂��B") ;
					System.exit(0);
				}
			}
		
			//�ŏ����灏100�����Ă�
			if (money >= 100) {
				//���X�g�\��
				System.out.println("") ;
				System.out.println("���݂̓����z�F��"+money) ;
				System.out.println("���i��I�����Ă��������B") ;
				System.out.println("") ;
				listp.listProduct (name, price, botan) ;
					//���i�I��
					drink = itemc.itemChoose () ;
			}
			return drink;
		}
	
	}
