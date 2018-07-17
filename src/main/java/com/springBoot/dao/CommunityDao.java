package com.springBoot.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springBoot.model.Community;

@Repository
public class CommunityDao 
{
	@Autowired
	SessionFactory sf;
	public void communityRegister(Community comm)
	{
		System.out.println("in the dao communityRegister"+comm);
		sf.getCurrentSession().save(comm);
	} 
}
