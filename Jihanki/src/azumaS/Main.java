package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	Scanner scanner=new Scanner(System.in) ;
	private AddMoney omoney = new AddMoney () ;
	private MoneyCheck odrink = new MoneyCheck () ;
	private ChooseCheapItem pdrink = new ChooseCheapItem () ;
	private First ooperation = new First () ;
	private ItemChoose qdrink = new ItemChoose () ;
	private ListProduct list = new ListProduct () ;
	private More80yen paymore = new More80yen () ;
	private PayMoney pmoney = new PayMoney () ;
	private LastChoose rlast = new LastChoose () ;
	private First hajime = new First () ;
	//private ZaikoCheck zaikook = new ZaikoCheck () ;
	
	int operation = 0 ;
	int drink = 0 ;
	int money = 0 ;
	int last = 0 ;
	int cost ;
	int nokori ;
	int zankin = 0 ;
	int sousa ;
	
	
	
	
	
	public static void main(String[] args) {
	
	Main jihankiObj = new Main() ;
	jihankiObj. jihanki() ;
	
	}

	
	
	
	private void jihanki() {
		//#####���X�g################################	
			List<String> name = new ArrayList<>() ;
				name.add("�R�[��") ;
				name.add("�\�[�_") ;
				
			List<Integer> price = new ArrayList<>() ;
				price.add(100) ;
				price.add(80) ;
			
			List<String> message = new ArrayList<>() ;
				message.add("�R�[�����") ;
				message.add("�\�[�_���") ;
				
			List<Integer> zaiko = new ArrayList<>() ;
				zaiko.add(1) ;
				zaiko.add(1) ;
				
			List<String> botan = new ArrayList<>() ;
				botan.add("�Z") ;
				botan.add("�Z") ;
				
		//#########################################	

				
			boolean ok = true ;
			
			while(ok) {
						operation = hajime.first () ;
						
						switch(operation) {
						case 9 :
							//�I������
							//�V�X�e���I��
							System.out.println("���肪�Ƃ��������܂����B") ;
							System.out.println("�܂��̂����p�����҂����Ă���܂��B") ;
							ok = false ;
							System.exit(0);
							break ;
							
//#################################################################################						
						case 1 :
							//���i�I����
								//���X�g�\��
							list.listProduct (name, price, botan) ;
							
								//���i�I��
							this. drink = qdrink.itemChoose () ;	
							cost = price.get(drink-1) ;
							
							//�݌Ƀ`�F�b�N
							zaikoHojuu(name, price, zaiko, botan);
							
								//�݌ɊǗ�
							zaikoCheck(zaiko, botan);
							
							//����
							this. money = pmoney.payMoney (cost, zankin) ;	
							
								//�c��
							this. zankin = money - cost ;
							
								//�Ō�̑I��
							this. last = rlast.lastChoose(drink, last, message, zankin) ;
							break ;

//#################################################################################
						case 2 :
							//������
							System.out.println("") ;
							System.out.println("���݁A�̔����̏��i�͂�����ł��B") ;
							System.out.println("") ;
							
								//���X�g�\��
							list.listProduct (name, price, botan) ;
							
								//
							cost = 80 ;
							
								//����
							this. money = pmoney.payMoney (cost, zankin) ;
							
								//�������z�`�F�b�N
							this. drink = odrink.moneyCheck(drink, money, name, price, botan, zankin) ;
							
								//�݌Ƀ`�F�b�N
							zaikoHojuu(name, price, zaiko, botan);
							
								//�݌ɊǗ�
							zaikoCheck(zaiko, botan);
							
								//�c��
							this.zankin = money - price.get(drink-1) ;
							
								//�Ō�̑I��
							this. last = rlast.lastChoose(drink, last, message, zankin) ;	
							break ;
						
//#################################################################################
						case 3 :
							//�݌ɂ𑝂₷
							zaikoHuyasu(name, price, zaiko, botan);	
							break ;
							
//#################################################################################
						default :
							//1.2.9�ȊO
							System.out.println("����������������͂��Ă��������B") ;
							break ;
						}
			}
	}


