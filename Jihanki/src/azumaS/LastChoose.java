package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class LastChoose extends AddMoney {

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

	public LastChoose() {
		super();
	}

}