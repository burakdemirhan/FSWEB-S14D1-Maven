package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is learning and working on tasks.");
        setSalary(getSalary() + 100);
    }
}
