package class03App;


import class03.OneToOneRelation.Accent;
import class03.OneToOneRelation.Customer;
import infra.DAO;

public class GetClientAccent {
	public static void main(String[] args) {
		//accessing the bidirectional relation 
		 DAO<Customer> daoCustomer = new DAO<>(Customer.class);
		 Customer customer = daoCustomer.getById(1L);
		 System.out.println(customer.getAccent().getName());
		 daoCustomer.close();
		 
		 DAO<Accent> daoAccent = new DAO<>(Accent.class);
		 Accent accent = daoAccent.getById(1L);
		 System.out.println(accent.getCustomer().getName());
		 daoAccent.close();
	}
}
