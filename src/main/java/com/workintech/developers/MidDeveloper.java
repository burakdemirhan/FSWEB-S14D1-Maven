package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }
@Override
    public void work() {
        System.out.println("Mid Developer is coding and collaborating on projects.");
        setSalary(getSalary() + 200);
    }
}
