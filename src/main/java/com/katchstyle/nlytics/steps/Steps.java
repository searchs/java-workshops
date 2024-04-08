package com.katchstyle.nlytics.steps;

import java.time.LocalDate;

public class Steps {
    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    private int steps;
private LocalDate localDate;

    public Steps(int steps, LocalDate localDate) {
        this.steps = steps;
        this.localDate = localDate;
    }


}
