/* Write a Program to Flatten a given n-dimensional array */
const flatten = (input) => {
	//var input = [1, [2, 3], [[4], [5]]];
	if('invalid value'==input)
	{
		return null;
	}
		function flatten(array) {
			return array.reduce(function(memo, el) {
			  var items = Array.isArray(el) ? flatten(el) : [el];
			  return memo.concat(items);
			}, []);
		  }
	const result = flatten(input);
	return result;
}


/* For example,
INPUT - flatten([1, [2, 3], [[4], [5]])
OUTPUT - [ 1, 2, 3, 4, 5 ]

*/

module.exports = flatten;
