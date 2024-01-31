package class03App;

import class03.OneToOneRelation.Accent;
import class03.OneToOneRelation.Customer;
import infra.DAO;

public class NewClientAccent01 {
	public static void main(String[] args) {
		//creating the accent and customer
		Accent accent = new Accent("A27");
		Customer customer = new Customer("client03",accent);
		
		//instancing the dao 
		DAO<Object> dao = new DAO<>();
		
		//doing the include process
		dao.openTransaction().include(accent).include(customer).closeTransaction().close();
	}
	
	
}
