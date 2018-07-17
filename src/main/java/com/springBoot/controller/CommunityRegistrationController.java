package com.springBoot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.dto.CommunityRegistrationRequestDto;
import com.springBoot.service.CommunityRegistrationService;


@RestController
public class CommunityRegistrationController 
{
	@Autowired
	CommunityRegistrationService registrationService;
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	@PostMapping(value="/register")
	public ResponseEntity<Object> registerCommunity(@ModelAttribute("CommunityRegistrationRequestDto") CommunityRegistrationRequestDto dto)
	{
		try	{
			registrationService.getCommunityRegister(dto);
			return ResponseEntity.ok().body(dto);
		}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}
	}
	
}
