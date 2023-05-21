package com.inditex.technicalChallenge.service.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inditex.technicalChallenge.service.ProductService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImp implements ProductService{

	Logger logger = LoggerFactory.getLogger(ProductServiceImp.class);
}
