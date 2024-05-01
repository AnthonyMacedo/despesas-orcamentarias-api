package com.despesasorcamentarias.api.v1.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class DataStoreModel {

	@JsonIgnore
	private String help;
	@JsonIgnore
	private String success;
	@JsonIgnoreProperties({"include_total", "resource_id", "fields", "records_format", "limit", "_links", "total"})
	private List<ResultModel> result;

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<ResultModel> getResult() {
		return result;
	}

	public void setResult(List<ResultModel> result) {
		this.result = result;
	}

}
