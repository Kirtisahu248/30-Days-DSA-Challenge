/* *
 * In This Problem We have to check whether the number is power of 2 or not
 * Example:- N = 16 ---> is it power of 2? ==> YES
 * N = 13 ---> is it power of 2? ==> NO
 * 
 * By Observing we know that the every power of 2 will have only one set bit
 * 
 * Dry Run:-  n = 13                        n = 16
 *    1 1 0 1                               1 0 0 0 0   
 *  & 1 1 0 0                             & 0 1 1 1 1
 * -------------                        ---------------
 *    1 1 0 0 ==> 12                        0 0 0 0 0 ==> This is the power of 2
 * -------------                          ------------
 */

 class Solution {
    public boolean isPowerOfTwo(int n) {
        // Step 1: Check if n is greater than 0.
        if (n <= 0) return false; 

        // Step 2: Use the bitwise AND operation to check if n is a power of two.
        // If (n & (n - 1)) == 0, then n is a power of two.
        return (n & (n - 1)) == 0;
    }
}
