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
				
			List<String> botan = new ArrayList<>() ;
				botan.add("〇") ;
				botan.add("〇") ;
				
		//#########################################	
			int zaikoAll = zaiko.get(0)+zaiko.get(1) ;
				
			boolean ok = true ;
			
			while(ok) {
						operation = hajime.first () ;
						
						switch(operation) {
						case 9 :
							//終了する
							//システム終了
							System.out.println("ありがとうございました。") ;
							System.out.println("またのご利用をお待ちしております。") ;
							ok = false ;
							System.exit(0);
							break ;
						
						case 1 :
							//商品選択へ
								//リスト表示
							list.listProduct (name, price, botan) ;
								//商品選択
							this. drink = qdrink.itemChoose () ;	
							cost = price.get(drink-1) ;
								
//#################################################################################
							switch(drink) {
							case 1 : //コーラ
								if (zaiko.get(0)==0) {
									System.out.println("売り切れです。") ;
									botan.set(0,  "×") ;
								} else {
									zaikoHerasu(drink, zaiko, botan) ;
								}
								break ;
							case 2 : //ソーダ
								if (zaiko.get(1)==0) {
									System.out.println("売り切れです。") ;
									botan.set(1,  "×") ;
								} else {
									zaikoHerasu(drink, zaiko, botan) ;
								}
								break ;
							}
						//	zaikoUmu(drink, name, price, zaiko, botan);
							
							
							
						
		
			
//#################################################################################
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
							list.listProduct (name, price, botan) ;
								//
							cost = 80 ;
								//入金
							this. money = pmoney.payMoney (cost, zankin) ;
								//入金金額チェック
							this. drink = odrink.moneyCheck(drink, money, name, price, botan, zankin) ;
//#################################################################################
							
							if (zaiko.get(drink-1)!=0) {
								zaikoHerasu(drink, zaiko, botan);
							}
							
							zaikoUmu(drink, name, price, zaiko, botan);
							

//#################################################################################
								//残金
							this.zankin = money - price.get(drink-1) ;
								//最後の選択
							this. last = rlast.lastChoose(drink, last, message, zankin) ;	
							break ;
						
						case 3 :
							//在庫を増やす
							zaikoHuyasu(name, price, zaiko, botan);	
							break ;
							
						default :
							//1.2.9以外
							System.out.println("※正しい数字を入力してください。") ;
							break ;
						}
			}
	}




	private void zaikoUmu(int drink, List<String> name, List<Integer> price, List<Integer> zaiko, List<String> botan) {
		while(zaiko.get(drink-1)==0) {
			if (zaiko.get(0)==0&&zaiko.get(1)==0) {
				System.out.println("商品は完売いたしました。") ;
				System.out.println("商品を補充しますか?") ;
				System.out.println("1 | 商品を補充する") ;
				System.out.println("9 | 終了する") ;
				System.out.print("商品番号：") ;
				BufferedReader tmp20 = new BufferedReader(new InputStreamReader(System.in)) ;
				try {
					String tmp200 = tmp20.readLine() ;
					this.sousa = Integer.valueOf(tmp200) ;
				} catch(IOException e) {
					e.printStackTrace() ;
				}
				switch (sousa) {
				case 1 : 
					//在庫を増やす
					drink = zaikoHuyasu(name, price, zaiko, botan) ;
					botan.set(drink-1,  "〇") ;
					break ;
				case 9 :
					//終了する
					//システム終了
					System.out.println("ありがとうございました。") ;
					System.out.println("またのお越しをお待ちしております。") ;
					System.exit(0);
					break ;
				}
			} else {
			System.out.println("在庫がありません。") ;
			botan.set(drink-1,  "×") ;
			list.listProduct (name, price, botan) ;
			this. drink = qdrink.itemChoose () ;	
		}
		}
	}




	private void zaikoHerasu(int drink, List<Integer> zaiko, List<String> botan) {
		//在庫を減らす
		zaiko.set(drink-1, zaiko.get(drink-1)-1) ;	
		System.out.println("在庫数："+zaiko.get(drink-1)) ;
			if (zaiko.get(drink-1) == 0) {
				botan.set(drink-1,  "×") ;
			}
	}




	private int zaikoHuyasu(List<String> name, List<Integer> price, List<Integer> zaiko, List<String> botan) {
		//在庫管理
		System.out.println("") ;
		System.out.println("補充する商品を入力してください。") ;
		System.out.println("") ;
		list.listProduct (name, price,botan) ;
		this. drink = qdrink.itemChoose () ;
		zaiko.set(drink-1, zaiko.get(drink-1)+1) ;	
		botan.set(drink-1,  "〇") ;
		System.out.println("現在の"+name.get(drink-1)+"の"+"在庫は："+zaiko.get(drink-1)+"本です。") ;
		return drink ;
	}
	
	//private void zaikoGen ( List<Integer>zaiko) {
		// TODO 自動生成されたメソッド・スタブ
		
		//zaiko.set(drink-1, 2);	
	//}

	
	
}

//##############################################################################






