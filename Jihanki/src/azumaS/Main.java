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
	
	int operation = 0 ;
	int drink = 0 ;
	int money = 0 ;
	int last = 0 ;
	int cost ;
	
	
	
	
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
		//#########################################	
				
				
			boolean ok = true ;
			
			while(ok) {
						operation = hajime.first () ;
						
						switch(operation) {
						case 9 :
							//�I������
							//�V�X�e���I��
							System.out.println("���肪�Ƃ��������܂����B") ;
							System.out.println("�܂��̂��z�������҂����Ă���܂��B") ;
							ok = false ;
							System.exit(0);
							break ;
						
						case 1 :
							//���i�I����
							list.listProduct (name, price) ;
							this. drink = qdrink.itemChoose () ;
							cost = price.get(drink-1) ;
							this. money = pmoney.payMoney (cost) ;				
							this. last = rlast.lastChoose(drink, last, message) ;
							break ;
							
						case 2 :
							//������
							System.out.println("") ;
							System.out.println("���݁A�̔����̏��i�͂�����ł��B") ;
							System.out.println("") ;
							list.listProduct (name, price) ;
							//
							cost = 80 ;
							//
							this. money = pmoney.payMoney (cost) ;
							this. drink = odrink.moneyCheck(drink, money, name, price);
							this. last = rlast.lastChoose(drink, last, message) ;	
							break ;
						
						default :
							//1.2.9�ȊO
							System.out.println("����������������͂��Ă��������B") ;
							break ;
						}
			}
	}
}

//##############################################################################
	