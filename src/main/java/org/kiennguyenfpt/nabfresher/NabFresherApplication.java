package org.kiennguyenfpt.nabfresher;

import org.kiennguyenfpt.nabfresher.task1.SolutionTaskOne;
import org.kiennguyenfpt.nabfresher.task2.SolutionTaskTwo;
import org.kiennguyenfpt.nabfresher.task3.SolutionTaskThree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NabFresherApplication {
    public static void main(String[] args) {
        SpringApplication.run(NabFresherApplication.class, args);

        // Task 1
        SolutionTaskOne solutionTaskOne = new SolutionTaskOne();
        System.out.println(solutionTaskOne.solution(5));
        System.out.println(solutionTaskOne.solution(10));
        System.out.println(solutionTaskOne.solution(30));

        // Task 2
        SolutionTaskTwo solutionTaskTwo = new SolutionTaskTwo();
        System.out.println(solutionTaskTwo.solution(new int[]{1, 2, 4, 7, 8}, 3));
        System.out.println(solutionTaskTwo.solution(new int[]{1, 2, 4, 7, 8}, 5));
        System.out.println(solutionTaskTwo.solution(new int[]{1, 2, 4, 7, 8}, 6));

        // Task 3
        SolutionTaskThree solutionTaskThree = new SolutionTaskThree();
        System.out.println(solutionTaskThree.solution(new int[]{2, 6, 8, 5}));
        System.out.println(solutionTaskThree.solution(new int[]{1, 5, 5, 2, 6}));
        System.out.println(solutionTaskThree.solution(new int[]{1, 1}));


    }

}
