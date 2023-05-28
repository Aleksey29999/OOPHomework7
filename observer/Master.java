package ru.geekbrains.lesson7.observer;

public class Master implements Observer {

    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String vacancy) {
        if (this.salary < salary && vacancy.equals("мастер")){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %f, вакансия- %s]\n",
                    name, nameCompany, salary, vacancy);
            this.salary = salary;
        }
        else{
            System.out.printf("Специалист %s >>> Эта работа мне не подходит! [%s - %f, вакансия- %s]\n",
                    name, nameCompany, salary, vacancy);
        }
    }
}
