package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class LastChoose {

	public int lastChoose(int drink, int last, List<String> message, int zankin) {
		
		//最後の選択(買い物を続けるか否か)#######################################################
		boolean okey = true ;
		while(okey) {
			
			//操作選択画面
			System.out.println("") ;
			System.out.println("現在の入金額：￥"+zankin) ;
			System.out.println("") ;
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

			okey = lastLast(drink, last, message, okey, zankin) ;		
		}
		return last ;
	}
	
	
		public boolean lastLast(int drink, int last, List<String> message, boolean okey, int zankin) {
			
			//最後の選択(買い物を続けるか否か)に応じて、###################################################
			//行う操作または表示する内容##############################################################
			switch(last) {
			case 9 :
				//終了する
				//システム終了
				System.out.println("") ;
				System.out.println("お釣り：￥"+zankin) ;
				System.out.println("ありがとうございました。") ;
				System.out.println("またのお越しをお待ちしております。") ;
				okey = false ;
				System.exit(0);
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
	
}
