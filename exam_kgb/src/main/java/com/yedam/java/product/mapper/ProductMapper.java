package com.yedam.java.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.java.product.service.ProductVO;


public interface ProductMapper {
	// 상품 정보 전체 조회
	public List<ProductVO> ProductList();

	// 상품번호 가장높은거 + 1조회
	public int getProductId();

	// 상품 넣기
	public void ProductInsert(ProductVO productVO);
}
