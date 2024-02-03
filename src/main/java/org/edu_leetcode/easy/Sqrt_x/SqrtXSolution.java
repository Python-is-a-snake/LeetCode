package org.edu_leetcode.easy.Sqrt_x;

public class SqrtXSolution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;

        int start = 2;
        int end = x/2;

        while (start <= end){
            int mid = start + (end - start) / 2;
            long probSqrt = (long) mid * mid;

            if(probSqrt == x){
                return mid;
            }else if(probSqrt < x){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return Math.round(end);
    }
}
