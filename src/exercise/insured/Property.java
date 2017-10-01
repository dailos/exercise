package exercise.insured;

import exercise.lib.Id;

public abstract class Property implements Insurable {

    private double area;
    private Id insuredId;

    private void check(double area)
    {
        if(area <= 0){
            throw new IllegalArgumentException();
        }
    }

    public Property(double area)
    {
        this.check(area);
        this.area = area;
        this.insuredId = new Id();
    }

    public double getArea()
    {
        return this.area;
    }

    public Id getInsurableId()
    {
        return this.insuredId;
    }

}
