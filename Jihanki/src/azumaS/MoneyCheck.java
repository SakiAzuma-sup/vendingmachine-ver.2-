package azumaS;

import java.util.List;

	public class MoneyCheck {

		private More80yen more = new More80yen();
		private ChooseCheapItem cheap = new ChooseCheapItem();
		private AddMoney addm = new AddMoney();
		private ListProduct listp = new ListProduct();
		private ItemChoose itemc = new ItemChoose();
		
		//先に入金############################################################################
		//最低価格を超えたときの、次の操作選択########################################################
		public int moneyCheck(int drink, int money, List<String> name, List<Integer> price,List<Integer> zaiko, List<String> botan, int zankin) {
			int paymore;
			int cost;
			if (money < 100) {
				paymore = more.more80yen () ;
		
				switch(paymore) {
				case 1 :
					//ソーダ買う
					botan.set(0, "×") ;
					System.out.println("------------------------------") ;
					for (int i=0; i<name.size(); ++i) {
						System.out.println((i+1)+" | "+botan.get(i)+" | "+name.get(i)+" | ￥"+price.get(i)) ;
					}
					System.out.println("------------------------------") ;
						//ソーダ買う
					drink = cheap.chooseCheapItem(drink);
					break ;
				case 2 :
					//お金追加する
					cost = 100 ;
						//お金を追加する
					addm. addMoney(money, cost) ;
						//リスト表示
					//botan.set(0,  "〇") ;
					listp.listProduct (name, price, zaiko, botan) ;
						//商品選択
					drink = itemc.itemChoose () ;
					break ;
				case 9 :
					//終了する
					//システム終了
					System.out.println("ありがとうございました。") ;
					System.out.println("またのお越しをお待ちしております。") ;
					System.exit(0);
				}
			}
		
			//最初から￥100超えてる
			if (money >= 100) {
				//リスト表示
				System.out.println("") ;
				System.out.println("現在の入金額：￥"+money) ;
				System.out.println("商品を選択してください。") ;
				System.out.println("") ;
				//botan.set(0,  "〇") ;
				listp.listProduct (name, price, zaiko, botan) ;
					//商品選択
					drink = itemc.itemChoose () ;
			}
			return drink;
		}
	
	}
