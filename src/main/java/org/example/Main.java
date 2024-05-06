package org.example;

public class Main {
    public static void main(String[] args) {
        BaseWorker[] workers = {
                new Freelancer(500, "Саша"),
                new Freelancer(600, "Маша"),
                new Freelancer(300, "Даша"),
                new Freelancer(400, "Миша"),
                new Worker(40000, "Дима"),
                new Worker(80000, "Зина"),
                new Worker(200000, "Витя")
        };

        for(BaseWorker baseWorker: workers){
            if(baseWorker instanceof Freelancer){
                System.out.println(baseWorker.getName() + " получает " + baseWorker.salary());
            }
            if(baseWorker instanceof Worker){
                System.out.println(baseWorker.getName() + " получает " + baseWorker.salary());
            }
        }
    }
}