/*
//�݌Ƀ`�F�b�N
 */
	private void zaikoHojuu(List<String> name, List<Integer> price, List<Integer> zaiko, List<String> botan) {
		//�������Ă���
		if (zaiko.get(0)==0&&zaiko.get(1)==0) {
			System.out.println("") ;
			System.out.println("�������܂����B") ;
			System.out.println("���i���[���܂���?") ;
			System.out.println("1 | ���i���[����") ;
			System.out.println("9 | �I������") ;
			System.out.print("���i�ԍ��F") ;
			BufferedReader tmp20 = new BufferedReader(new InputStreamReader(System.in)) ;
			try {
				String tmp200 = tmp20.readLine() ;
				sousa = Integer.valueOf(tmp200) ;
			} catch(IOException e) {
				e.printStackTrace() ;
			}
			switch (sousa) {
			case 1 : 
				//�݌ɂ𑝂₷
				drink = zaikoHuyasu(name, price, zaiko, botan) ;
				break ;
			case 9 :
				//�I������
				//�V�X�e���I��
				System.out.println("���肪�Ƃ��������܂����B") ;
				System.out.println("�܂��̂��z�������҂����Ă���܂��B") ;
				System.exit(0);
				break ;
			}
		}
	}



/*
	//�݌ɊǗ�
*/
	private void zaikoCheck(List<Integer> zaiko, List<String> botan) {
		//�݌Ƀ`�F�b�N
		switch(drink) {
		case 1 : //�R�[��
			//�R�[���̍݌ɂ��Ȃ��Ƃ�
			//����؂�\��
			if (zaiko.get(0)==0) {
				System.out.println("����؂�ł��B") ;
				botan.set(0,  "�~") ;
			//�R�[���̍݌ɂ�����Ƃ�
			//�݌ɂ�1���₷
			} else {
				zaikoHerasu(drink, zaiko, botan) ;
			}
			break ;
		case 2 : //�\�[�_
			//�\�[�_�̍݌ɂ��Ȃ��Ƃ�
			//����؂�\��
			if (zaiko.get(1)==0) {
				System.out.println("����؂�ł��B") ;
				botan.set(1,  "�~") ;
			//�\�[�_�̍݌ɂ���Ƃ�
			//�݌ɂ�1���炷
			} else {
				zaikoHerasu(drink, zaiko, botan) ;
			}
			break ;
		}
	}


/*
//�݌ɂ����炷
*/
	private void zaikoHerasu(int drink, List<Integer> zaiko, List<String> botan) {
		//�݌ɂ����炷
		zaiko.set(drink-1, zaiko.get(drink-1)-1) ;	
			if (zaiko.get(drink-1) == 0) {
				botan.set(drink-1,  "�~") ;
			}
	}


/*
//�݌ɂ𑝂₷
 */
	public int zaikoHuyasu(List<String> name, List<Integer> price, List<Integer> zaiko, List<String> botan) {
		//�݌ɊǗ�
		System.out.println("") ;
		System.out.println("��[���鏤�i����͂��Ă��������B") ;
		System.out.println("") ;
		list.listProduct (name, price,botan) ;
		this. drink = qdrink.itemChoose () ;
		zaiko.set(drink-1, zaiko.get(drink-1)+1) ;	
		botan.set(drink-1,  "�Z") ;
		System.out.println("���݂�"+name.get(drink-1)+"��"+"�݌ɂ́F"+zaiko.get(drink-1)+"�{�ł��B") ;
		System.out.println("------------------------------") ;
		for (int i=0; i<name.size(); ++i) {
			System.out.println((i+1)+" | "+botan.get(i)+" | "+name.get(i)+" | ��"+price.get(i)) ;
		}
		System.out.println("------------------------------") ;
		return drink ;
	}
	
	
}







