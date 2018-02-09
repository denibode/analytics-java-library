package com.adobe.granite.analytics.client.domain;

import java.util.List;

public class ListVariable {

	private Integer id;

	private String name;

	private String description;

	private ListVariableAllocationTypeEnum allocationType;

	private Boolean enabled;

	private String valueDelimiter;

	private String maxValues;

	private String expirationType;

	private Integer expirationCustomDays;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ListVariableAllocationTypeEnum getAllocationType() {
		return allocationType;
	}

	public void setAllocationType(ListVariableAllocationTypeEnum allocationType) {
		this.allocationType = allocationType;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	public String getValueDelimiter() {
		return valueDelimiter;
	}

	public void setValueDelimiter(String valueDelimiter) {
		this.valueDelimiter = valueDelimiter;
	}

	public String getMaxValues() {
		return maxValues;
	}

	public void setMaxValues(String maxValues) {
		this.maxValues = maxValues;
	}

	public String getExpirationType() {
		return expirationType;
	}

	public void setExpirationType(String expirationType) {
		this.expirationType = expirationType;
	}

	public Integer getExpirationCustomDays() {
		return expirationCustomDays;
	}

	public void setExpirationCustomDays(Integer expirationCustomDays) {
		this.expirationCustomDays = expirationCustomDays;
	}


	@Override
	public String toString() {
		return String
				.format("ListVariable [id=%s, name=%s, description=%s, allocationType=%s, enabled=%s, valueDelimiter=%s, maxValues=%s, expirationType=%s, expirationCustomDays=%s]",
						id, name, description, allocationType, enabled, valueDelimiter, maxValues, expirationType, expirationCustomDays
						);
	}
}
