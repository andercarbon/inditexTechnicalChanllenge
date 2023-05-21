package com.inditex.technicalChallenge.service.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inditex.technicalChallenge.service.PrizeService;

@Service
@Transactional(rollbackFor = Exception.class)
public class PrizeServiceImp implements PrizeService{

	Logger logger = LoggerFactory.getLogger(PrizeServiceImp.class);
}
