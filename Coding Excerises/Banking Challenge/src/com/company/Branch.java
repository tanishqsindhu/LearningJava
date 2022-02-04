package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name , double initialTransaction){
        if (findCustomer(name)==null){
            Customer newCustomer = new Customer(name, initialTransaction);
            this.customers.add(newCustomer);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransition(String name, double transaction){
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customer){
        for (int i=0; i<=customers.size();i++){
            if (this.customers.get(i).getName().equals(customer)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
