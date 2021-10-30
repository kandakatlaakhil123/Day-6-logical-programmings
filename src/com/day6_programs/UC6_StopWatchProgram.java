package com.day6_programs;

import java.util.Scanner;

public class UC6_StopWatchProgram {
    public long startTimer = 0;
    public long stopTimer = 0;
    public long elapsed;

    void start() {
        startTimer = System.currentTimeMillis();
        System.out.println(" Start Time is : " + startTimer);
    }

    void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println(" Stop Time is : " + stopTimer);
    }


    long getElapsedTime() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }

    public static void main(String[] args) {
        UC6_StopWatchProgram sw = new UC6_StopWatchProgram();
        Scanner inp = new Scanner(System.in);

        System.out.println("Press '1' to Start Time: ");
        int start = inp.nextInt();
        sw.start();

        System.out.println();
        System.out.println("Press '2' to Stop Time: ");
        int stop = inp.nextInt();
        sw.stop();

        long l = sw.getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in milli_sec) is : " + l);
        System.out.println();
        System.out.println("Converting milli_sec to seconds : " + (l / 1000) + " sec");
    }
}
