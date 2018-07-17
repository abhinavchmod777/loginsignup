package com.springBoot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.springBoot.model.enums.PrivatePublic;

@Entity
public class Community 
{
	//------------------primary properties---------------------//	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int communityId;
		@Column(name="community_name")
		private String communityName;
		private String description;
		@Enumerated(EnumType.STRING)
		@Column(nullable=true)
		private PrivatePublic status;
		private String password;

	//------------------constructor----------------------------//
		public Community()
		{
			
		}
		
		public Community(int communityId, String communityName, String description, PrivatePublic status) 
		{
				super();
				this.communityId = communityId;
				this.communityName = communityName;
				this.description = description;
				this.status = status;
		}
		
	//-------------------getters and setters-------------------//
		public int getCommunityId() {
			return communityId;
		}
		public void setCommunityId(int communityId) {
			this.communityId = communityId;
		}
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

		//-----------------------toString()-------------------------------//

		@Override
		public String toString() {
			return "Community [communityId=" + communityId + ", communityName=" + communityName + ", description="
					+ description + ", status=" + status + "]";
		}
		

}
