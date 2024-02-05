package class05App;

import class05NToN.Nephew;
import class05NToN.Uncle;
import infra.DAO;

public class NewUncleNephew {
	public static void main(String[] args) {
		//instancing the DAO
		DAO<Object> dao = new DAO<>();
		//creating the uncles
		Uncle uncle01 = new Uncle("Uncle01");
		Uncle uncle02 = new Uncle("Uncle02");
		
		//creating the nephews
		Nephew nephew01 = new Nephew("Nephew01");
		Nephew nephew02 = new Nephew("Nephew02");
		
		//making the relations and keeping the consistency 
		uncle01.getNephews().add(nephew01);
		nephew01.getUncles().add(uncle01);
		
		uncle01.getNephews().add(nephew02);
		nephew02.getUncles().add(uncle01);
		
		uncle02.getNephews().add(nephew01);
		nephew01.getUncles().add(uncle02);
		
		uncle02.getNephews().add(nephew02);
		nephew02.getUncles().add(uncle02);
		
		dao.openTransaction().include(uncle01).include(uncle02).include(nephew01).include(nephew02).closeTransaction().close();
	}
}
