package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemChoose {
	
	//商品選択#############################################################################
	//####################################################################################
		public int itemChoose() {
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
					//コーラ
					check = false ;
					break ;
					
				case 2 :
					//ソーダ
					check = false ;
					break ;
					
				case 3 :
					//お茶
					check = false ;
					break ;
					
				default :
					System.out.println("※正しい数字を入力してください。") ;
					check = true ;
					break ;
			}
			}


			return drink ;
		}

}
