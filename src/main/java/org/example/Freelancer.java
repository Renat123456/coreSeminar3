package org.example;

public class Freelancer extends BaseWorker {
    private double hourlyRate;

    Freelancer(double hourlyRate, String name){
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    double salary() {
        return 20.8 * 8 * hourlyRate;
    }
}
