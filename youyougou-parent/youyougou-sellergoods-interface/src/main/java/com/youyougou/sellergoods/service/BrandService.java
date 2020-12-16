package com.youyougou.sellergoods.service;

import java.util.List;

import com.youyougou.pojo.TbBrand;

/**
 * 品牌服务层接口
 * @author Administrator
 *
 */
public interface BrandService {
	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbBrand> findAll();
}

