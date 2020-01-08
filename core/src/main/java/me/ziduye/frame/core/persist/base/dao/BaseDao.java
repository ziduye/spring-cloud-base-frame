package me.ziduye.frame.core.persist.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.ziduye.frame.core.persist.base.entity.BaseEntity;

public interface BaseDao<T extends BaseEntity> extends BaseMapper<T> {

}