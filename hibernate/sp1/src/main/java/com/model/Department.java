package com.model;

import java.util.List;
import com.model.Subject;

public class Department {
	private int did;
	private List<Subject> subjects;

	

	@Override
	public String toString() {
		return "Department [did=" + did + ", subjects=" + subjects + "]";
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	
}
