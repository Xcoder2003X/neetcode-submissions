

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) {
            return 0;
        }

        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // Kay-khbi l-indices (monotonically increasing heights)

        // 1. Njibo awl index sghr mn i 3la l-lissar
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            // Ila stack khawi, ya3ni ma kayn 7ta bar sghr l-lissar -> n9dro n-extendio 7ta l-0
            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        // N-khwiw l-stack bach n-3awdou n-sta3mlouh l-limn
        stack.clear();

        // 2. Njibo awl index sghr mn i 3la l-limn
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            // Ila stack khawi, ya3ni ma kayn 7ta bar sghr l-limn -> n9dro n-extendio 7ta l-(n - 1)
            right[i] = stack.isEmpty() ? (n - 1) : stack.peek() - 1;
            stack.push(i);
        }

        // 3. N-7sbou l-max area l-kull bar
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] + 1;
            int area = heights[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}