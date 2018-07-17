package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.dto.CommunityLoginRequestDto;
import com.springBoot.service.CommunityLoginService;

@RestController
public class CommunityLoginController 
{
	@Autowired
	CommunityLoginService loginService;
	
	@RequestMapping(value="/login" , method= RequestMethod.POST)
	public ResponseEntity<Object> loginCommunity(@ModelAttribute("CommunityLoginRequestDto") CommunityLoginRequestDto dto) throws Exception
	{
		try {
			loginService.getCommunityLogin(dto);
			return ResponseEntity.ok().body(dto);
		}catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}
	}
}
