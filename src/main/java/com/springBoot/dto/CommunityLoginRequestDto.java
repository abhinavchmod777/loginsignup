package com.springBoot.dto;

public class CommunityLoginRequestDto 
{
	private String communityName;
	private String password;
	
	//------------------------constructor---------------------------//
	public CommunityLoginRequestDto() {};
	public CommunityLoginRequestDto(String communityName, String password) {
		super();
		this.communityName = communityName;
		this.password = password;
	}
	
	//------------------------getters and setters-------------------//
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
