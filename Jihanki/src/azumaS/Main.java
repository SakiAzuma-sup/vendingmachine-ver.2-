package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int operation = 0 ;
		int drink = 0 ;
		int money = 0 ;
		int last = 0 ;
		int paymore = 0 ;
		
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
		
		
	boolean ok = true;
	
	while (ok) {
		
				operation = first () ;
				
				switch(operation) {
				case 9 :
					System.out.println("���肪�Ƃ��������܂����B") ;
					System.out.println("�܂��̂��z�������҂����Ă���܂��B") ;
					ok = false ;
					break ;
				
				case 1 :
					listProduct (name, price) ;
					drink = itemChoose () ;
					int cost = price.get(drink-1) ;
					money = payMoney (cost) ;				
					last = lastChoose(drink, last, message) ;
					break ;
					
				case 2 :
					System.out.println("") ;
					System.out.println("���݁A�̔����̏��i�͂�����ł��B") ;
					System.out.println("") ;
					listProduct (name, price) ;
					//
					cost = 80 ;
					//
					money = payMoney (cost) ;
					drink = moneyCheck(drink, money, name, price);
					last = lastChoose(drink, last, message) ;	
					break ;
							
				default :
					System.out.println("����������������͂��Ă��������B") ;
					break ;
				}
	}
	}

	
	
//��ɓ���############################################################################
//�Œቿ�i�𒴂����Ƃ��́A���̑���I��########################################################
	public static int moneyCheck(int drink, int money, List<String> name, List<Integer> price) {
		int paymore;
		int cost;
		if (money < 100) {
			paymore = more80yen () ;
		
		switch(paymore) {
		case 1 :
			System.out.println("------------------------------") ;
			System.out.println("2 | �\�[�_ | ��80") ;
			System.out.println("------------------------------") ;
			drink = chooseCheapItem(drink);
			break ;
		case 2 :
			cost = 100 ;
			addMoney(money, cost) ;
			listProduct (name, price) ;
			break ;
		case 9 :
			System.out.println("���肪�Ƃ��������܂����B") ;
			System.out.println("�܂��̂��z�������҂����Ă���܂��B") ;
			System.exit(0);
		}
		}
		
		if (money >= 100) {
			listProduct (name, price) ;
			drink = itemChoose () ;
		}
		return drink;
	}

//��ɓ���###########################################################################
//�������݂��̂𔃂��Ƃ�##################################################################
	public static int chooseCheapItem(int drink) {
		boolean hatena = true ;
		while (hatena) {
		System.out.print("���i�ԍ��F") ;
		BufferedReader tmp2 = new BufferedReader(new InputStreamReader(System.in)) ;
		try {
			String tmp20 = tmp2.readLine() ;
			drink = Integer.valueOf(tmp20) ;
		} catch(IOException e) {
			e.printStackTrace() ;
		}
		switch(drink) {
		case 2 :
			hatena = false ;
			break ;
		case 1 :
			System.out.println("����������������͂��Ă��������B") ;
			hatena = true ;
			break ;
		default :
			System.out.println("����������������͂��Ă��������B") ;
			hatena = true ;
			break ;
		}
		}
		return drink;
	}
//##############################################################################

	
	
	
//��ɓ���#######################################################################
//�Œ���z�͒����Ă邯�ǁA�ǉ��������Ƃ�##################################################
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

	
	

//�Ō�̑I��(�������𑱂��邩�ۂ�)#######################################################
	public static int lastChoose(int drink, int last, List<String> message) {
		boolean okey = true ;
		while(okey) {
			
			//����I�����
			System.out.println("");
			System.out.println( "����ԍ�����͂��Ă��������B") ;
			System.out.println("------------------------------") ;
			System.out.println("1 | ���i�̏ڍׂ�\��") ;
			System.out.println("2 | �������𑱂���") ;
			System.out.println("9 | �I������");
			System.out.println("------------------------------") ;
			System.out.print("����ԍ��F") ;
		
			//last�ɏI������ԍ�����
			BufferedReader tmp4 = new BufferedReader(new InputStreamReader(System.in)) ;
			try {
				String tmp40 = tmp4.readLine() ;
				last = Integer.valueOf (tmp40) ;
			} catch(IOException e) {
				e.printStackTrace() ;
			}

			okey = lastLast(drink, last, message, okey) ;		
		}
		return last ;
	}
