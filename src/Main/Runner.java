package Main;

import Factory.DAOAbstractFactory;
import Factory.DBType;

import resourcer.ProjectResourcer;
import resourcer.Resourcer;

public class Runner {
    public static void main(String[] args) {
        Resourcer resourcer = ProjectResourcer.getInstance();
        StringBuilder res = new StringBuilder("\n");
        DAOAbstractFactory factory = DAOAbstractFactory.getInstance(DBType.ORACLE);
    }
}
