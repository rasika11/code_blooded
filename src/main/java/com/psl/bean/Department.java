package com.psl.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	@Id
	@GeneratedValue
	@Column(name = "departmentId")
    private int departmentId;
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepartmentHeadId() {
		return departmentHeadId;
	}

	public void setDepartmentHeadId(int departmentHeadId) {
		this.departmentHeadId = departmentHeadId;
	}

	@Column(name = "departmentName")
	private String departmentName;
	
	@Column(name = "departmentHeadId")
	private int departmentHeadId;

	public Department(int departmentId, String departmentName,
			int departmentHeadId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentHeadId = departmentHeadId;
	}

	
	
    
}