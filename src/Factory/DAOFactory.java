package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

//import resourcer.ProjectResourcer;
//import resourcer.Resourcer;

public class DAOFactory extends DAOAbstractFactory {
	private static volatile DAOFactory instance;
	private Connection connection;

	private DAOFactory() {
	}

	public static DAOFactory getInstance() throws ClassNotFoundException, SQLException {
		DAOFactory factory = instance;
		if (instance == null) {
			synchronized (DAOFactory.class) {
				instance = factory = new DAOFactory();
				factory.connected();
			}
		}
		return factory;
	}

	private void connected() throws SQLException {
		Locale.setDefault(Locale.ENGLISH);
		//Resourcer resourcer = ProjectResourcer.getInstance();
		//String url = resourcer.getString("db.url");
		//String user = resourcer.getString("db.user");
		//String password = resourcer.getString("db.password");
		//connection = DriverManager.getConnection(url, user, password);
		System.out.println("Connected to oracle DB!");
	}
}
