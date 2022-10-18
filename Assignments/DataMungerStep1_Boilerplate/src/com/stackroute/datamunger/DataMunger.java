package com.stackroute.datamunger;

/*There are total 5 DataMungertest files:
 * 
 * 1)DataMungerTestTask1.java file is for testing following 3 methods
 * a)getSplitStrings()  b) getFileName()  c) getBaseQuery()
 * 
 * Once you implement the above 3 methods,run DataMungerTestTask1.java
 * 
 * 2)DataMungerTestTask2.java file is for testing following 3 methods
 * a)getFields() b) getConditionsPartQuery() c) getConditions()
 * 
 * Once you implement the above 3 methods,run DataMungerTestTask2.java
 * 
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getLogicalOperators() b) getOrderByFields()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 * 
 * 4)DataMungerTestTask4.java file is for testing following 2 methods
 * a)getGroupByFields()  b) getAggregateFunctions()
 * 
 * Once you implement the above 2 methods,run DataMungerTestTask4.java
 * 
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataMunger {

	/*
	 * This method will split the query string based on space into an array of words
	 * and display it on console
	 */

	public String[] getSplitStrings(String queryString) {

		queryString=queryString.toLowerCase();
		String output[]=queryString.split(" ");
		return output;
	}

	/*
	 * Extract the name of the file from the query. File name can be found after a
	 * space after "from" clause. Note: ----- CSV file can contain a field that
	 * contains from as a part of the column name. For eg: from_date,from_hrs etc.
	 * 
	 * Please consider this while extracting the file name in this method.
	 */

	public String getFileName(String queryString) {

		int fromid=queryString.indexOf("from")+5;
		int csvid=queryString.indexOf("csv")+3;
		String string=queryString.substring(fromid,csvid);
		return string;
	}

	/*
	 * This method is used to extract the baseQuery from the query string. BaseQuery
	 * contains from the beginning of the query till the where clause
	 * 
	 * Note: ------- 1. The query might not contain where clause but contain order
	 * by or group by clause 2. The query might not contain where, order by or group
	 * by clause 3. The query might not contain where, but can contain both group by
	 * and order by clause
	 */
	
	public String getBaseQuery(String queryString) {

		String s[] = queryString.split(" where");
		if(s[0].contains("group by"))
		{
			s[0]=s[0].split("group by")[0];
		}
		return s[0].trim();
	}

	/*
	 * This method will extract the fields to be selected from the query string. The
	 * query string can have multiple fields separated by comma. The extracted
	 * fields will be stored in a String array which is to be printed in console as
	 * well as to be returned by the method
	 * 
	 * Note: 1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The field
	 * name can contain '*'
	 * 
	 */
	
	public String[] getFields(String queryString) {


		String s1[]= queryString.split(" ");
		String s2[]= s1[1].split(",");
		return s2;
	}

	/*
	 * This method is used to extract the conditions part from the query string. The
	 * conditions part contains starting from where keyword till the next keyword,
	 * which is either group by or order by clause. In case of absence of both group
	 * by and order by clause, it will contain till the end of the query string.
	 * Note:  1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
	 * might not contain where clause at all.
	 */
	
	public String getConditionsPartQuery(String queryString) {

		queryString = queryString.toLowerCase();
		String arr[]=getSplitStrings(queryString);
		if(!queryString.contains("where"))
		{
			return null;
		}
		String sath="";
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i].equals("where"))
			{
				for (int j=i+1;j<arr.length;j++)
				{
					if (arr[j].equals("order")||arr[j].equals("group"))
					{
						break;
					}
					else
					{
						sath=sath.concat(" "+arr[j]);
					}
				}
				break;
			}
		}
		return sath.trim();
	}

	/*
	 * This method will extract condition(s) from the query string. The query can
	 * contain one or multiple conditions. In case of multiple conditions, the
	 * conditions will be separated by AND/OR keywords. for eg: Input: select
	 * city,winner,player_match from ipl.csv where season > 2014 and city
	 * ='Bangalore'
	 * 
	 * This method will return a string array ["season > 2014","city ='bangalore'"]
	 * and print the array
	 * 
	 * Note: ----- 1. The field name or value in the condition can contain keywords
	 * as a substring. For eg: from_city,job_order_no,group_no etc. 2. The query
	 * might not contain where clause at all.
	 */

	public String[] getConditions(String queryString) {

		String s[]= queryString.split("where");
		//String S[]=(s[1].split(" group "));

		if(s.length>1) {
			String S[] = (s[1].split(" group | order "));
			if(S.length>0) {
				S[0] = S[0].replace("B", "b");
				S[0] = S[0].replace("D", "d");
				String k[] = S[0].split(" or | and ");
				for (int i = 0; i < k.length; i++) {
					k[i] = k[i].trim();
				}
				return k;
			}
			else
				return null;
		}
		else
			return null;
	}

	/*
	 * This method will extract logical operators(AND/OR) from the query string. The
	 * extracted logical operators will be stored in a String array which will be
	 * returned by the method and the same will be printed Note:  1. AND/OR
	 * keyword will exist in the query only if where conditions exists and it
	 * contains multiple conditions. 2. AND/OR can exist as a substring in the
	 * conditions as well. For eg: name='Alexander',color='Red' etc. Please consider
	 * these as well when extracting the logical operators.
	 * 
	 */

	public String[] getLogicalOperators(String queryString) {
		Pattern pattern1=Pattern.compile("( \\band\\b )");
		Matcher matcher1=pattern1.matcher(queryString);
		String s1="",s2="";
		if(matcher1.find())
		{
			s1=matcher1.group().toString();
		}
		Pattern pattern2=Pattern.compile("( \\bor\\b )");
		Matcher matcher2=pattern2.matcher(queryString);
		if(matcher2.find())
		{
			s2=matcher2.group().toString();
		}
		if(s1.length()>0 && s2.length()>0) {
			s1=s1.trim();
			s2=s2.trim();
			String S[] = {s1,s2};
			return S;
		}
		else if(s1.length()>0)
		{
			s1=s1.trim();
			String S[]={s1};
			return S;
		}
		else if (s2.length()>0)
		{
			s2=s2.trim();
			String S[]={s2};
			return S;
		}
		else
			return null;
	}

	/*
	 * This method extracts the order by fields from the query string. Note: 
	 * 1. The query string can contain more than one order by fields. 2. The query
	 * string might not contain order by clause at all. 3. The field names,condition
	 * values might contain "order" as a substring. For eg:order_number,job_order
	 * Consider this while extracting the order by fields
	 */

	public String[] getOrderByFields(String queryString) {

		if(!queryString.contains("order by"))
			return null;
		String S[]=queryString.split("order by")[1].trim().split(" ");
		return S;
	}

	/*
	 * This method extracts the group by fields from the query string. Note:
	 * 1. The query string can contain more than one group by fields. 2. The query
	 * string might not contain group by clause at all. 3. The field names,condition
	 * values might contain "group" as a substring. For eg: newsgroup_name
	 * 
	 * Consider this while extracting the group by fields
	 */

	public String[] getGroupByFields(String queryString) {

		if(!queryString.contains("group by"))
			return null;
		String []S=queryString.split("group by")[1].trim().split(" ");
		return S;
	}

	/*
	 * This method extracts the aggregate functions from the query string. Note:
	 *  1. aggregate functions will start with "sum"/"count"/"min"/"max"/"avg"
	 * followed by "(" 2. The field names might
	 * contain"sum"/"count"/"min"/"max"/"avg" as a substring. For eg:
	 * account_number,consumed_qty,nominee_name
	 * 
	 * Consider this while extracting the aggregate functions
	 */

	public String[] getAggregateFunctions(String queryString) {

		boolean contain=(queryString.contains("count")||queryString.contains("sum")||queryString.contains("min")||queryString.contains("avg")||queryString.contains("max"));
		String s="";
		String S1[],S2[];
		if(contain)
		{
			S1=queryString.split(" ");
			S2=S1[1].trim().split(",");
			for(int i=0;i<S2.length;i++)
			{
				if(S2[i].contains("("))
				{
					s+=S2[i]+",";
				}
			}

			String S[]=s.split(",");
			return S;


		}
		else
			return null;

	}

}