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
		public int moneyCheck(int drink, int money, List<String> name, List<Integer> price, int zankin) {
			int paymore;
			int cost;
			if (money < 100) {
				paymore = more.more80yen () ;
		
				switch(paymore) {
				case 1 :
					//�\�[�_����
					System.out.println("------------------------------") ;
					System.out.println("1 | �~ | �R�[�� | ��100") ;
					System.out.println("2 | �Z | �\�[�_ | ��80") ;
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
					listp.listProduct (name, price) ;
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
				System.out.println("���݂̓����z�F��"+zankin) ;
				System.out.println("���i��I�����Ă��������B") ;
				System.out.println("") ;
				listp.listProduct (name, price) ;
					//���i�I��
					drink = itemc.itemChoose () ;
			}
			return drink;
		}
	
	}
