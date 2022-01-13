package com.company;

public class Persons {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if (age<0||age>100){
            this.age= 0;
        }else {
            this.age = age;
        }
    }
    public boolean isTeen(){
        if (age>12&&age<20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        boolean firstNameEmpty=firstName.isEmpty();
        boolean secondNameEmpty=lastName.isEmpty();
        if (firstNameEmpty){
            return lastName;
        }else if (secondNameEmpty){
            return firstName;
        }
        return firstName +" "+ lastName;
    }
}
