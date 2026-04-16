 - Collection of same types of data.
 - the data type be of any type i.e. int, float, char, etc.
 - `datatype nameofArray[size]`; = int arr[n];
 - Array is a sequential data type.
 - An array of size N will have 0 to N-1 index.

Q. Print all elements of the array.
```
void printArray(arr[ ], n) {
for (i = 0 to n-1) {
print(arr[i]);
}
}
```
 TC: O(N)
 SC: O(1)
**Q: [[Time Complexity|TC]] to access i^th index of an array:** O(1) because as array is sequentially stored, and supports random access.

**Q: Given an array arr of size N. Reverse the array.**
N=5
arr = {1,2,3,4,5}
reverse:{5,4,3,2,1}
*Approach:* Two pointers and swap
![[Pasted image 20250704001704.png]]
 - Start with keeping pointers i at index 0 and pointer j at index N-1.
 - Swap elements and move pointers i to the right and j to the left.
 - Continue until i and j don't meet as cross each other.
```
void reverse (arr[], start, end) {
int i = start;
int j = end;
while(i < j) {
temp = arr[i]
arr[i] = arr[j]
arr[j] = temp
i++
j--
}
} 

void solve(arr[], int N) {
return reverse(arr, 0 , N-1)
}
```
Iterations= N/2
TC: O(N)
SC: O(1)
**Q: Rotate Array K times: #Microsoft [^1]
Given an array 'arr' of size N. Rotate the array from right to left 'k' times.**
Example: N = 5
arr= {1,2,3,4,5}
k =1 
After Rotation: {5,1,2,3,4}

Example 2: N= 5
arr= {1,2,3,4,5}
k =2
After rotation: {4,5,1,2,3}

**Approach 1:** 
1. Bruteforce: Perform 1 rotation k times.
2. Keep the last element in a temp variable.
3. move all the elements from 0 to N-2 to 1 to N-1.
4. arr[0] = temp

void rotatek(arr[], N, k) {
	for ( i =1 to k){
		temp = arr[N-1]
		for ( j = n-1 to 1) {
		arr[j]= arr[j-1]
		}
	arr[0] = temp
	}
}
TC: O(K * N)

**Approach 2:** Optimized
![[Pasted image 20250708230119.png]]
![[Pasted image 20250708230135.png]]
- Reverse the whole array.
- Reverse first k elements
- Reverse the left N-k elements.

```
void rotatek( arr[],N, K) {
	reverse(arr, 0 , N-1) // whole array
	reverse(arr, 0 ,k-1) // first k
	reverse(arr, k , n-1) // last n-k
}
```

TC: O(N + K + N-K) = O(N)
SC: O(1)

[^1]: Edge case: 
Edge Case arr = {1 2 3 4 5} N=5 K=6
 - If we rotate an array of size N by N times then we get original array back
 - Every notation in multiple of N is redundant
 - K = K % N

## Dynamic Arrays
It caters the only drawback of normal arrays i.e. the size is fixed and has to be declared before hand.
 - It has automatic resizing.
 - It expands as you add more elements.
**Strengths:** 1. Fast Lookup: O(1)
2. variable size: resizable 
**Weakness:** At times slower than normal arrays while inserting/expanding.
![[Pasted image 20250708232612.png]]

## Some common loop patterns
Example 1: Constant TC: O(1)
```
function(input) {
return input*input;
}
```

SC: O(1)

Example 2: Linear iteration
```
function iterate(N) {
	for i from 1 to N{
	print(i)
	}
}
```
TC: O(N)
SC:O(1)

Example 3: Nested Loops (quadratic complexity)
```
function analyze(N) {
	for i 1 to N {
		for j 1 to N {
			print(i,j)}
			}
	for i from 1 to N {
		for j from 1 to N{
			print(i+1, j+1)
			}
		}
}
```

TC: O(N^2)
SC: O(1)

Example 4: Logarithmic Growth
```
function logscale (N) {
	i = 1;
	while i <= N {
		print i 
		i = i * 2
		}
}
```
![[Pasted image 20250712123136.png]]

```
function logscale(N) {
	i= N;
	while (i > = 1) {
		print(i)
		i = i/2
		}
}
```

![[Pasted image 20250712130835.png]]

# Prefix, Sum and Carry Forward
**Q1. Say you have sales data for each week stored in an array. Develop a program to be able to retrieve the amount of sales happened in a particular range of weeks.**

Sales = 

| 5   | 20  | 2   | 10  | 15  | 6   | 1   | 0   | 2   | 0   | 20  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 0   | 1   | 2   | 3   | 4   | 5   | 6   | 7   | 8   | 9   | 10  |

| Start week | End week | Total sale |
| ---------- | -------- | ---------- |
| 0          | 4        | 52         |
| 1          | 2        | 22         |
| 9          | 9        | 0          |
| 7          | 10       | 22         |
**Q. Given N elements and W queries. For each query calculate sum of all elements from L to R [0 index and inclusive of L and R].**
arr=

| -3  | 6   | 2   | 4   | 5   | 2   | 8   | -9  | 3   | 1   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 0   | 1   | 2   | 3   | 4   | 5   | 6   | 7   | 8   | 9   |

| L   | R   | ans |
| --- | --- | --- |
| 4   | 8   | 9   |
| 3   | 7   | 10  |
| 1   | 3   | 12  |
| 0   | 4   | 14  |
| 7   | 7   | -9  |
**Brute Force:** For each query and calculate sum 
T(N) ; O(Q * N) SC: O(1)
```
void querySum(arr[], query[][]) {
	int q = queries.length
	for(i = 0 ; i < q; i++) {
		int l = queries[i][0]
		int r = queries[i][1]
		int sum = 0 
		for int(j = l; j <= r; j++) {
			sum += arr[j]
			}
		print(sum)
	}
}
```

*For N= 10^5, Q= 10^5, Iterations = 10^10 ~ 100 second*

*Approach 2:*
Create a cumulative sum array(also called prifix array) and use it to find answers for the queries like cricket score board.

*How to create a prefix array:* pf[i] = sum of all elements from 0 till i^th index. 
*Initialize the 0th value with arr[0]* pf[i] = arr[0]
*Iterate 1 to N-1 and cummulate the sum* pf[i] = pf[i-1] + arr[i]

![[Pasted image 20250726165353.png]]

![[Pasted image 20250726165612.png]]
![[Pasted image 20250804014025.png]]

Code:
![[Pasted image 20250805153740.png]]

If modifying input array is allowed= convert original array to prifix array saving o(N) space.
![[Pasted image 20250805153912.png]]

--- 
![[Pasted image 20250805153945.png]]

**Approach 2:** 
 - create a prefix array
 - while creating prefix array add O for odd indexed elements 
 - use the array to answer queries
![[Pasted image 20250805154105.png]]
![[Pasted image 20250805154129.png]]
![[Pasted image 20250805154317.png]]
![[Pasted image 20250805154439.png]]

**Approach 2:** use prefix array to store count of a and for each g look for count of a on your left using prefix array.
![[Pasted image 20250805154537.png]]

**Approach 3:** Take a variable with count a and carry forward it to calculate count of 'ag' in the string
![[Pasted image 20250805154621.png]]

Next Topic: [[Introduction to Sub-Arrays]]