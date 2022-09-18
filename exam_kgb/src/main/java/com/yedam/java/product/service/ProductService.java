package com.yedam.java.product.service;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface ProductService {
	// 상품 정보 전체 조회
	public List<ProductVO> ProductList();

	// 상품번호 가장높은거 + 1조회
	public int getProductId();

	// 상품 넣기
	public void ProductInsert(ProductVO productVO);
}
