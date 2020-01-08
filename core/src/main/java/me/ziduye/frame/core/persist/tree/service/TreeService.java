/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package me.ziduye.frame.core.persist.tree.service;

import me.ziduye.frame.core.persist.base.service.BaseService;
import me.ziduye.frame.core.persist.tree.dao.TreeDao;
import me.ziduye.frame.core.persist.tree.entity.TreeEntity;

public class TreeService<D extends TreeDao<T>, T extends TreeEntity<T>> extends BaseService<D, T> {

}
