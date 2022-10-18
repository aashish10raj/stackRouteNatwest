package com.stackroute.datamunger.query.parser;

import java.util.List;

/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */

public class QueryParameter {
	private String file;
	private String baseQuery;
	private String Query_Type;
	private List<String> fields;
	private List<Restriction> restrictions;
	private List<String> logicalOperators;
	private List<AggregateFunction> aggregateFunctions;
	private List<String> orderByFields;
	private List<String> groupByFields;
	public String getQuery_Type() {
		return Query_Type;
	}

	public void setQuery_Type(String query_Type) {
		this.Query_Type = query_Type;
	}

	public void setFile(String file) {
		this.file = file;
	}



	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}

	public String getFileName() {

		return file;
	}

	public String getBaseQuery() {

		return baseQuery;
	}

	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}

	public List<Restriction> getRestrictions() {

		return restrictions;
	}
	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}
	public List<String> getLogicalOperators() {

		return logicalOperators;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<String> getFields() {

		return fields;
	}
	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}
	public List<AggregateFunction> getAggregateFunctions() {

		return aggregateFunctions;
	}
	public void setGroupByFields(List<String> groupByFields) {
		this.groupByFields = groupByFields;
	}

	public List<String> getGroupByFields() {

		return groupByFields;
	}
	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}

	public List<String> getOrderByFields() {

		return orderByFields;
	}
}