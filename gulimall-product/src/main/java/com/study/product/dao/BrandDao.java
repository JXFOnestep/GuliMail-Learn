package com.study.product.dao;

import com.study.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2024-04-05 22:41:12
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
