package com.wipro.model;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int regno;
	@Column(name="userid")
	private int userid;
	@Column(name="asmntname")
	private String asmntname;
	@Column(name="date")
	private String date;
	@Column(name="asmnttype")
	private String asmnttype;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int regno, int userid, String asmntname, String date, String asmnttype) {
		super();
		this.regno = regno;
		this.userid = userid;
		this.asmntname = asmntname;
		this.date = date;
		this.asmnttype = asmnttype;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getAsmntname() {
		return asmntname;
	}

	public void setAsmntname(String asmntname) {
		this.asmntname = asmntname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAsmnttype() {
		return asmnttype;
	}

	public void setAsmnttype(String asmnttype) {
		this.asmnttype = asmnttype;
	}

	@Override
	public String toString() {
		return "Employee [regno=" + regno + ", userid=" + userid + ", asmntname=" + asmntname + ", date=" + date
				+ ", asmnttype=" + asmnttype + "]";
	}
	
	
	
	
	
	
}
	
	
	


