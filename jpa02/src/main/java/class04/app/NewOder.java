package class04.app;

import Class04OneToN.ItemOrder;
import Class04OneToN.Ordr;
import class02.Product;
import infra.DAO;

public class NewOder {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		Product product = new Product("Bmw",120000.0);
		Ordr order = new Ordr();
		ItemOrder itemOrder = new ItemOrder(1,order,product);
		dao.openTransaction().include(product).include(order).include(itemOrder).closeTransaction().close();
	}
}
