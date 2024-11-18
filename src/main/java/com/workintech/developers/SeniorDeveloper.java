package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer is leading projects and mentoring juniors.");
        setSalary(getSalary() + 300);
    }
}
