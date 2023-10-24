public class Toy1 {
    private int id;
    private String name;
    private double weight; 
    
    public Toy1 (int id, String name, double weight){
      this.id = id;
      this.name = name;
      this.weight = weight;
    }
      public int getId(){
          return this.id; 
      }
  
      public String getName(){
          return this.name; 
      }
  
      public double getWeight(){
          return this.weight; 
      }
  
      public int setId (int i){
          id=i;
          return id;
      }
      public String setName(String n){
          name = n;
          return name; 
      }
      public double setWeight(double w){
          weight = w; 
          return weight; 
      }    
  }
   

