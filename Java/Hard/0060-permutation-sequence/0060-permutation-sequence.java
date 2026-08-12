import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n];
        
        // 1. Precompute factorials and populate available numbers: [1, 2, ..., n]
        int fact = 1;
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
            factorial[i] = fact;
            numbers.add(i);
        }
        numbers.add(n); // Add the final number

        // 2. Convert k to 0-based indexing for easier math
        k = k - 1;

        StringBuilder sb = new StringBuilder();

        // 3. Find each digit from left to right
        for (int i = n; i > 0; i--) {
            int blockFactorial = factorial[i - 1];
            int index = k / blockFactorial;
            
            // Pick digit, add to result, and remove from available numbers
            sb.append(numbers.get(index));
            numbers.remove(index);
            
            // Update k for the remaining position
            k = k % blockFactorial;
        }

        return sb.toString();
    }
}