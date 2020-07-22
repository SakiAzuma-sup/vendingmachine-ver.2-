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
		
//#####リスト################################	
		List<String> name = new ArrayList<>() ;
		name.add("コーラ") ;
		name.add("ソーダ") ;
		
	List<Integer> price = new ArrayList<>() ;
		price.add(100) ;
		price.add(80) ;
	
	List<String> message = new ArrayList<>() ;
		message.add("コーラやで") ;
		message.add("ソーダやで") ;
//#########################################	
		
		
	boolean ok = true;
	
	while (ok) {
		
				operation = first () ;
				
				switch(operation) {
				case 9 :
					System.out.println("ありがとうございました。") ;
					System.out.println("またのお越しをお待ちしております。") ;
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
					System.out.println("現在、販売中の商品はこちらです。") ;
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
					System.out.println("※正しい数字を入力してください。") ;
					break ;
				}
	}
	}

	
	
//先に入金############################################################################
//最低価格を超えたときの、次の操作選択########################################################
	public static int moneyCheck(int drink, int money, List<String> name, List<Integer> price) {
		int paymore;
		int cost;
		if (money < 100) {
			paymore = more80yen () ;
		
		switch(paymore) {
		case 1 :
			System.out.println("------------------------------") ;
			System.out.println("2 | ソーダ | ￥80") ;
			System.out.println("------------------------------") ;
			drink = chooseCheapItem(drink);
			break ;
		case 2 :
			cost = 100 ;
			addMoney(money, cost) ;
			listProduct (name, price) ;
			break ;
		case 9 :
			System.out.println("ありがとうございました。") ;
			System.out.println("またのお越しをお待ちしております。") ;
			System.exit(0);
		}
		}
		
		if (money >= 100) {
			listProduct (name, price) ;
			drink = itemChoose () ;
		}
		return drink;
	}

//先に入金###########################################################################
//安い飲みものを買うとき##################################################################
	public static int chooseCheapItem(int drink) {
		boolean hatena = true ;
		while (hatena) {
		System.out.print("商品番号：") ;
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
			System.out.println("※正しい数字を入力してください。") ;
			hatena = true ;
			break ;
		default :
			System.out.println("※正しい数字を入力してください。") ;
			hatena = true ;
			break ;
		}
		}
		return drink;
	}
//##############################################################################

	
	
	
//先に入金#######################################################################
//最低金額は超えてるけど、追加したいとき##################################################
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

	
	

//最後の選択(買い物を続けるか否か)#######################################################
	public static int lastChoose(int drink, int last, List<String> message) {
		boolean okey = true ;
		while(okey) {
			
			//操作選択画面
			System.out.println("");
			System.out.println( "操作番号を入力してください。") ;
			System.out.println("------------------------------") ;
			System.out.println("1 | 商品の詳細を表示") ;
			System.out.println("2 | 買い物を続ける") ;
			System.out.println("9 | 終了する");
			System.out.println("------------------------------") ;
			System.out.print("操作番号：") ;
		
			//lastに終了操作番号を代入
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


	
	
	
//最後の選択(買い物を続けるか否か)に応じて、###################################################
//行う操作または表示する内容##############################################################
	public static boolean lastLast(int drink, int last, List<String> message, boolean okey) {
		switch(last) {
		case 9 :
			//終了する
			//システム終了
			System.out.println("ありがとうございました。") ;
			System.out.println("またのお越しをお待ちしております。") ;
			okey = false ;
			break ;

		case 1 :
			//詳細表示
			System.out.println("") ;
			System.out.println(message.get (drink-1)) ;
			okey = false ;
			break ;
		
		case 2 :
			//買い物を続ける
			//最初の選択に戻る
			okey = false ;
			break ;
			
		default :
			System.out.println("※正しい数字を入力してください。") ;
			break;

		}
		return okey ;
	}
//###################################################################################



	
	
//先に入金#############################################################################
//最低賃金を超えたときの選択###############################################################
	public static int more80yen() {
		int paymore = 0 ;
		System.out.println("※購入可能な商品：ソーダ (￥80) ") ;
		System.out.println("") ; 
		System.out.println("操作番号を入力してください。") ;
		System.out.println("") ;
		System.out.println("------------------------------") ;
		System.out.println("1 | 商品を選ぶ") ;
		System.out.println("2 | お金を追加する") ;
		System.out.println("9 | 終了する") ;
		System.out.println("------------------------------") ;
		System.out.print("操作番号：") ;
		
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


	

//商品リストを表示######################################################################
//##################################################################################
	public static void listProduct(List<String> name, List<Integer> price) {
		//商品表示
		System.out.println("------------------------------") ;
		for (int i=0; i<name.size(); ++i) {
			System.out.println((i+1)+" | "+name.get(i)+" | "+price.get(i)) ;
		}
		System.out.println("------------------------------") ;
	}
//###################################################################################
	
	
	
	
	
//最初の入金###########################################################################
	public static int payMoney(int cost) {
		int money = 0 ;
		Scanner scanner = new Scanner(System.in) ;
		
		while(money < cost) {
			System.out.println("") ;
			System.out.println("お金を投入してください。") ;
			System.out.println("") ;
			System.out.println("現在の投入金額"+money) ;
			System.out.print("投入金額：") ;
			money = money+scanner.nextInt() ;
		}

		return money;
	}
//###################################################################################

	
	
	
//商品選択#############################################################################
//####################################################################################
	public static int itemChoose() {
		int drink = 0 ;
		boolean check = true ;
		while(check) {
		System.out.print("商品番号：") ;
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
				System.out.println("※正しい数字を入力してください。") ;
				check = true ;
				break ;
		}
		}


		return drink ;
	}
//###################################################################################
	
	
	
//最初の操作選択#######################################################################
//###################################################################################
	public static int first() {
		int operation = 0 ;
		//操作選択画面
		System.out.println("") ;
		System.out.println("------------------------------") ;
		System.out.println("1 | 商品を選ぶ") ;
		System.out.println("2 | お金を投入する") ;
		System.out.println("9 | 終了する") ;
		System.out.println("------------------------------") ;
		System.out.print("操作番号：") ;
		//operationに操作番号を代入
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
