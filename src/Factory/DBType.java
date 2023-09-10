package Factory;

import java.sql.SQLException;

public enum DBType {
	ORACLE {
		@Override
		public DAOFactory getDAOAbstractFactory() {
			DAOFactory oracleDBDAOFactory = null;
			try {
				oracleDBDAOFactory = DAOFactory.getInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return oracleDBDAOFactory;
		}
	};

	public static DBType getTypeByName(String dbType) {
		try {
			return DBType.valueOf(dbType.toUpperCase());
		} catch (Exception e) {
			throw new DBTypeException();
		}
	}

	public abstract DAOAbstractFactory getDAOAbstractFactory();
}
