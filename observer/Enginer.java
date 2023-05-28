package ru.geekbrains.lesson7.observer;

public class Enginer implements Observer {

    private String name;
    private double salary;

    public Enginer(String name) {
        this.name = name;
        salary = 90000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String vacancy) {
        if (this.salary < salary && vacancy.equals("инженер")) {
            System.out.printf("Инженер %s >>> Мне нужна эта работа! [%s - %f, вакансия- %s]\n",
                    name, nameCompany, salary, vacancy);
            this.salary = salary;
        } else {
            System.out.printf("Инженер %s >>> Эта работа мне не подходит! [%s - %f, вакансия- %s]\n",
                    name, nameCompany, salary, vacancy);
        }
    }
}

