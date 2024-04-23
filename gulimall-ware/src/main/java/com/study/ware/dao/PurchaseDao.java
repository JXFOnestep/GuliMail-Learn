package com.study.ware.dao;

import com.study.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-04-05 23:38:00
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
