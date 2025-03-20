package org.kiennguyenfpt.nabfresher.task3;

public class SolutionTaskThree {
    public int solution(int[] blocks) {
        int n = blocks.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // count the distance to jump to the left
        for (int i = 1; i < n; i++) {
            if (blocks[i] >= blocks[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // count the distance to jump to the right
        for (int i = n - 2; i >= 0; i--) {
            if (blocks[i] >= blocks[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        // find the maximum distance
        int maxDistance = 0;
        for (int i = 0; i < n; i++) {
            maxDistance = Math.max(maxDistance, left[i] + right[i] + 1);
        }

        return maxDistance;
    }

}
