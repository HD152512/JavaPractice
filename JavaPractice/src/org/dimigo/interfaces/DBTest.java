/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 	 └ DBTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author: User
 * @version	: 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(s);
		IDBManager o = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(o);
	}

	private static void crud(IDBManager db) {
		if (db instanceof OracleDB) {
			System.out.println("< 변경 전 >");
		} else {
			System.out.println("< 변경 후 > ");
		}
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
