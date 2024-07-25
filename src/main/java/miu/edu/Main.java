package miu.edu;

import lombok.var;
import miu.edu.model.Customer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       var customers= new Customer[]{
                new Customer(1,"John", "Doe", "michigan"),
                new Customer(2,"Jane", "Doe", "michigan"),

        };
        System.out.println(Arrays.toString(customers));
    }
}