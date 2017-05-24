/**
 * 
 */
package org.dimigo.interfaces;

/**
 *<pre>
 * org.dimigo.interfaces
 * 	 └ IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author : User
 * @version	: 1.0
 */
public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database) {
		if(ORACLE_DATABASE.equalsIgnoreCase(database)) return new OracleDB();
		if(SYBASE_DATABASE.equalsIgnoreCase(database)) return new SybaseDB();
		else return null;
	}
}
