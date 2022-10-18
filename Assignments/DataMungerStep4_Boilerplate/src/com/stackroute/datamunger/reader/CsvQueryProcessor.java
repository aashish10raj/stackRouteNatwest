package com.stackroute.datamunger.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {
	/*
	 * Parameterized constructor to initialize filename. As you are trying to
	 * perform file reading, hence you need to be ready to handle the IO Exceptions.
	 */
	String fileName;
	BufferedReader br = null;

	public CsvQueryProcessor(String fileName)throws FileNotFoundException {
		this.fileName = fileName;
		br = new BufferedReader(new FileReader(fileName));
	}

	/*
	 * Implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file.
	 */

	@Override
	public Header getHeader() throws IOException {
		Header H= null;
		br.mark(1);
		String header = br.readLine();
		String[] head = header.split(",");
		br.reset();
		H = new Header(head);
		return H;
	}

	/**
	 * This method will be used in the upcoming assignments
	 */
	@Override
	public void getDataRow() {

	}

	/*
	 * Implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. In
	 * the previous assignment, we have tried to convert a specific field value to
	 * Integer or Double. However, in this assignment, we are going to use Regular
	 * Expression to find the appropriate data type of a field. Integers: should
	 * contain only digits without decimal point Double: should contain digits as
	 * well as decimal point Date: Dates can be written in many formats in the CSV
	 * file. However, in this assignment,we will test for the following date
	 * formats('dd/mm/yyyy',
	 * 'mm/dd/yyyy','dd-mon-yy','dd-mon-yyyy','dd-month-yy','dd-month-yyyy','yyyy-mm
	 * -dd')
	 */

	@Override
	public DataTypeDefinitions getColumnType() throws IOException {
		Object obj;
		int i = 0;
		String type = "";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String headerRow = br.readLine();
		String headerArgs[] = headerRow.split(",");
		String secondRow = br.readLine();
		secondRow += " ,";
		String[] dataElements = secondRow.split(",");
		String[] dataTypes = new String[headerArgs.length];
		if (dataElements != null) {
			for (i = 0; i < dataElements.length; i++) {
				if(i == dataElements.length-1) {
					dataTypes[i] = "java.lang.Object";
				}else{
					//System.out.println("DATA : "+dataElements[i]);
					//System.out.println("DATA TYPE : "+dataTypes[i]);
					// checking for Integer
					String regexInt = "[+-]?[0-9][0-9]*";
					Pattern p = Pattern.compile(regexInt);
					Matcher m = p.matcher(dataElements[i]);
					if (m.find() && m.group().equals(dataElements[i]))
//					System.out.println(dataElements[i] + " is a valid integer number");
						dataTypes[i] = "java.lang.Integer";
					else {
						// checking for floating point numbers
						String regexFloat = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
						Pattern pFloat = Pattern.compile(regexFloat);
						Matcher mFloat = p.matcher(dataElements[i]);
						if (m.find() && m.group().equals(dataElements[i]))
							dataTypes[i] = "java.lang.Float";
						else {
							// checking for date format dd/mm/yyyy
							// checking for date format mm/dd/yyyy
							// checking for date format dd-mon-yy
							// checking for date format dd-mon-yyyy
							// checking for date format dd-month-yy
							// checking for date format dd-month-yyyy
							// checking for date format yyyy-mm-dd
							if (dataElements[i].contains("/") || dataElements[i].contains("-")) {
								dataTypes[i] = "java.util.Date";
							} else
								dataTypes[i] = "java.lang.String";
						}
					}
				}
			}
		}
		br.close();
		DataTypeDefinitions t = new DataTypeDefinitions(dataTypes);
		return t;
	}
	// checking for Integer

	// checking for floating point numbers

	// checking for date format dd/mm/yyyy

	// checking for date format mm/dd/yyyy

	// checking for date format dd-mon-yy

	// checking for date format dd-mon-yyyy

	// checking for date format dd-month-yy

	// checking for date format dd-month-yyyy

	// checking for date format yyyy-mm-dd

}