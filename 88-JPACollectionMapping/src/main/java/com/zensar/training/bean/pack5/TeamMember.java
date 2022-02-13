package com.zensar.training.bean.pack5;

import java.util.Map;
import java.util.TreeMap;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;


public class TeamMember {

	
	private int memberId;
	private String memberName;
	
	
	private Map<String, Integer> skillDetails;
	
	private void initSkillDetails() {
		if(skillDetails==null)
		this.skillDetails=new TreeMap<String, Integer>();
	}
	
	public TeamMember() {
		super();
		initSkillDetails();
	}

	public TeamMember(int memberId) {
		super();
		this.memberId = memberId;
		initSkillDetails();
	}

	
	public TeamMember(String memberName) {
		super();
		this.memberName = memberName;
		initSkillDetails();
	}

	public TeamMember(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		initSkillDetails();
	}

	public TeamMember(int memberId, String memberName, Map<String, Integer> skillDetails) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.skillDetails = skillDetails;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Map<String, Integer> getSkillDetails() {
		return skillDetails;
	}

	public void setSkillDetails(Map<String, Integer> skillDetails) {
		this.skillDetails = skillDetails;
	}

	@Override
	public String toString() {
		return "TeamMember [memberId=" + memberId + ", memberName=" + memberName + ", skillDetails=" + skillDetails
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + memberId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamMember other = (TeamMember) obj;
		if (memberId != other.memberId)
			return false;
		return true;
	}
	
	
	
}
