package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemChoose {
	
	//���i�I��#############################################################################
	//####################################################################################
		public int itemChoose() {
			int drink = 0 ;
			boolean check = true ;
			while(check) {
			System.out.print("���i�ԍ��F") ;
			BufferedReader tmp2 = new BufferedReader(new InputStreamReader(System.in)) ;
			try {
				String tmp20 = tmp2.readLine() ;
				drink = Integer.valueOf(tmp20) ;
			} catch(IOException e) {
				e.printStackTrace() ;
			}
			switch(drink) {
				case 1 :
					check = false ;
					break ;
				case 2 :
					check = false ;
					break;
				default :
					System.out.println("����������������͂��Ă��������B") ;
					check = true ;
					break ;
			}
			}


			return drink ;
		}

}