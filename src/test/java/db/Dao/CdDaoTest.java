package db.Dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Db.HsqlUnitOfWork;
import Db.dao.CdDao;
import Db.dao.HsqlCdDao;
import cdbase.Cd;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CdDaoTest {
	
	CdDao dao;

	Connection connection = null;
	private Statement drop;
	
	@BeforeClass
	public static void initialize()
	{}
	
	@Before
	public void setUp()
	{

		Cd c = new Cd();
		c.setName("p³yta");
		c.setPrice(23);
		try {

			HsqlUnitOfWork uow = new HsqlUnitOfWork();
			dao = new HsqlCdDao(uow);
			dao.save(c);
			uow.commit();
			drop = uow.getConnection().createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@After
	public void teardown()
	{
		try{
			if(connection!=null && !connection.isClosed())
			{	
				drop.executeUpdate("Drop table Cd");
				connection.close();
				connection = null;
			}}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	
	@Test
	public void testGet() {
		
		Cd c1 = dao.get(0);
	
		
		//assertNotNull("Zwrócono null mimo ze obiekt jest w bazie",c1);
		assertNull("zwrócono wartosc mimo, ¿e nie ma takiego obiektu w bazie",c1);
		//assertTrue(c1.getName().equals("Jan"));
		
		//assertEquals(c1.getName(),"p³yta");
		//assertEquals(c1.getPrice(),23);
		
		
		//assertNotSame(c1,c3);
		
	}

}
