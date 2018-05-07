package com.enterprises.woof.woof;


import android.support.annotation.NonNull;

import java.util.Objects;

public class MedicationObject implements Comparable{

    private String title;
    private String startDate;
    private String endDate;

    public MedicationObject(String title, String startDate, String endDate) {
        Objects.requireNonNull(title);
        Objects.requireNonNull(startDate);
        Objects.requireNonNull(endDate);
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        return 0;
    }
}
