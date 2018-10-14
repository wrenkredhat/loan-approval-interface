package com.mybank.global.risk.credit;

import java.math.BigDecimal;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class IntermediateValue implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "INTERMEDIATEVALUE_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "INTERMEDIATEVALUE_ID_SEQ", name = "INTERMEDIATEVALUE_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String packageName;

	private java.lang.String valueName;

	private java.lang.Object refObject;
	
	private java.lang.Object valObject;

	public IntermediateValue() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(java.lang.String packageName) {
		this.packageName = packageName;
	}

	public java.lang.String getValueName() {
		return this.valueName;
	}

	public void setValueName(java.lang.String valueName) {
		this.valueName = valueName;
	}

	public java.math.BigInteger getIntValue() {
		return (java.math.BigInteger)this.valObject;
	}

	public void setIntValue(java.math.BigInteger intValue) {
		this.valObject = intValue;
	}

	public java.util.Date getDateValue() {
		return (java.util.Date)this.valObject;
	}

	public void setDateValue(java.util.Date dateValue) {
		this.valObject = dateValue;
	}

	public java.lang.String getStringValue() {
		return (java.lang.String)this.valObject;
	}

	public void setStringValue(java.lang.String stringValue) {
		this.valObject = stringValue;
	}

	public java.lang.Object getRefObject() {
		return this.refObject;
	}

	public void setRefObject(java.lang.Object refObject) {
		this.refObject = refObject;
	}

	public java.math.BigDecimal getDecimalValue() {
		return (java.math.BigDecimal)this.valObject;
	}

	public void setDecimalValue(java.math.BigDecimal decimalValue) {
		this.valObject = decimalValue;
	}
}