package com.zgq.vo;


public class Tuser  {

	// Fields

	private Integer id;
	private Integer userId;
	private Long mobileInt;
	private String roamingStatus;
	private String comLevel;
	private Integer customerId;
	private String isAvailable;

	// Constructors

	/** default constructor */
	public Tuser() {
	}

	@Override
	public String toString() {
		return "Tuser [id=" + id + ", userId=" + userId + ", mobileInt=" + mobileInt + ", roamingStatus="
				+ roamingStatus + ", comLevel=" + comLevel + ", customerId=" + customerId + ", isAvailable="
				+ isAvailable + "]";
	}

	/** minimal constructor */
	public Tuser(Integer id) {
		this.id = id;
	}

	/** full constructor */
	

	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	

	

	public Long getMobileInt() {
		return mobileInt;
	}

	public void setMobileInt(Long mobileInt) {
		this.mobileInt = mobileInt;
	}

	public String getRoamingStatus() {
		return this.roamingStatus;
	}

	public void setRoamingStatus(String roamingStatus) {
		this.roamingStatus = roamingStatus;
	}

	

	public String getComLevel() {
		return this.comLevel;
	}

	public void setComLevel(String comLevel) {
		this.comLevel = comLevel;
	}



	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}



	public String getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

}