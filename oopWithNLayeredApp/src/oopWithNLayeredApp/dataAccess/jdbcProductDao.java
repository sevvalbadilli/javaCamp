package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao{
	
	public void add(Product product  ) {
		// sadece ve sadece db erişim kodları yazılır SQL
		System.out.println("JDBC ile veri tabanına eklendi");
	}
	

}
