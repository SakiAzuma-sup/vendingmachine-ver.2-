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
		public int moneyCheck(int drink, int money, List<String> name, List<Integer> price) {
			int paymore;
			int cost;
			if (money < 100) {
				paymore = more.more80yen () ;
		
				switch(paymore) {
				case 1 :
					System.out.println("------------------------------") ;
					System.out.println("2 | ソーダ | ￥80") ;
					System.out.println("------------------------------") ;
					drink = cheap.chooseCheapItem(drink);
					break ;
				case 2 :
					cost = 100 ;
					addm. addMoney(money, cost) ;
					listp.listProduct (name, price) ;
					drink = itemc.itemChoose () ;
					break ;
				case 9 :
					System.out.println("ありがとうございました。") ;
					System.out.println("またのお越しをお待ちしております。") ;
					System.exit(0);
				}
			}
		
			if (money >= 100) {
				listp.listProduct (name, price) ;
					drink = itemc.itemChoose () ;
			}
			return drink;
		}
	
	}
