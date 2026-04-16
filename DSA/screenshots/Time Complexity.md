**Approach**: Iterate from 1 to n and check if it is a factor. Count and return the answer.
```
int countFactors(n) {
count = 0;
for (int i = 1 to n) {
	if (n % i = = 0) {
	count = count +1 
	}
return count;	
}
}
```

> Servers have the capability of running 10^8 iterations in 1 second.

![[Pasted image 20250624221029.png]]

**Optimization:** i * j = n -----> then i and j are factors of n.
if i is a factor of n then n/i is a factor of n.

n = 24

| i   | n/i |
| --- | --- |
| 1   | 24  |
| 2   | 12  |
| 3   | 8   |
| 4   | 6   |
| 6   | 4   |
| 8   | 3   |
| 12  | 2   |
| 24  | 1   |
> factors are repeating after root of n.
until i 

until i <= n/i ----------> no repition
i * i <= n
i <= root(n)

> now only iterate toll root(n) and increase count of factors.

This code doesn't work
```
int countFactors(n) {
count = 0
for (i =1; i*i <= n; i++) {
	if (n % i == 0) {
		count += 2;
		}
	return count;
}
}
```
![[Pasted image 20250624232142.png]]

**Prime Number:** no. with exactly 2 factors ( 1 and itself)

```
boolean isPrime(n) {
int factors = countFactors(n) 

if (factors = = 2) {
	return true;
} else {
	return false;
}
}
```

How many numbers between [a,b] => `b-a+1`

**Sum of first n natural numbers:** n(n+1)/2

---
## GP
Sum of first n numbers of GP: a * (r^n -1) / (r-1)

Q. What do you mean by iterations?
Number of times a loop runs

> Execution time is not a good method to evaluate algorithms performance.

Q. What is a better metric? 
no. of iterations

# Asymptotic Analysis of Algorithms 
 - also called Big(O)
 - means analyzing performance of algorithm for large inputs
## Calculation of Big(O)
1. calculate iterations based on input size.
2. Ignore lower order terms.
3. Ignore constant coefficients.

### Comparison Order:
log(N) < sqrt(N) < N < N log (N) < N sqrt(N) < N^2 < N^3 < 2^N < N! < N^N

#### Issues with Big(O)
**Issue 1:** we cannot say one algo is always better than other algo

|          | A      | B    | Better? |
| -------- | ------ | ---- | ------- |
| N        | 10^3*N | N^2  |         |
| n = 10   | 10^4   | 100  | B       |
| n = 1000 | 10^6   | 10^6 | same    |
> Not always correct.

**Issue 2:** If we give two algo with same Big(O) you can't differentiate which is better.

# Importance of constraints
Q. If 1<= N <= 10^5
then which of the following Big(O) will work?

| Complexity   | Iterations    | Works |
| ------------ | ------------- | ----- |
| O(N^3)       | 10^15         | no    |
| O(N^2 log N) | 5* 10^10      | no    |
| O(N^2)       | 10^10         | no    |
| O(N log N)   | 10^5 log 10^5 | yes   |
| O(N)         | 10^5          | yes   |
>10^8 iterations is 1 sec

###### How to approach a problem?
 - Read the question and constraints carefully.
 - Formulate an idea or logic
 - Verify the correctness of the logic.
 - Mentally develop a Pseudocode or rough idea of loops.
 - Determine the time complexity based on the pseudocode.
 - Access if the time complexity is feasible and won't result in Time Limit Exceeded error.
 > In the worst care we can only do 10^7 to 10^8 iterations.

 - Re-evaluate the logic/ if time constraints are not met then again optimise your idea and repeat the steps.
 - Finally code the approach.

# Time complexity framework
Calculate number of times loop runs using 
 - starting 
 - boundary
 - steps
- Nested loops 
	- Independent loops: inner loop * outer loop
	- Dependent loops: table method
		- For each i see the pattern in j
		- sum up total iterations of j for each i

## Output Prediction
![[Pasted image 20250713105806.png]]
Output:
2 is even
4 is even
6 is even

![[Pasted image 20250713110608.png]]
Output:
Start
Inside fun 2
End

## Debugging TechniquesTime Complexity
Fix error in following Techniques:
![[Pasted image 20250713110848.png]]
Issue: no increment
Fix : i++

![[Pasted image 20250713110921.png]]
Issue: unidentified variable x
Fix: variable need to be declared before usage

![[Pasted image 20250713111258.png]]
![[Pasted image 20250713111310.png]]



