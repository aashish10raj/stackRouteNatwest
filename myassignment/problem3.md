```
BEGIN
Number x, sum
Array divisors
Input x
For i=0 to n < x
If x%i==0
divisors=i
endIf
EndFor
For i=0 to n < divisors.length
sum=sum+divisors[i]
EndFor
If sum==x and x!=1
Print Perfect number
EndIf
END
```