//##################################################################################


	
	
	
//�Ō�̑I��(�������𑱂��邩�ۂ�)�ɉ����āA###################################################
//�s������܂��͕\��������e##############################################################
	public static boolean lastLast(int drink, int last, List<String> message, boolean okey) {
		switch(last) {
		case 9 :
			//�I������
			//�V�X�e���I��
			System.out.println("���肪�Ƃ��������܂����B") ;
			System.out.println("�܂��̂��z�������҂����Ă���܂��B") ;
			okey = false ;
			break ;

		case 1 :
			//�ڍו\��
			System.out.println("") ;
			System.out.println(message.get (drink-1)) ;
			okey = false ;
			break ;
		
		case 2 :
			//�������𑱂���
			//�ŏ��̑I���ɖ߂�
			okey = false ;
			break ;
			
		default :
			System.out.println("����������������͂��Ă��������B") ;
			break;

		}
		return okey ;
	}
//###################################################################################



	
	
//��ɓ���#############################################################################
//�Œ�����𒴂����Ƃ��̑I��###############################################################
	public static int more80yen() {
		int paymore = 0 ;
		System.out.println("���w���\�ȏ��i�F�\�[�_ (��80) ") ;
		System.out.println("") ; 
		System.out.println("����ԍ�����͂��Ă��������B") ;
		System.out.println("") ;
		System.out.println("------------------------------") ;
		System.out.println("1 | ���i��I��") ;
		System.out.println("2 | ������ǉ�����") ;
		System.out.println("9 | �I������") ;
		System.out.println("------------------------------") ;
		System.out.print("����ԍ��F") ;
		
		BufferedReader tmp5 = new BufferedReader(new InputStreamReader(System.in)) ;
		try {
			String tmp50 = tmp5.readLine() ;
			paymore = Integer.valueOf (tmp50) ;
		}catch(IOException e) {
			e.printStackTrace() ;
		}
			
		return paymore ;
	}
//##################################################################################


	

//���i���X�g��\��######################################################################
//##################################################################################
	public static void listProduct(List<String> name, List<Integer> price) {
		//���i�\��
		System.out.println("------------------------------") ;
		for (int i=0; i<name.size(); ++i) {
			System.out.println((i+1)+" | "+name.get(i)+" | "+price.get(i)) ;
		}
		System.out.println("------------------------------") ;
	}
//###################################################################################
	
	
	
	
	
//�ŏ��̓���###########################################################################
	public static int payMoney(int cost) {
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
//###################################################################################

	
	
	
//���i�I��#############################################################################
//####################################################################################
	public static int itemChoose() {
		int drink = 0 ;
		boolean check = true ;
		while(check) {
		System.out.print("���i�ԍ��F") ;
		BufferedReader tmp2 = new BufferedReader(new InputStreamReader(System.in)) ;
		try {
			String tmp20 = tmp2.readLine() ;
			drink = Integer.valueOf(tmp20) ;
		} catch(IOException e) {
			e.printStackTrace() ;
		}
		switch(drink) {
			case 1 :
				check = false ;
				break ;
			case 2 :
				check = false ;
				break;
			default :
				System.out.println("����������������͂��Ă��������B") ;
				check = true ;
				break ;
		}
		}


		return drink ;
	}
//###################################################################################
	
	
	
//�ŏ��̑���I��#######################################################################
//###################################################################################
	public static int first() {
		int operation = 0 ;
		//����I�����
		System.out.println("") ;
		System.out.println("------------------------------") ;
		System.out.println("1 | ���i��I��") ;
		System.out.println("2 | �����𓊓�����") ;
		System.out.println("9 | �I������") ;
		System.out.println("------------------------------") ;
		System.out.print("����ԍ��F") ;
		//operation�ɑ���ԍ�����
		BufferedReader tmp1 = new BufferedReader(new InputStreamReader(System.in)) ;
			try {
				String tmp10 = tmp1.readLine() ;
				operation = Integer.valueOf(tmp10) ;
			}catch(IOException e) {
				e.printStackTrace() ;
			}
		return operation ;
	}
}
//#####################################################################################
