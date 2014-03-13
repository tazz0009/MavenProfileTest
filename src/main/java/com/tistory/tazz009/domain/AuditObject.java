package com.tistory.tazz009.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AuditObject {
	private Long id;
	private String who;
	private Date whenn;
	private String resource;
	private String action;
	
	public AuditObject() {
	}
	
	public AuditObject(String resource, String action) {
		initWho();
		initWhen();
		this.resource = resource;
		this.action = action;
	}

	private void initWho() {
		this.who = (String) System.getProperty("user.name");
	}
	
	private void initWhen() {
		this.whenn = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public Date getWhenn() {
		return whenn;
	}

	public void setWhenn(Date whenn) {
		this.whenn = whenn;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}	
}
