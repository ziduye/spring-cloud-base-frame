/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package me.ziduye.frame.core.persist.data.service;

import me.ziduye.frame.core.persist.base.service.BaseService;
import me.ziduye.frame.core.persist.data.dao.DataDao;
import me.ziduye.frame.core.persist.data.entity.DataEntity;

public class DataService<D extends DataDao<T>, T extends DataEntity<T>> extends BaseService<D, T> {

}
