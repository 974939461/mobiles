package com.zgq.vo;



public class TchargeRule  {

	// Fields

	private Integer id;
	private String funcId;
	private String chargeCode;
	private String funcName;

	// Constructors

	/** default constructor */
	public TchargeRule() {
	}

	/** minimal constructor */
	public TchargeRule(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TchargeRule(Integer id, String funcId, String chargeCode, String funcName) {
		this.id = id;
		this.funcId = funcId;
		this.chargeCode = chargeCode;
		this.funcName = funcName;
	}

	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getFuncId() {
		return this.funcId;
	}

	public void setFuncId(String funcId) {
		this.funcId = funcId;
	}

	

	public String getChargeCode() {
		return this.chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	

	public String getFuncName() {
		return this.funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

}