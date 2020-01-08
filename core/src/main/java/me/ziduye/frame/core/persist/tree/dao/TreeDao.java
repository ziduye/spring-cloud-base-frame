package me.ziduye.frame.core.persist.tree.dao;

import me.ziduye.frame.core.persist.base.dao.BaseDao;
import me.ziduye.frame.core.persist.tree.entity.TreeEntity;

public interface TreeDao<T extends TreeEntity<T>> extends BaseDao<T> {

}
