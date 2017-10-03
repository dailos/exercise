package exercise.lib;

public class Id {

    private String id;

    Id()
   {
       id = "randomIdBasedOnType";
   }

    public Id(String id)
   {
       this.id = id;
   }

    public String toString() {
        return id;
    }
}
