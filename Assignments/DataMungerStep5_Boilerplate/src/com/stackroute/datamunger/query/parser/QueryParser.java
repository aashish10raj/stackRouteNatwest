package com.stackroute.datamunger.query.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryParser {

	private QueryParameter queryParameter = new QueryParameter();
	/*
	 * This method will parse the queryString and will return the object of
	 * QueryParameter class
	 */
	public QueryParameter parseQuery(String queryString) {
		queryParameter.setFileName(getFileName(queryString));
		queryParameter.setBaseQuery(getBaseQuery(queryString));
		queryParameter.setOrderByFields(getOrderByFields(queryString));
		queryParameter.setGroupByFields(getGroupByFields(queryString));
		queryParameter.setFields(getFields(queryString));
		queryParameter.setLogicalOperators(getLogicalOperators(queryString));
		queryParameter.setAggregateFunctions(getAggregateFunctions(queryString));
		queryParameter.setRestrictions(getConditions(queryString));
		return queryParameter;
	}
		/*
		 * extract the name of the file from the query. File name can be found after the
		 * "from" clause.
		 */
	public String getFileName(String queryString) {
		Pattern p = Pattern.compile("(.*) (.*.csv)(.*)");
		Matcher matcher = p.matcher(queryString);
		String rslt = "";
		while (matcher.find()) {
			rslt = matcher.group(2);
		}
		return rslt;
	}
		
		/*
		 * extract the order by fields from the query string. Please note that we will
		 * need to extract the field(s) after "order by" clause in the query, if at all
		 * the order by clause exists. For eg: select city,winner,team1,team2 from
		 * data/ipl.csv order by city from the query mentioned above, we need to extract
		 * "city". Please note that we can have more than one order by fields.
		 */
	public ArrayList<String> getOrderByFields(String queryString) {
		Pattern p = Pattern.compile("(.*order by )(.*)");
		Matcher matcher = p.matcher(queryString);
		ArrayList<String> rslt = new ArrayList<>();
		while (matcher.find())
			rslt.add(matcher.group(2));
		return rslt;
	}
		
		/*
		 * extract the group by fields from the query string. Please note that we will
		 * need to extract the field(s) after "group by" clause in the query, if at all
		 * the group by clause exists. For eg: select city,max(win_by_runs) from
		 * data/ipl.csv group by city from the query mentioned above, we need to extract
		 * "city". Please note that we can have more than one group by fields.
		 */
	public ArrayList<String> getGroupByFields(String queryString) {
		Pattern p=null;
		p = Pattern.compile("(.*group by )(.*)");
		if(queryString.contains("order by"))
			p = Pattern.compile("(.*group by )(.*)( order by.*)");
		Matcher matcher = p.matcher(queryString);
		ArrayList<String> rslt = new ArrayList<String>();
		while (matcher.find())
			rslt.add(matcher.group(2));
		return rslt;
	}
	
		
		/*
		 * extract the selected fields from the query string. Please note that we will
		 * need to extract the field(s) after "select" clause followed by a space from
		 * the query string. For eg: select city,win_by_runs from data/ipl.csv from the
		 * query mentioned above, we need to extract "city" and "win_by_runs". Please
		 * note that we might have a field containing name "from_date" or "from_hrs".
		 * Hence, consider this while parsing.
		 */
	public ArrayList<String> getFields(String queryString) { //check
		Pattern p = Pattern.compile("(.*) (.*) (from .*)");
		Matcher matcher = p.matcher(queryString);
		String[] rslt = null;
		while (matcher.find()) {
			rslt = matcher.group(2).split(",");
		}
		List<String> list = Arrays.asList(rslt);
		return new ArrayList<>(list);
	}	
		
		
		
		/*
		 * extract the conditions from the query string(if exists). for each condition,
		 * we need to capture the following: 
		 * 1. Name of field 
		 * 2. condition 
		 * 3. value
		 * 
		 * For eg: select city,winner,team1,team2,player_of_match from data/ipl.csv
		 * where season >= 2008 or toss_decision != bat
		 * 
		 * here, for the first condition, "season>=2008" we need to capture: 
		 * 1. Name of field: season 
		 * 2. condition: >= 
		 * 3. value: 2008
		 * 
		 * the query might contain multiple conditions separated by OR/AND operators.
		 * Please consider this while parsing the conditions.
		 * 
		 */
	
	public List<Restriction> getConditions(String queryString) {
        
        /*
         *  Logic -- Pass the queryString to the getConditionPartQuery to get our condition as a String.
         * If the where keyword is not there then condition string will be null hence return null. else
         * split the string on (and or keyword). The main idea here is we are spliting on (space and space) 
         * not just (and) because some field name may also contain ...and... as there substring.
         */  
               String inlower=queryString.trim();
               String tokens[]=inlower.trim().split("where");
               
               if(tokens.length==1)
                   {return null ;}
               
               String conditions[]=tokens[1].trim().split("order by|group by");
               String indi[]=conditions[0].trim().split(" and | or ");
               List<Restriction>restrictionList=new LinkedList<Restriction>();
               for (String string : indi) {
                   String condition = "";
                   if(string.contains(">=")) {
                       condition = ">=";
                   } else if(string.contains("<=")) {
                       condition = "<=";
                   } else if(string.contains("!=")) {
                       condition = "!=";
                   } else if(string.contains(">")) {
                       condition = ">";
                   } else if(string.contains("<")) {
                       condition = "<";
                   } else if(string.contains("=")) {
                       condition = "=";
                   }
                   String name = string.split(condition)[0].trim();
                   String value = string.split(condition)[1].trim().replaceAll("'", "");
                   Restriction restrictionInstance = new Restriction(name, value, condition);
                   restrictionList.add(restrictionInstance);
               }
               return restrictionList;
           }

		/*
		 * extract the logical operators(AND/OR) from the query, if at all it is
		 * present. For eg: select city,winner,team1,team2,player_of_match from
		 * data/ipl.csv where season >= 2008 or toss_decision != bat and city =
		 * bangalore
		 * 
		 * the query mentioned above in the example should return a List of Strings
		 * containing [or,and]
		 */
	public ArrayList<String> getLogicalOperators(String queryString) {
		if(queryString.contains("where"))
		{
			ArrayList<String> finalResList=new ArrayList<String>();

			queryString = ConditionsPartQueryExtractor(queryString);
			String[] strArr=queryString.split(" ");
			for(int i=0;i<strArr.length;i++) {
				if (strArr[i].equals("and")) {
					finalResList.add("and");
				}
				else if (strArr[i].equals("or")) {
					finalResList.add("or");
				}
			}
			return finalResList;
		}
		else
			return null;
	}
	public String ConditionsPartQueryExtractor(String queryString) {
		if(queryString.contains(" where ")) {  // to check if query string contains 'where'
			//queryString = queryString.toLowerCase();
			String[] trimFrom = queryString.split("where ");
			queryString=trimFrom[1];
			String[] splitOrderby = queryString.split(" order by | group by ");
			queryString = splitOrderby[0];
			return queryString;
		}
		else
			return queryString;
	}
		
		/*
		 * extract the aggregate functions from the query. The presence of the aggregate
		 * functions can determined if we have either "min" or "max" or "sum" or "count"
		 * or "avg" followed by opening braces"(" after "select" clause in the query
		 * string. in case it is present, then we will have to extract the same. For
		 * each aggregate functions, we need to know the following: 
		 * 1. type of aggregate function(min/max/count/sum/avg) 
		 * 2. field on which the aggregate function is being applied
		 * 
		 * Please note that more than one aggregate function can be present in a query
		 * 
		 * 
		 */
	
	public ArrayList<AggregateFunction> getAggregateFunctions(String queryString) {
		int indexSum = queryString.lastIndexOf("sum(");
		int indexCount = queryString.lastIndexOf("count(");
		int indexMin = queryString.lastIndexOf("min(");
		int indexMax = queryString.lastIndexOf("max(");
		int indexAvg = queryString.lastIndexOf("avg(");
		if (indexSum == -1 && indexCount == -1 && indexMin == -1 && indexMax == -1 && indexAvg == -1)
			return null;
		int largestIndex = Math.max(indexSum, Math.max(indexCount, Math.max(indexMin, Math.max(indexMax, indexAvg))));
		int lastIndex = 0;
		for (int i = largestIndex; i < queryString.length(); i++) {
			if (queryString.charAt(i) == ')') {
				lastIndex = i;
				break;
			}
		}
		int firstIndexSum = queryString.indexOf("sum(");
		int firstIndexCount = queryString.indexOf("count(");
		int firstIndexMin = queryString.indexOf("min(");
		int firstIndexMax = queryString.indexOf("max(");
		int firstIndexAvg = queryString.indexOf("avg(");
		if (firstIndexSum == -1)
			firstIndexSum = Integer.MAX_VALUE;
		if (firstIndexCount == -1)
			firstIndexCount = Integer.MAX_VALUE;
		if (firstIndexMin == -1)
			firstIndexMin = Integer.MAX_VALUE;
		if (firstIndexMax == -1)
			firstIndexMax = Integer.MAX_VALUE;
		if (firstIndexAvg == -1)
			firstIndexAvg = Integer.MAX_VALUE;
		int minimumIndex = Math.min(firstIndexSum, Math.min(firstIndexCount, Math.min(firstIndexMin, Math.min(firstIndexMax, firstIndexAvg))));
		String temp = queryString.substring(minimumIndex, lastIndex + 1);
		String[] rslt = temp.split(",");
		ArrayList<AggregateFunction> list = new ArrayList<>();
		for(String s:rslt){
			String[] temp1=s.split("\\(|\\)");
			list.add(new AggregateFunction(temp1[1],temp1[0]));
		}
		return list;
	}

	public String getBaseQuery(String queryString) {
		String baseQuery=(queryString.split("order by")[0].split("group by")[0].split("where")[0]).trim();
		return baseQuery;
	}
}
