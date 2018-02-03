package com.zgq.vo;





public class Tcharge {

	// Fields

	private Integer id;
	private String chargeCode;
	private String chargeName;
	private Integer charge;

	// Constructors

	/** default constructor */
	public Tcharge() {
	}

	/** minimal constructor */
	public Tcharge(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Tcharge(Integer id, String chargeCode, String chargeName, Integer charge) {
		this.id = id;
		this.chargeCode = chargeCode;
		this.chargeName = chargeName;
		this.charge = charge;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getChargeCode() {
		return this.chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}


	public String getChargeName() {
		return this.chargeName;
	}

	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}


	public Integer getCharge() {
		return this.charge;
	}

	public void setCharge(Integer charge) {
		this.charge = charge;
	}

}