package com.katchstyle.nlytics.steps;

public class DailyGoal {

    int dailyGoal = 10000;

    public DailyGoal(int dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    public boolean hasMetGoal(Steps steps) {
        if (steps.getSteps() > dailyGoal) {
            return true;
        }
        return false;
    }

    public int getDailyGoal() {
        return dailyGoal;
    }

    public void setDailyGoal(int dailyGoal) {
        this.dailyGoal = dailyGoal;
    }
}
