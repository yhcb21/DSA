 - Max space (worst care) space that is utilized at any point in time during running the algo.
 - We use BIg(O) for space complexity as well.

```
for (int N) { // 4 bytes
	int x;    // 4 bytes
	int y;    // 4 bytes
	long z;   // 8 bytes
}
```
 - Total memory used by function = 4+4+8
 - Space = 16 bytes
 - Space complexity = O(1) also called `constant`.

Q. Space complexity?
```
func (int N) {
int arg[10];  // 10 * 4 bytes
int x; // 4 bytes
int y; // 4 bytes
long z; // 8 bytes
int arg[N]; // n * 4 bytes
}
```
4N+40+4+4+8 = 4N + 56 = O(N)

