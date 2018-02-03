package com.zgq.vo;



public class Tmobiles {

	// Fields

	private Integer id;
	private Long mobileInt;
	private String mobileType;
	private String cardInt;
	private String isAvailable;

	// Constructors

	

	public Integer getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Tmobiles [id=" + id + ", mobileInt=" + mobileInt + ", mobileType=" + mobileType + ", cardInt=" + cardInt
				+ ", isAvailable=" + isAvailable + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}


	

	

	public Long getMobileInt() {
		return mobileInt;
	}

	public void setMobileInt(Long mobileInt) {
		this.mobileInt = mobileInt;
	}

	public String getMobileType() {
		return this.mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	

	public String getCardInt() {
		return this.cardInt;
	}

	public void setCardInt(String cardInt) {
		this.cardInt = cardInt;
	}



	public String getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

}