package com.springBoot.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.dao.CommunityDao;
import com.springBoot.dto.CommunityRegistrationRequestDto;
import com.springBoot.model.Community;


@Service
public class CommunityRegistrationService {

	@Autowired
	CommunityDao dao;
	
	@Transactional
	public void getCommunityRegister(CommunityRegistrationRequestDto dto)
	{
		Community community = new Community();
		community.setCommunityName(dto.getCommunityName());
		community.setDescription(dto.getDescription());
		community.setPassword(dto.getPassword());
		community.setStatus(dto.getStatus());
		System.out.println(community);
		dao.communityRegister(community);
	}
}
