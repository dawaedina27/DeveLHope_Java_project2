//1
// Create Person class, it should have name, age, username, password.
//Override toString function to just print name and age in a good format.
//Override equals function to check username and password.

//2
////Create Customer class, it should extend Person  class and it should have extra customerID(auto genarate we will not have it on constructor) and balance.
////
////Required extra functions: getBalance, setBalance and getCustomerID
////
////Overide toString again and print extra customerID
////override equals function and check if username and password matchs or customerID and password match.  IF any of cases are correct we will return true.
////

//3
//3- Create Manager class, it should extend Person, it should have extra managerId (auto generate) and actionNumber( set zero when
// you created the object, so it should assign 0 in the constructor)
//
// Required extra functions: getActionNumber, setActionNumber and getManagerID
//
// Override toString again and print extra managerID
//override equals function and check if username and password matches or managerID and password match.  IF any of cases are correct
// we will return true.

//  02/10/2024

//  1-
//  Create increase money and decrease money function from manager

//  Create a function called updateMoney(Customer, changeAmount);

//       then change the money of customer. change amount can be negative so basicly we need to do => previous amount + changeAmount into customer account.

package Question1;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String username;
    private String password;

    public Person(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    ////Override toString function to just print name and age in a good format.
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    ////Override equals function to check username and password.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return username.equals(person.username) && password.equals(person.password);

    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}

//Create Customer class, it should extend Person  class and it should have extra customerID(auto genarate we will not have it on constructor) and balance.
//
//Required extra functions: getBalance, setBalance and getCustomerID
//
//Overide toString again and print extra customerID
//override equals function and check if username and password matchs or customerID and password match.  IF any of cases are correct we will return true.
//

////  02/10/2024
////  1- Create increase money and decrease money function from manager
class Customer extends Person{
    private int customerID;
    private double balance;

    private double money;


    public Customer(String name, int age, String username, String password) {
        super(name, age, username, password);
        int customerID1 = (int) (10000000*Math.random());
        this.balance = 0.00;
        this.money = money;

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(){
        this.customerID = customerID;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", balance=" + balance + '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return super.equals(o) ||
                (customerID == customer.customerID && getPassword().equals(customer.getPassword()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerID);
    }
}

//3- Create Manager class, it should extend Person, it should have extra managerId (auto generate) and actionNumber( set zero when
// you created the object, so it should assign 0 in the constructor)
//
// Required extra functions: getActionNumber, setActionNumber and getManagerID
//
// Override toString again and print extra managerID
//override equals function and check if username and password matches or managerID and password match.  IF any of cases are correct
// we will return true.

class Manager extends Person {
    private int managerID;
    private int actionNumber;
    private double money;

    public Manager(String name, int age, String username, String password){
        super(name, age, username, password);
        this.managerID = (int) (10000000*Math.random());
        this.actionNumber =0;

        }

    public void updateMoney(Customer customer, double changeMoney){
        double previousAmount = customer.getMoney();
        double secondAmount = previousAmount + changeMoney;
}

        //Required extra functions: getActionNumber, setActionNumber and getManagerID
    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //Overide toString again and print extra managerID
    @Override
    public String toString() {
        return "Manager{" +
                "managerID=" + managerID +
                ", actionNumber=" + actionNumber +
                '}';
    }

    //override equals function and check if username and password matchs or managerIDand password match.
    // IF any of cases are correct
    //// we will return true.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return super.equals(o) ||
                (managerID == manager.managerID && getPassword().equals(manager.getPassword()));

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), managerID);
    }
}
//  02/10/2024
//  1- Create increase money and decrease money function from manager

//  Create a function called updateMoney(Customer, changeAmount);

 //       then change the money of customer. change amount can be negative so basicly we need to do => previous amount + changeAmount into customer account.