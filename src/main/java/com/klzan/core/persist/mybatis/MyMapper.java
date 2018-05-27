package com.klzan.core.persist.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Mapper
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
