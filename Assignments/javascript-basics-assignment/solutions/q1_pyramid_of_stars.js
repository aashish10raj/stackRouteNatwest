/* Write a program to build a `Pyramid of stars` of given height */

const buildPyramid = (rows) => {
	// Write your code here
     var row='';
    for(var i=1;i<=rows;i++)
    {
        for(var j=1;j<=(rows-i);j++)
        {
            row+=' ';
        }
        for(var v=1;v<=i;v++)
        {
            row+=' *';
        }
        row+='  \n';
    }
    return row;
};

/* For example,
INPUT - buildPyramid(6)
OUTPUT -
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/

module.exports = buildPyramid;
