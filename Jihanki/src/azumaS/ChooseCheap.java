package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseCheap {

	public static int chooseCheapItem(int drink) {
			boolean hatena = true ;
			while (hatena) {
			System.out.print("���i�ԍ��F") ;
			BufferedReader tmp2 = new BufferedReader(new InputStreamReader(System.in)) ;
			try {
				String tmp20 = tmp2.readLine() ;
				drink = Integer.valueOf(tmp20) ;
			} catch(IOException e) {
				e.printStackTrace() ;
			}
			switch(drink) {
			case 2 :
				hatena = false ;
				break ;
			case 1 :
				System.out.println("����������������͂��Ă��������B") ;
				hatena = true ;
				break ;
			default :
				System.out.println("����������������͂��Ă��������B") ;
				hatena = true ;
				break ;
			}
			}
			return drink;
		}
	//##############################################################################

	public ChooseCheap() {
		super();
	}

}