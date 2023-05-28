package ru.geekbrains.lesson7.observer;

import java.util.Random;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;
    private String vacancy;
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, String vacancy, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
        random = new Random();
    }

    public void needEmployee() {
        double salary = random.nextDouble(3000, maxSalary);
//        int typeVacavcy = random.nextInt(1, 4);
//        if (typeVacavcy==1) {
//            String vacancy = masrer;
//        }
//        else if (typeVacavcy==2) {
//            String vacancy = student;
//        }
//        else  {
//            String vacancy = enginer;
//        }
        jobAgency.sendOffer(nameCompany, salary, vacancy);
    }


}
