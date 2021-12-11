package com.foreachdemo;

public class DoctoDTO {
	String doctorname;
	String doctorid;
	String doctorcity;
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorcity() {
		return doctorcity;
	}
	public void setDoctorcity(String doctorcity) {
		this.doctorcity = doctorcity;
	}
	public DoctoDTO(String doctorname, String doctorid, String doctorcity) {
		this.doctorname = doctorname;
		this.doctorid = doctorid;
		this.doctorcity = doctorcity;
	}
	
	public DoctoDTO() {
		
	}
	
	

}
