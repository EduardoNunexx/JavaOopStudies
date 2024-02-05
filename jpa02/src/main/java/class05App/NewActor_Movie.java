package class05App;

import class05NToN.Actor;
import class05NToN.Movie;
import infra.DAO;

public class NewActor_Movie {
	public static void main(String[] args) {
		Actor actor01 = new Actor("Di caprio");
		Actor actor02 = new Actor("Al pacino");
		
		
		Movie movie01 = new Movie("The wolf of wall street", 9.8);
		Movie movie02= new Movie("The godFather", 10.0);
		
		
		movie01.addActor(actor01);
		movie01.addActor(actor02);
		
		movie02.addActor(actor02);
		DAO<Object> dao = new DAO<>();
		dao.openTransaction().include(movie01).closeTransaction().close();
	
	}
}
