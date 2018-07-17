package com.springBoot.dto;

import com.springBoot.model.enums.PrivatePublic;

public class CommunityRegistrationRequestDto 
{
	private String communityName;
	private String description;
	private PrivatePublic status;
	private String password;
	
	//------------------------constructors--------------------------//
	public CommunityRegistrationRequestDto() {}
	public CommunityRegistrationRequestDto(String communityName, String description, PrivatePublic status) {
		super();
		this.communityName = communityName;
		this.description = description;
		this.status = status;
	}

	//--------------------------getters and setters-----------------------------------//
	
	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PrivatePublic getStatus() {
		return status;
	}

	public void setStatus(PrivatePublic status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
