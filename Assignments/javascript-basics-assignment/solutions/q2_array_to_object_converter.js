/* Write a Program to convert an array of objects to an object
	based on a given key */


	const convert = (arr, keyField) => {
		if(arr&&keyField)
		{
		const result = (array, keyField) => 
		   array.reduce((obj, item) => {
			   obj[item[keyField]] = item;
			   return obj;
		   }, {})
	   console.log(result(arr, keyField));
	   return result(arr, keyField);
		}
		else{
			return null;
		}
   };
   
/* For example,
INPUT - convert([{id: 1, value: 'abc'}, {id: 2, value: 'xyz'}], 'id')
OUTPUT - {
			'1': {id: 1, value: 'abc'},
			'2': {id: 2, value: 'xyz'}
		 }


*/

module.exports = convert;
