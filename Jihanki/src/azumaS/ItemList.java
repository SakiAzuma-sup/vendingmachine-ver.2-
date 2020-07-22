package azumaS;

import java.util.List;

public class ItemList extends More80yen {

	public static void listProduct(List<String> name, List<Integer> price) {
			//è§ïiï\é¶
			System.out.println("------------------------------") ;
			for (int i=0; i<name.size(); ++i) {
				System.out.println((i+1)+" | "+name.get(i)+" | "+price.get(i)) ;
			}
			System.out.println("------------------------------") ;
		}
	//###################################################################################

	public ItemList() {
		super();
	}

}