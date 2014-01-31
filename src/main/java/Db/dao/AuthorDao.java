package Db.dao;

import java.util.List;

import cdbase.Author;
import Db.Dao;



public interface AuthorDao extends Dao<Author> {
	public List<Author> getAuthorByCdId(int id);

}
