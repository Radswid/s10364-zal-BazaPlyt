package Db.dao;

import Db.Dao;
import cdbase.Cd;

public interface CdDao extends Dao<Cd> {
	public void setAuthores(Cd c);
	public void setTracks(Cd c);

}
