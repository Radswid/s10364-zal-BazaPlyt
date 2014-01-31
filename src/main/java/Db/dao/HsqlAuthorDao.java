package Db.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import cdbase.Author;
import Db.HsqlUnitOfWork;

public class HsqlAuthorDao extends HsqlDaoBase<Author> {

	public HsqlAuthorDao(HsqlUnitOfWork uow) {
		super(uow);
	}
	
	@Override
	protected void setUpdateQuery(Author ent) throws SQLException {

		update.setString(1, ent.getName());
		update.setString(3, ent.getSurname());
		update.setString(4, ent.getBand());
		update.setInt(5, ent.getId());
		
	}

	@Override
	protected Author build(ResultSet rs) throws SQLException {

		Author a = new Author();
		a.setName(rs.getString("name"));
		a.setSurname(rs.getString("surname"));
		a.setBand(rs.getString("band"));
		a.setId(rs.getInt("id"));
		return a;
	}

	@Override
	protected void setInsertQuery(Author ent) throws SQLException {
		insert.setString(1, ent.getName());
		insert.setString(2, ent.getSurname());
		insert.setString(3, ent.getBand());
		
		
	}

	@Override
	protected String getTableName() {
		return "author";
	}

	@Override
	protected String getCreateQuery() {
		return "CREATE TABLE Author("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
				+ "name VARCHAR(50),"
				+ "surname VARCHAR(50),"
				+ "band VARCHAR(50)"
				+ ")";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into track(name,surname,band) values (?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update client set"
				+ "(name,surname,band)=(?,?,?)"
				+ "where id=?";
	}

	
	
	
}