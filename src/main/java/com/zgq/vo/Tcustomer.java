package com.zgq.vo;



public class Tcustomer  {

	// Fields

	private Integer id;
	private Integer customerId;
	private String idType;
	private String idInt;
	private String customerName;
	private String customerBirtyday;
	private String customerSex;
	private String customerAddress;

	// Constructors

	/** default constructor */
	public Tcustomer() {
	}

	/** minimal constructor */
	public Tcustomer(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Tcustomer(Integer id, Integer customerId, String idType, String idInt, String customerName,
			String customerBirtyday, String customerSex, String customerAddress) {
		this.id = id;
		this.customerId = customerId;
		this.idType = idType;
		this.idInt = idInt;
		this.customerName = customerName;
		this.customerBirtyday = customerBirtyday;
		this.customerSex = customerSex;
		this.customerAddress = customerAddress;
	}

	// Property accessors
	

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}



	public String getIdInt() {
		return this.idInt;
	}

	public void setIdInt(String idInt) {
		this.idInt = idInt;
	}


	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

	public String getCustomerBirtyday() {
		return this.customerBirtyday;
	}

	public void setCustomerBirtyday(String customerBirtyday) {
		this.customerBirtyday = customerBirtyday;
	}

	

	public String getCustomerSex() {
		return this.customerSex;
	}

	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}

	
	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}