package azumaS;

import java.util.List;

	public class ListProduct {
	
		//���i���X�g��\��######################################################################
		//##################################################################################
		public void listProduct(List<String> name, List<Integer> price, List<Integer> zaiko, List<String> botan) {
			//���i�\��
			System.out.println("------------------------------") ;
			for (int i=0; i<name.size(); ++i) {
				System.out.println((i+1)+" | "+botan.get(i)+" | "+name.get(i)+" | ��"+price.get(i)+ " | �݌ɐ��F"+zaiko.get(i)) ;
			}
			System.out.println("------------------------------") ;
		}

}
