package exercise.lib;

public class Id {

    private String id;

   public Id()
   {
       this.id = "randomIdBasedOnType";
   }

   public Id(String id)
   {
       this.id = id;
   }

   public String toString()
   {
       return this.id;
   }
}
