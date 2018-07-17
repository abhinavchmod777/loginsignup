package com.springBoot.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.dao.CommunityLoginDao;
import com.springBoot.dto.CommunityLoginRequestDto;

@Service
public class CommunityLoginService
{
	@Autowired
	CommunityLoginDao dao;
	
	@Transactional
	public boolean getCommunityLogin(CommunityLoginRequestDto loginRequestDto) throws Exception {
		return dao.communityLogin(loginRequestDto);
	}

}
