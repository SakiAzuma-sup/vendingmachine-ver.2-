package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class More80yen extends LastChoose {

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

	public More80yen() {
		super();
	}

}