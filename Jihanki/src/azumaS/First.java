package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
	
	//最初の操作選択#######################################################################
	//###################################################################################
		public int first() {
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

