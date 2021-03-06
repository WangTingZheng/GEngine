/**工具生成，请遵循规范。

*/
package info.xiaomo.gengine.persist.mongo.bydr.dao;

import java.util.List;
import info.xiaomo.gengine.persist.mongo.AbsMongoManager;
import info.xiaomo.gengine.persist.mongo.bydr.entity.CRoom;
import org.mongodb.morphia.dao.BasicDAO;

public class CRoomDao extends BasicDAO<CRoom, Integer> {
	private static volatile CRoomDao cRoomDao;

	public CRoomDao(AbsMongoManager mongoManager) {
		super(CRoom.class, mongoManager.getMongoClient(), mongoManager.getMorphia(),mongoManager.getMongoConfig().getDbName());
	}

	public static CRoomDao getDB(AbsMongoManager mongoManager) {
		if(cRoomDao == null) {
			synchronized (CRoomDao.class){
				if(cRoomDao == null){
					cRoomDao = new CRoomDao(mongoManager);
					}
				}
			}
		return cRoomDao;
	}

	public static List<CRoom> getAll(){
		 return cRoomDao.createQuery().asList();
	}

}