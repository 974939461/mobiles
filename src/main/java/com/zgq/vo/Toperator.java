package com.zgq.vo;



public class Toperator  {

	// Fields

	private Integer id;
	private Integer operatorId;
	private String operatorName;
	private String operatorPwd;
	private Integer isAdmin;

	// Constructors

	@Override
	public String toString() {
		return "Toperator [id=" + id + ", operatorId=" + operatorId + ", operatorName=" + operatorName
				+ ", operatorPwd=" + operatorPwd + ", isAdmin=" + isAdmin + "]";
	}

	/** default constructor */
	public Toperator() {
	}

	/** minimal constructor */
	public Toperator(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Toperator(Integer id, Integer operatorId, String operatorName, String operatorPwd, Integer isAdmin) {
		this.id = id;
		this.operatorId = operatorId;
		this.operatorName = operatorName;
		this.operatorPwd = operatorPwd;
		this.isAdmin = isAdmin;
	}



	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	

	public String getOperatorPwd() {
		return this.operatorPwd;
	}

	public void setOperatorPwd(String operatorPwd) {
		this.operatorPwd = operatorPwd;
	}

	

	public Integer getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

}