package ru.geekbrains.lesson7.observer;

public class Student implements Observer {

    private String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String vacancy) {
        if (this.salary < salary && vacancy.equals("студент") ){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f, вакансия- %s]\n",
                    name, nameCompany, salary, vacancy);
            this.salary = salary;
        }

        else{
            System.out.printf("Студент %s >>> Эта работа мне не подходит! [%s - %f, вакансия- %s]\n",
                    name, nameCompany, salary, vacancy);
        }
    }
}
