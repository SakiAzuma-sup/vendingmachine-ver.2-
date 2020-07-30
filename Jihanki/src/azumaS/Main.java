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
	int nokori ;
	int zankin = 0 ;
	
	
	
	
	public static void main(String[] args) {
	
	Main jihankiObj = new Main() ;
	jihankiObj. jihanki() ;
	
	}

	
	
	
	private void jihanki() {
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
				
			List<Integer> zaiko = new ArrayList<>() ;
				zaiko.add(1) ;
				zaiko.add(1) ;
				zaiko.add(1) ;
				
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
							this. money = pmoney.payMoney (cost, zankin) ;	
								//残金
							this. zankin = money - cost ;
								//最後の選択
							this. last = rlast.lastChoose(drink, last, message, zankin) ;
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
							this. money = pmoney.payMoney (cost, zankin) ;
								//入金金額チェック
							this. drink = odrink.moneyCheck(drink, money, name, price, zankin) ;
								//残金
							this.zankin = money - price.get(drink-1) ;
								//最後の選択
							this. last = rlast.lastChoose(drink, last, message, zankin) ;	
							break ;
						
						case 3 :
							//在庫管理
							System.out.println("") ;
							System.out.println("補充する商品を入力してください。") ;
							System.out.println("") ;
							list.listProduct (name, price) ;
							this. drink = qdrink.itemChoose () ;

							
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
	