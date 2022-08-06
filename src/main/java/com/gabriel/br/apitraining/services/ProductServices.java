package com.gabriel.br.apitraining.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.br.apitraining.data.vo.ProductVO;
import com.gabriel.br.apitraining.mapper.DozerMapper;
import com.gabriel.br.apitraining.model.Product;
import com.gabriel.br.apitraining.repository.ProductRepository;

@Service
public class ProductServices {
	
	private Logger logger = Logger.getLogger(ProductServices.class.getName());
	
	@Autowired
	ProductRepository repository;
	
	public ProductVO create(ProductVO product) {
		logger.info("Create one Product");
		var entity = DozerMapper.parseObject(product, Product.class);
		var vo = DozerMapper.parseObject(repository.save(entity), ProductVO.class);
		return vo;
	}
	
	public List<ProductVO> findAll(){
		logger.info("Finding All Products");
		return DozerMapper.parseListObjects(repository.findAll(), ProductVO.class) ;
	}

}