package org.kiennguyenfpt.nabfresher.task1;

public class SolutionTaskOne {
    public String solution(int n) {
        StringBuilder result = new StringBuilder();
        int numLetters = Math.min(26, n);
        int cnt = n / numLetters;
        int remainder = n % numLetters;

        for (int i = 0; i < numLetters; i++) {
            char letter = (char) ('a' + i);
            for (int j = 0; j < cnt; j++) {
                result.append(letter);
            }
        }

        // insert the remaining letters
        for (int i = 0; i < remainder; i++) {
            result.append((char) ('a' + i));
        }

        return result.toString();
    }
}
