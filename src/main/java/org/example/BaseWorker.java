package org.example;

public abstract class BaseWorker {
    private String name;

    BaseWorker(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    double salary(){
        return 25000;
    };
}
