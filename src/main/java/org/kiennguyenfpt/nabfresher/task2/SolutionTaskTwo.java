package org.kiennguyenfpt.nabfresher.task2;

public class SolutionTaskTwo {
    public int solution(int[] D, int X) {
        int days = 1; // start from the first day
        int start = 0; // start from the first task

        for (int i = 1; i < D.length; i++) {
            if (D[i] - D[start] > X) {
                days++; // increase the number of days
                start = i; // start from the next task
            }
        }

        return days;
    }
}
