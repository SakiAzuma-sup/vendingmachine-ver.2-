package azumaS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class LastChoose {

	public int lastChoose(int drink, int last, List<String> message, int zankin) {
		
		//�Ō�̑I��(�������𑱂��邩�ۂ�)#######################################################
		boolean okey = true ;
		while(okey) {
			
			//����I�����
			System.out.println("") ;
			System.out.println("���݂̓����z�F��"+zankin) ;
			System.out.println("") ;
			System.out.println( "����ԍ�����͂��Ă��������B") ;
			System.out.println("------------------------------") ;
			System.out.println("1 | ���i�̏ڍׂ�\��") ;
			System.out.println("2 | �������𑱂���") ;
			System.out.println("9 | �I������");
			System.out.println("------------------------------") ;
			System.out.print("����ԍ��F") ;
		
			//last�ɏI������ԍ�����
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
			
			//�Ō�̑I��(�������𑱂��邩�ۂ�)�ɉ����āA###################################################
			//�s������܂��͕\��������e##############################################################
			switch(last) {
			case 9 :
				//�I������
				//�V�X�e���I��
				System.out.println("") ;
				System.out.println("���ނ�F��"+zankin) ;
				System.out.println("���肪�Ƃ��������܂����B") ;
				System.out.println("�܂��̂��z�������҂����Ă���܂��B") ;
				okey = false ;
				System.exit(0);
				break ;

			case 1 :
				//�ڍו\��
				System.out.println("") ;
				System.out.println(message.get (drink-1)) ;
				okey = false ;
				break ;
			
			case 2 :
				//�������𑱂���
				//�ŏ��̑I���ɖ߂�
				okey = false ;
				break ;
				
			default :
				System.out.println("����������������͂��Ă��������B") ;
				break;

			}
			return okey ;
		}
	
}
