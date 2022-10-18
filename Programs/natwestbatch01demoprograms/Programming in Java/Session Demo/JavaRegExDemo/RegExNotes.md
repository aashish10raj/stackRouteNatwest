**Regular expressions** are used for defining String patterns that can be used 
for searching, manipulating and editing a text. 
These expressions are also known as **Regex** (short form of Regular expressions).

# Types
1) java.util.regex.Pattern – Used for defining patterns
2) java.util.regex.Matcher – Used for performing match operations on text using patterns

# java.util.regex.Pattern class:
**Methods**
1) Static Pattern compile (String regEx)
        Compiles the given regex and returns the instance of a pattern.
2) Matcher matcher (CharSequence input)
        Creates a matcher that will match the given input against this pattern.
3) Static Boolean Matches (String regex)
        It works as a combination of compile and matcher methods
4) String[] split(CharSequence input)
        Used to split the given String around matches of a given pattern

  
# java.util.regex.Matcher class:
**Methods**
1) Static Boolean Matches (String regex)
        Tests whether the given regular expression matches or not
2) Boolean find()
        Used to find the next expression that matches the pattern
3) Boolean find(int start)
        Searches the next expression from the given start number
4) String group()
        Used to return the matched sequence
5) int start() 
        Returns the starting index
6) int end()
        Returns the ending index
        
        
# String Literals
Lets say you just want to search a particular string in the text for e.g. “abc” then we can simply write
the code like this: Here text and regex both are same.
Pattern.matches("abc", "abc")

# Character Classes
A character class matches a single character in the input text against multiple allowed characters in the 
character class. For example [Ss]tackroute would match all the occurrences of String “stackroute” with either lower case 
or upper case S”. 

Few more examples:
------------------
Pattern.matches("[pqr]", "abcd"); It would give false as no p,q or r in the text
Pattern.matches("[pqr]", "r"); Return rtue as r is found
Pattern.matches("[pqr]", "pq"); Return false as any one of them can be in text not both.

Here is the complete list of various character classes constructs:
------------------------------------------------------------------
[abc]: It would match with text if the text is having either one of them(a,b or c) and only once.
[^abc]:  Any single character except a, b, or c (^ denote negation)
[a-zA-Z]:  a through z, or A through Z, inclusive (range)
[a-d[m-p]]:  a through d, or m through p: [a-dm-p] (union)
[a-z&&[def]]:  Any one of them (d, e, or f)
[a-z&&[^bc]]: a through z, except for b and c: [ad-z] (subtraction)
[a-z&&[^m-p]]:  a through z, and not m through p: [a-lq-z] (subtraction)

# Predefined Character Classes – Metacharacters
These are like short codes which you can use while writing regex.

Construct	Description
.   ->	Any character (may or may not match line terminators)
\d  ->	A digit: [0-9]
\D  ->	A non-digit: [^0-9]
\s  ->	A whitespace character: [ \t\n\x0B\f\r]
\S  ->	A non-whitespace character: [^\s]
\w  ->	A word character: [a-zA-Z_0-9]
\W  ->	A non-word character: [^\w]

For e.g.
-------
Pattern.matches("\\d", "1"); would return true
Pattern.matches("\\D", "z"); return true
Pattern.matches(".p", "qp"); return true, dot(.) represent any character

# Boundary Matchers
^	Matches the beginning of a line.
$	Matches then end of a line.
\b	Matches a word boundary.
\B	Matches a non-word boundary.
\A	Matches the beginning of the input text.
\G	Matches the end of the previous match
\Z	Matches the end of the input text except the final terminator if any.
\z	Matches the end of the input text.

For e.g.
--------
Pattern.matches("^Hello$", "Hello"): return true, Begins and ends with Hello
Pattern.matches("^Hello$", "Namaste! Hello"): return false, does not begin with Hello
Pattern.matches("^Hello$", "Hello Namaste!"): return false, Does not end with Hello

# Quantifiers

Greedy  	Reluctant	        Possessive	Matches
----------------------------------------------------
X?	        X??	X?+	            Matches X once, or not at all (0 or 1 time).
X*  	    X*?	X*+	            Matches X zero or more times.
X+	        X+?	X++	            Matches X one or more times.
X{n}	    X{n}?	X{n}+	    Matches X exactly n times.
X{n,}	    X{n,}?	X{n,}+	    Matches X at least n times.
X{n, m)	    X{n, m)? X{n, m)+	Matches X at least n time, but at most m times.