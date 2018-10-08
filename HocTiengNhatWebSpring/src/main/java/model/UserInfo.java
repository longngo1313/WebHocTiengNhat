package model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserInfo extends User{
	
	private String userId;
	private String enabled;
	private String learningLevel;
	private String purchased;
	private String email;
	private String birthDate;
	private String name;
	
	
	public UserInfo(String username, String password, Collection<? extends GrantedAuthority> authorities, String userId, 
			String enabled, String learningLevel, String purchased, String email, String birthDate, String name) {
		super(username, password, authorities);
		this.userId = userId;
		this.enabled = enabled;
		this.learningLevel = learningLevel;
		this.purchased = purchased;
		this.email = email;
		this.birthDate = birthDate;
		this.name = name;
	}
	
	
	
	public UserInfo(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}



	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getLearningLevel() {
		return learningLevel;
	}
	public void setLearningLevel(String learningLevel) {
		this.learningLevel = learningLevel;
	}
	public String getPurchased() {
		return purchased;
	}
	public void setPurchased(String purchased) {
		this.purchased = purchased;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
}
