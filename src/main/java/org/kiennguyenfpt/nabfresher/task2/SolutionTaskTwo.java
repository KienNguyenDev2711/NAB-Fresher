package org.kiennguyenfpt.nabfresher.task2;

public class SolutionTaskTwo {
    public int solution(int[] D, int X) {
        int days = 1; // Bắt đầu từ ngày đầu tiên
        int start = 0; // Nhiệm vụ bắt đầu trong ngày

        for (int i = 1; i < D.length; i++) {
            if (D[i] - D[start] > X) {
                days++; // Tăng số ngày
                start = i; // Bắt đầu ngày mới từ nhiệm vụ hiện tại
            }
        }

        return days;
    }
}
