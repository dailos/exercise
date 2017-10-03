package exercise.insured;

import exercise.lib.Id;

import java.util.concurrent.ThreadLocalRandom;


public abstract class Property implements Insurable {

    private double area;
    private Id insuredId;


    Property(double area)
    {
        if(area <= 0){
            throw new IllegalArgumentException();
        }
        this.area = area;
        int id = ThreadLocalRandom.current().nextInt(0, 1000000);
        insuredId = new Id("property-" + id);
    }

    public double getArea()
    {
        return area;
    }

    public Id getInsurableId()
    {
        return insuredId;
    }

}
