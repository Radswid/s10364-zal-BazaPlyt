package Db.dao;

import java.util.List;

import Db.Dao;
import cdbase.Track;

public interface TrackDao extends Dao<Track>  {
	public List<Track> getTrackByCdId(int id);

}
