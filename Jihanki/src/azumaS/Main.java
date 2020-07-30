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
		//#####リスト################################	
			List<String> name = new ArrayList<>() ;
				name.add("コーラ") ;
				name.add("ソーダ") ;
				name.add("お茶") ;
				
			List<Integer> price = new ArrayList<>() ;
				price.add(100) ;
				price.add(80) ;
				price.add(120) ;
			
			List<String> message = new ArrayList<>() ;
				message.add("コーラやで") ;
				message.add("ソーダやで") ;
				message.add("お茶やねん") ;
		//#########################################	
				
				
			boolean ok = true ;
			
			while(ok) {
						operation = hajime.first () ;
						
						switch(operation) {
						case 9 :
							//終了する
							//システム終了
							System.out.println("ありがとうございました。") ;
							System.out.println("またのお越しをお待ちしております。") ;
							ok = false ;
							System.exit(0);
							break ;
						
						case 1 :
							//商品選択へ
								//リスト表示
							list.listProduct (name, price) ;
								//商品選択
							this. drink = qdrink.itemChoose () ;
							
							cost = price.get(drink-1) ;
								//入金
							this. money = pmoney.payMoney (cost) ;	
								//最後の選択
							this. last = rlast.lastChoose(drink, last, message) ;
							break ;
							
						case 2 :
							//入金へ
							System.out.println("") ;
							System.out.println("現在、販売中の商品はこちらです。") ;
							System.out.println("") ;
								//リスト表示
							list.listProduct (name, price) ;
								//
							cost = 80 ;
								//入金
							this. money = pmoney.payMoney (cost) ;
								//入金金額チェック
							this. drink = odrink.moneyCheck(drink, money, name, price);
								//最後の選択
							this. last = rlast.lastChoose(drink, last, message) ;	
							break ;
						
						default :
							//1.2.9以外
							System.out.println("※正しい数字を入力してください。") ;
							break ;
						}
			}
	}
}

//##############################################################################
	