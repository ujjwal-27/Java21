package com.example.SpringMVCDemo;

public class Programmer {
    private int programmerId;
    private String programmerName;

    public int getProgrammerId() {
        return programmerId;
    }

    public String getProgrammerName() {
        return programmerName;
    }

    public void setProgrammerId(int programmerId) {
        this.programmerId = programmerId;
    }

    public void setProgrammerName(String programmerName) {
        this.programmerName = programmerName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmerId=" + programmerId +
                ", programmerName='" + programmerName + '\'' +
                '}';
    }
}
