package com.yedam.java.product.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/list")
	public String productList(Model model) {
		model.addAttribute("list", service.ProductList());
		return "product/list";
	}
	
	@GetMapping("/insert")
	public void insertForm(Model model) {
		ProductVO productVO = new ProductVO();
		productVO.setProductId(service.getProductId());
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		model.addAttribute("productId", service.getProductId());
		model.addAttribute("productDate", date.format(today));
	}
	
	@PostMapping("/insert")
	public String insertProduct(ProductVO productVO) {
		service.ProductInsert(productVO);
		return "redirect:/product/list";
	}
}
