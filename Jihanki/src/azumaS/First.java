package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
	
	//�ŏ��̑���I��#######################################################################
	//###################################################################################
		public int first() {
			int operation = 0 ;
			//����I�����
			System.out.println("") ;
			System.out.println("------------------------------") ;
			System.out.println("1 | ���i��I��") ;
			System.out.println("2 | �����𓊓�����") ;
			System.out.println("9 | �I������") ;
			System.out.println("------------------------------") ;
			System.out.print("����ԍ��F") ;
			//operation�ɑ���ԍ�����
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

