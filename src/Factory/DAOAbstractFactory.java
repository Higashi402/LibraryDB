package Factory;

public abstract class DAOAbstractFactory {
	public static DAOAbstractFactory getInstance(DBType dbType) {
		DAOAbstractFactory result = dbType.getDAOAbstractFactory();
		return result;
	}

}
