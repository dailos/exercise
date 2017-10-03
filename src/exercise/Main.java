package exercise;


import exercise.insured.House;
import exercise.policies.Household;
import exercise.products.Product;
import exercise.products.ProductFactory;


public class Main {

    public static void main(String[] args) {

        Product product = ProductFactory.getProduct(args[0]);
        House house = new House(Double.parseDouble(args[1]));
        Household policy = new Household(house, product);


        System.out.print(policy.getPrice().toString());
    }
}
