package exercise.insured;

public abstract class Property implements Insurable {

    private double area;

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
    }

    public double getArea()
    {
        return this.area;
    }
}
