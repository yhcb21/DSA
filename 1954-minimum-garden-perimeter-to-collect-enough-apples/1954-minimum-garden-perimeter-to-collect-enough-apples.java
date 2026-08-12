class Solution {
    public long minimumPerimeter(long neededApples) {
        long apples = 0;
        long n = 0;
        while (neededApples > apples) {
            n+=1;
            apples = 2*n*(n+1)*(2*n+1) ;
        }

        long perimeter = 8*n;
        return perimeter;
    }
}