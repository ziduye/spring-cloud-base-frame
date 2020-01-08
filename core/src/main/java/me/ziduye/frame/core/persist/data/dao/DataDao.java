package me.ziduye.frame.core.persist.data.dao;

import me.ziduye.frame.core.persist.base.dao.BaseDao;
import me.ziduye.frame.core.persist.data.entity.DataEntity;

public interface DataDao<T extends DataEntity<T>> extends BaseDao<T> {

}
