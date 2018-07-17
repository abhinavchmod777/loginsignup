package com.springBoot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springBoot.dto.CommunityLoginRequestDto;
import com.springBoot.model.Community;

@Repository
public class CommunityLoginDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public Boolean communityLogin(CommunityLoginRequestDto comm)throws Exception
	{
		Boolean result = false;
		Criteria criteria = getCurrentSession().createCriteria(Community.class);
		criteria.add(Restrictions.eq("communityName",comm.getCommunityName()));
		List<Community> results = criteria.list();
		if(results.isEmpty())
		{
			throw new Exception("Invalid CommunityName");
		}
		if(results.get(0).getPassword().equals(comm.getPassword()))
		{
			result= true;
		}
		else{
			throw new Exception("Invalid Password");
		}
		return result;
	}
}
