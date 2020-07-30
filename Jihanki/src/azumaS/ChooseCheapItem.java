package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseCheapItem {
	
	public int chooseCheapItem(int drink) {
		
		//先に入金###########################################################################
		//安い飲みものを買うとき##################################################################
		boolean hatena = true ;
		while (hatena) {
		System.out.print("商品番号：") ;
		BufferedReader tmp2 = new BufferedReader(new InputStreamReader(System.in)) ;
		try {
			String tmp20 = tmp2.readLine() ;
			drink = Integer.valueOf(tmp20) ;
		} catch(IOException e) {
			e.printStackTrace() ;
		}
		switch(drink) {
		case 2 :
			//ソーダ
			hatena = false ;
			break ;
		case 1 :
			//コーラ
			//お金足りひんから無理
			System.out.println("※正しい数字を入力してください。") ;
			hatena = true ;
			break ;
		case 3 :
			//お茶
			//お金足りひんから無理
			System.out.println("※正しい数字を入力してください。") ;
			hatena = true ;
			break ;
		default :
			//1.2以外
			System.out.println("※正しい数字を入力してください。") ;
			hatena = true ;
			break ;
		}
		}
		return drink;
	}
	
	
}


