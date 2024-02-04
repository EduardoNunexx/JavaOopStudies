package class04.app;

import Class04OneToN.ItemOrder;
import Class04OneToN.Ordr;
import infra.DAO;

public class GetOrder {
	public static void main(String[] args) {
		DAO<Ordr> dao = new DAO<>(Ordr.class);
		Ordr order = dao.getById(1L);
		for (ItemOrder itemOrder : order.getItens()) {
			System.out.println(itemOrder.getQtd());
			System.out.println(itemOrder.getProduct().getName());
		}
		dao.close();
	}
}
