package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Institution {

	private String name;
	private String type;
	private Credentials credentials;
	private Boolean hasMfa;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	
	@JsonProperty("has_mfa")
	public Boolean getHasMfa() {
		return hasMfa;
	}
	public void setHasMfa(Boolean hasMfa) {
		this.hasMfa = hasMfa;
	}
	
	
}
