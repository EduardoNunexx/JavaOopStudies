package class03App;

import org.hibernate.type.AnyType.ObjectTypeCacheEntry;

import class03.OneToOneRelation.Accent;
import class03.OneToOneRelation.Customer;
import infra.DAO;

public class NewClientAccent02 {
	public static void main(String[] args) {
		Accent accent = new Accent("B18");
		Customer customer = new Customer("customer01",accent);
		DAO<Object> dao = new DAO<>();
		
		dao.includeWithEverything(customer);
	}
	
}
