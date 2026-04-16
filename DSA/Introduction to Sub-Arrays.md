- Contiguous part of an array
- formed by selecting range of elements in an array.
- it can have one or more or all elements of the array.
![[Pasted image 20250805154917.png]]
> Empty array should not be considered a sub-array by default.

![[Pasted image 20250805155143.png]]
![[Pasted image 20250805155210.png]]
![[Pasted image 20250805155243.png]]

# Sum of every SubArray
![[Pasted image 20250810163752.png]]
![[Pasted image 20250810163805.png]]
- Time complexity too high. 
**Approach 2:** Prefix Sum - Consider all subarrays and find this sum using prefix sum. Sum up the sum of seach subarray.
![[Pasted image 20250810164124.png]]
- Time complexity is high and Space complexity can be optimized.

**Approach 3:** Carry Forward: (as we are processing sequential subarrays.)
Consider all subarrays and find their sum using carry forward sum. Sum up the sum of each subarray.
![[Pasted image 20250810164333.png]]
![[Pasted image 20250810164344.png]]

**Approach 4:** Further optimisation can not be done by considering all subarrays. --> Contribuition technique
![[Pasted image 20250810164510.png]]
![[Pasted image 20250810164520.png]]![[Pasted image 20250810164535.png]]![[Pasted image 20250810164602.png]]
![[Pasted image 20250810164612.png]]
![[Pasted image 20250810164627.png]]![[Pasted image 20250810164647.png]]![[Pasted image 20250810164703.png]]
![[Pasted image 20250810164717.png]]![[Pasted image 20250810164734.png]]![[Pasted image 20250810164746.png]]
