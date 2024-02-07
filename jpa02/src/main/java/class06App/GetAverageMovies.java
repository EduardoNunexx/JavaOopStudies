package class06App;

import class06NativeQuerys.MovieAverage;
import infra.DAO;

public class GetAverageMovies {
	public static void main(String[] args) {
		DAO<MovieAverage> dao = new DAO<>(MovieAverage.class);
		MovieAverage average = dao.getOneByQuery("getGeneralAvrg");
		System.out.println(average.getAverage());
		dao.close();
	}
}
