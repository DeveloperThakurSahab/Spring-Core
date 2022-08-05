package com.bean;

public class Emp {

	private String ename,job,email;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String toString() {
		return "Emp Name: "+ename+"\nJob: "+job+"\nEmail: "+email;
	}
}
