package azumaS;

import java.util.List;

	public class ListProduct {
	
		//商品リストを表示######################################################################
		//##################################################################################
		public void listProduct(List<String> name, List<Integer> price) {
			//商品表示
			System.out.println("------------------------------") ;
			for (int i=0; i<name.size(); ++i) {
				System.out.println((i+1)+" | "+name.get(i)+" | "+price.get(i)) ;
			}
			System.out.println("------------------------------") ;
		}

}
