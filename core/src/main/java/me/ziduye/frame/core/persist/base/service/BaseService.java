package me.ziduye.frame.core.persist.base.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.ziduye.frame.core.persist.base.dao.BaseDao;
import me.ziduye.frame.core.persist.base.entity.BaseEntity;

public class BaseService<M extends BaseDao<T>,T extends BaseEntity> extends ServiceImpl<M,T> implements IBaseService<T>  {
	
}
