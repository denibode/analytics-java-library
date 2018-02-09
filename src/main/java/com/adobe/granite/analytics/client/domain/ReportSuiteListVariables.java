package com.adobe.granite.analytics.client.domain;

import java.util.List;

public class ReportSuiteListVariables {

	private String rsid;

	private String siteTitle;

	private List<ListVariable> listVariables;

	public String getRsid() {
		return rsid;
	}

	public void setRsid(String rsid) {
		this.rsid = rsid;
	}

	public String getSiteTitle() {
		return siteTitle;
	}

	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	public List<ListVariable> getListVariables() {
		return listVariables;
	}

	public void setListVariables(List<ListVariable> listVariables) {
		this.listVariables = listVariables;
	}

	@Override
	public String toString() {
		return String.format("ReportSuiteListVariables [rsid=%s, siteTitle=%s, listVariables=%s]", rsid, siteTitle, listVariables);
	}

}
