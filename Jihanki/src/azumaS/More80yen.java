package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class More80yen extends LastChoose {

	public static int more80yen() {
			int paymore = 0 ;
			System.out.println("���w���\�ȏ��i�F�\�[�_ (��80) ") ;
			System.out.println("") ; 
			System.out.println("����ԍ�����͂��Ă��������B") ;
			System.out.println("") ;
			System.out.println("------------------------------") ;
			System.out.println("1 | ���i��I��") ;
			System.out.println("2 | ������ǉ�����") ;
			System.out.println("9 | �I������") ;
			System.out.println("------------------------------") ;
			System.out.print("����ԍ��F") ;
			
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