import Db.HsqlUnitOfWork;
import Db.dao.CdDao;
import Db.dao.HsqlCdDao;
import cdbase.Cd;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HsqlUnitOfWork uow = new HsqlUnitOfWork();
		CdDao dao = new HsqlCdDao(uow);
		Cd c = new Cd();
		
		c.setName("Master of puppets");
		c.setPrice(24);
		Cd c2 = dao.get(2); 
		
		Cd c1 = new Cd();
		c1.setId(0);
		dao.delete(c1);
		dao.save(c);
		uow.commit();
		uow.close();
		System.out.println("koniec");

	}

}
