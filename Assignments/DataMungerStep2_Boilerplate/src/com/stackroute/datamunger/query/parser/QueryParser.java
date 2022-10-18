package com.stackroute.datamunger.query.parser;

/*There are total 4 DataMungerTest file:
 * 
 * 1)DataMungerTestTask1.java file is for testing following 4 methods
 * a)getBaseQuery()  b)getFileName()  c)getOrderByClause()  d)getGroupByFields()
 * 
 * Once you implement the above 4 methods,run DataMungerTestTask1.java
 * 
 * 2)DataMungerTestTask2.java file is for testing following 2 methods
 * a)getFields() b) getAggregateFunctions()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask2.java
 * 
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getRestrictions()  b)getLogicalOperators()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 * 
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueryParser {

	private QueryParameter queryParameter = new QueryParameter();

	/*
	 * This method will parse the queryString and will return the object of
	 * QueryParameter class
	 */
	public QueryParameter parseQuery(String queryString) {

		queryParameter.setFile(getFileName(queryString));
		queryParameter.setBaseQuery(getBaseQuery(queryString));
		queryParameter.setOrderByFields(getOrderByFields(queryString));
		queryParameter.setGroupByFields(getGroupByFields(queryString));
		queryParameter.setAggregateFunctions(getAggregateFunction(queryString));
		queryParameter.setLogicalOperators(getLogicalOperators(queryString));
		queryParameter.setRestrictions(getRestrictions(queryString));
		queryParameter.setFields(getFields(queryString));
		return queryParameter;


	}

	/*
	 * Extract the name of the file from the query. File name can be found after the
	 * "from" clause.
	 */
	public String getFileName(String queryString) {
		int fromid = queryString.indexOf("from") + 5;
		int csvid = queryString.indexOf("csv") + 3;
		String string = queryString.substring(fromid, csvid);
		return string;

	}

	/*
	 * 
	 * Extract the baseQuery from the query.This method is used to extract the
	 * baseQuery from the query string. BaseQuery contains from the beginning of the
	 * query till the where clause
	 */
	public String getBaseQuery(String queryString) {

		String s[] = queryString.split(" where");
		if (s[0].contains("group by")) {
			s[0] = s[0].split("group by")[0];
		}
		return s[0].trim();
	}
	/*
	 * extract the order by fields from the query string. Please note that we will
	 * need to extract the field(s) after "order by" clause in the query, if at all
	 * the order by clause exists. For eg: select city,winner,team1,team2 from
	 * data/ipl.csv order by city from the query mentioned above, we need to extract
	 * "city". Please note that we can have more than one order by fields.
	 */
	public List<String> getOrderByFields(String queryString) {
		if (!queryString.contains("order by")) {
			return null;
		} else {
			String S[] = queryString.split("order by")[1].trim().split(",");
			List<String> L = Arrays.asList(S[0]);
			return L;
		}
	}
	/*
	 * Extract the group by fields from the query string. Please note that we will
	 * need to extract the field(s) after "group by" clause in the query, if at all
	 * the group by clause exists. For eg: select city,max(win_by_runs) from
	 * data/ipl.csv group by city from the query mentioned above, we need to extract
	 * "city". Please note that we can have more than one group by fields.
	 */
	public List<String> getGroupByFields(String queryString) {
		if (!queryString.contains("group by"))
			return null;
		else {
			String[] S = queryString.split("group by")[1].trim().split(" ");
			List<String> L = Arrays.asList(S[0]);
			return L;
		}

	}
	/*
	 * Extract the selected fields from the query string. Please note that we will
	 * need to extract the field(s) after "select" clause followed by a space from
	 * the query string. For eg: select city,win_by_runs from data/ipl.csv from the
	 * query mentioned above, we need to extract "city" and "win_by_runs". Please
	 * note that we might have a field containing name "from_date" or "from_hrs".
	 * Hence, consider this while parsing.
	 */

	public List<String> getFields(String queryString) {

		String s1[] = queryString.split(" ");
		String s2[] = s1[1].split(",");
		List<String> L = Arrays.asList(s2);
		return L;
	}
	/*
	 * Extract the conditions from the query string(if exists). for each condition,
	 * we need to capture the following: 1. Name of field 2. condition 3. value
	 * 
	 * For eg: select city,winner,team1,team2,player_of_match from data/ipl.csv
	 * where season >= 2008 or toss_decision != bat
	 * 
	 * here, for the first condition, "season>=2008" we need to capture: 1. Name of
	 * field: season 2. condition: >= 3. value: 2008
	 * 
	 * the query might contain multiple conditions separated by OR/AND operators.
	 * Please consider this while parsing the conditions.
	 * 
	 */
	public List<Restriction> getRestrictions(String queryString) {
		queryString=queryString.trim();
		String wheres[] = queryString.trim().split("where");
		LinkedList<Restriction> restrictions = new LinkedList<Restriction>();
		if (wheres.length == 1) {
			return null;
		}
		String conditions[] = wheres[1].trim().split("order by|group by");
		String condition[] = conditions[0].trim().split(" or | and ");
		for (int i = 0; i < condition.length; i++) {
			if (condition[i].contains(">=")) {
				String fields[] = condition[i].trim().split(">=");
				Restriction restriction = new Restriction(fields[0].trim(), fields[1].trim(), ">=");
				restrictions.add(restriction);
			} if (condition[i].contains("<=")) {
				String fields[] = condition[i].trim().split("<=");
				Restriction restriction = new Restriction(fields[0].trim(), fields[1].trim(), "<=");
				restrictions.add(restriction);
			}
			if (condition[i].contains("=")) {
				String fields[] = condition[i].trim().split("=");
				Restriction restriction = new Restriction(fields[0].trim(), fields[1].replace("'","").trim(), "=");
				restrictions.add(restriction);
			}
			if (condition[i].contains(">")) {
				String fields[] = condition[i].trim().split(">");
				Restriction restriction = new Restriction(fields[0].trim(), fields[1].trim(), ">");
				restrictions.add(restriction);
			}
			if (condition[i].contains("<")) {
				String fields[] = condition[i].trim().split("<");
				Restriction restriction = new Restriction(fields[0].trim(), fields[1].trim(), "<");
				restrictions.add(restriction);
			}

		}
		return restrictions;
	}

	/*
	 * Extract the logical operators(AND/OR) from the query, if at all it is
	 * present. For eg: select city,winner,team1,team2,player_of_match from
	 * data/ipl.csv where season >= 2008 or toss_decision != bat and city =
	 * bangalore
	 * 
	 * The query mentioned above in the example should return a List of Strings
	 * containing [or,and]
	 */
	public List<String> getLogicalOperators(String queryString) {
		LinkedList<String>logicalOperators=new LinkedList<String>();

		String small=queryString.trim().toLowerCase();
		String[]here=small.split(" where ");
		if(here.length==1)return null;

		String[]pen= here[1].split(" ");

		for(int i=0;i<pen.length;i++)
		{
			if(pen[i].equals("and")||pen[i].equals("or"))
				logicalOperators.add(pen[i]);
		}



		return logicalOperators;

	}

	/*
	 * Extract the aggregate functions from the query. The presence of the aggregate
	 * functions can determined if we have either "min" or "max" or "sum" or "count"
	 * or "avg" followed by opening braces"(" after "select" clause in the query
	 * string. in case it is present, then we will have to extract the same. For
	 * each aggregate functions, we need to know the following: 1. type of aggregate
	 * function(min/max/count/sum/avg) 2. field on which the aggregate function is
	 * being applied.
	 * 
	 * Please note that more than one aggregate function can be present in a query.
	 * 
	 * 
	 */
	public List<AggregateFunction> getAggregateFunction(String queryString) {
		String[] splitString = queryString.split("[\\s,;)(]+");
		LinkedList<AggregateFunction> aggregateFunctions = new LinkedList<AggregateFunction>();
		for (int i = 0; i < splitString.length; i++) {
			if (splitString[i].equals("sum")) {
				AggregateFunction aggregateFunction = new AggregateFunction(splitString[i + 1], "sum");
				aggregateFunctions.add(aggregateFunction);
			} else if (splitString[i].equals("avg")) {
				AggregateFunction aggregateFunction = new AggregateFunction(splitString[i + 1], "avg");
				aggregateFunctions.add(aggregateFunction);
			} else if (splitString[i].equals("count")) {
				AggregateFunction aggregateFunction = new AggregateFunction(splitString[i + 1], "count");
				aggregateFunctions.add(aggregateFunction);
			} else if (splitString[i].equals("min")) {
				AggregateFunction aggregateFunction = new AggregateFunction(splitString[i + 1], "min");
				aggregateFunctions.add(aggregateFunction);
			} else {
				if (splitString[i].equals("max")) {
					AggregateFunction aggregateFunction = new AggregateFunction(splitString[i + 1], "max");
					aggregateFunctions.add(aggregateFunction);
				}
			}
		}
		if (aggregateFunctions.size() != 0)
			return aggregateFunctions;
		else
			return null;
	}

}