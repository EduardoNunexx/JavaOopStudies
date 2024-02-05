package class04.app;

import class04OneToN.ItemOrder;
import class04OneToN.Ordr;
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
