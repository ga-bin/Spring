package com.yedam.java.product.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yedam.java.product.mapper.ProductMapper;
import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Service 
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper mapper;
	@Override
	public List<ProductVO> ProductList() {
		return mapper.ProductList();
	}

	@Override
	public int getProductId() {
		return mapper.getProductId();
	}

	@Override
	public void ProductInsert(ProductVO productVO) {
		mapper.ProductInsert(productVO);
	}


}
