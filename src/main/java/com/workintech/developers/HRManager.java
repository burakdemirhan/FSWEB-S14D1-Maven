package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = getJuniorDevelopers();
        this.midDevelopers = getMidDevelopers();
        this.seniorDevelopers = getSeniorDevelopers();
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
        setSalary(getSalary() + 500);
    }


    public void addEmployee(int index, JuniorDeveloper developer) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index: out of array bounds.");
        } else if (juniorDevelopers[index] != null) {
            System.out.println("This index is already occupied.");
        } else {
            juniorDevelopers[index] = developer;
            System.out.println("Junior Developer added successfully at index " + index);
        }
    }


    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index: out of array bounds.");
        } else if (midDevelopers[index] != null) {
            System.out.println("This index is already occupied.");
        } else {
            midDevelopers[index] = developer;
            System.out.println("Mid Developer added successfully at index " + index);
        }
    }


    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index: out of array bounds.");
        } else if (seniorDevelopers[index] != null) {
            System.out.println("This index is already occupied.");
        } else {
            seniorDevelopers[index] = developer;
            System.out.println("Senior Developer added successfully at index " + index);
        }
    }


    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}