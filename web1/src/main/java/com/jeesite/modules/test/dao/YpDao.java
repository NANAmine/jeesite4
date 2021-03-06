/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.test.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.test.entity.Yp;

/**
 * 药品管理DAO接口
 * @author ljw
 * @version 2019-05-09
 */
@MyBatisDao
public interface YpDao extends CrudDao<Yp> {
	
}