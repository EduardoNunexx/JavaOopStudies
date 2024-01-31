package class02;

import java.util.List;

import infra.DAO;

public class NewProduct {
	public static void main(String[] args) {
		DAO<Product> dao = new DAO<>(Product.class);
		Product product = new Product("ZEDEC02",0.03);
		
		//dao.openTransaction().include(product).closeTransaction().close();
		//dao.includeWithEverything(product).close();
		List<Product> products = dao.getAll();
		for(Product p: products) {
			System.out.println(p.getName());
		}
	}
}
