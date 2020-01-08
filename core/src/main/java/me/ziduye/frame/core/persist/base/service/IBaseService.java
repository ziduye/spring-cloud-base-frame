package me.ziduye.frame.core.persist.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.ziduye.frame.core.persist.base.entity.BaseEntity;

/**
 * 添加自定义全局方法
 */
public interface IBaseService<T extends BaseEntity> extends IService<T> {
	
}
