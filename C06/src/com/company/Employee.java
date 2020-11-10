package com.company;

/*
EMPLOYEE CLASS
C06/PC01

Write a class named Employee that has the following fields:
    - name. The name field references a String object that holds the employee’s name.
    - idNumber. The idNumber is an int variable that holds the employee’s ID number.
    - department. The department field references a String object that holds the name of the department where the
    employee works.
    - position. The position field references a String object that holds the employee’s job title.

The class should have the following constructors:
    - A constructor that accepts the following values as arguments and assigns them to the appropriate fields:
    employee’s name, employee’s ID number, department, and position.
    - A constructor that accepts the following values as arguments and assigns them to the appropriate fields:
    employee’s name and ID number. The department and position fields should be assigned an empty string ("").
    - A no-arg constructor that assigns empty strings ("") to the name, department, and position fields, and 0 to the
    idNumber field.

Write appropriate mutator methods that store values in these fields and accessor methods that return the values in
these fields. Once you have written the class, write a separate program that creates three Employee objects to hold the
following data:
            Name	        ID Number	Department	    Position
            Susan Meyers	47899	    Accounting	    Vice President
            Mark Jones	    39119	    IT	            Programmer
            Joy Rogers	    81774	    Manufacturing   Engineer

The program should store this data in the three objects and then display the data for each employee on the screen.
 */

public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    Employee(String inName, int inNum) {
        name = inName;
        idNumber = inNum;
        department = "";
        position = "";
    }

    Employee(String inName, int inNum, String inDept, String inPosition) {
        name = inName;
        idNumber = inNum;
        department = inDept;
        position = inPosition;
    }

    public void setName(String inName) {
        name = inName;
    }

    public void setIdNumber(int inNum) {
        idNumber = inNum;
    }

    public void setDepartment(String inDept) {
        department = inDept;
    }

    public void setPosition(String inPosition) {
        position = inPosition;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println("Employee\t\tID Number\tDepartment\t\tPosition");
        System.out.print(emp1.getName() + "\t" + emp1.getIdNumber() + "\t\t" + emp1.getDepartment() + "\t\t");
        System.out.println(emp1.getPosition());
        System.out.print(emp2.getName() + "\t\t" + emp2.getIdNumber() + "\t\t" + emp2.getDepartment() + "\t\t\t\t");
        System.out.println(emp2.getPosition());
        System.out.print(emp3.getName() + "\t\t" + emp3.getIdNumber() + "\t\t" + emp3.getDepartment() + "\t");
        System.out.println(emp3.getPosition());
    }
}

/*
Employee		ID Number	Department		Position
Susan Meyers	47899		Accounting		Vice President
Mark Jones		39119		IT				Programmer
Joy Rogers		81774		Manufacturing	Engineer

Process finished with exit code 0
 */