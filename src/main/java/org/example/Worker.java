package org.example;

public class Worker extends BaseWorker{
    private double fixedPayment;

    Worker(double fixedPayment, String name){
        super(name);
        this.fixedPayment = fixedPayment;
    }

    @Override
    double salary() {
        return fixedPayment;
    }
}
