package com.study.ware.dao;

import com.study.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-04-05 23:38:00
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
