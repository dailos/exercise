package exercise.products;

public class ProductFactory {
    public static Product getProduct(String productType){
        if(productType == null){
            return null;
        }
        if(productType.equalsIgnoreCase("COMPACT")){
            return new HouseholdCompact();

        } else if(productType.equalsIgnoreCase("OPTIMAL")){
            return new HouseholdOptimal();

        }
        return null;
    }
}
