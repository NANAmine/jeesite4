/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.dim.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.dim.entity.DimDictionary;

/**
 * 通用字典表DAO接口
 * @author ljw
 * @version 2019-05-09
 */
@MyBatisDao
public interface DimDictionaryDao extends CrudDao<DimDictionary> {
    int deleteAll(DimDictionary dimDictionary);
}