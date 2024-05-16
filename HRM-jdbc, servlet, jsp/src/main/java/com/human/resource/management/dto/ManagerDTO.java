package com.human.resource.management.dto;

public class ManagerDTO {
	int id;
	String name;
	int mobileNumber;
	String email;
	int branchId;
	int aadharCardNumber;
	String aadharCardPhoto;
	String panCardNumber;
	String panCardphoto;
	double sallary;
	String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(int aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public String getAadharCardPhoto() {
		return aadharCardPhoto;
	}

	public void setAadharCardPhoto(String aadharCardPhoto) {
		this.aadharCardPhoto = aadharCardPhoto;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getPanCardphoto() {
		return panCardphoto;
	}

	public void setPanCardphoto(String panCardphoto) {
		this.panCardphoto = panCardphoto;
	}

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
