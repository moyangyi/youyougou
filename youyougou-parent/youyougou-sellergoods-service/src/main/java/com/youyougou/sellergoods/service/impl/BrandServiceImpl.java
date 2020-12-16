package com.youyougou.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.youyougou.mapper.TbBrandMapper;
import com.youyougou.pojo.TbBrand;
import com.youyougou.sellergoods.service.BrandService;


//引入的包为om.alibaba.dubbo，需要对外发布
@Service
public class BrandServiceImpl implements BrandService{

	@Autowired
	private TbBrandMapper brandMapper;
	
	
	//返回全部列表
	@Override
	public List<TbBrand> findAll() {
		return brandMapper.selectByExample(null);
	}

}
