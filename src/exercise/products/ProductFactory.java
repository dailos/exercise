package exercise.products;

public class ProductFactory {

    private static final String productCompact = "compact";
    private static final String productOptimal = "optimal";

    public static Product getProduct(String productType){
        if(productType.equalsIgnoreCase(productCompact)){
            return new HouseholdCompact();

        } else if(productType.equalsIgnoreCase(productOptimal)){
            return new HouseholdOptimal();

        }
        throw new IllegalArgumentException();
    }
}
