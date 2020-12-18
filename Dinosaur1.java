
/**
 * Write a description of class Dinosaur1 here.
 *
 * @author (Tily Bohannan)
 * @version (a version number or a date)
 */
public class Dinosaur1
{
   
    private String type;
    private int age;
    private String gender;
    private int health;

    /**
     * Constructor for objects of class Dinosaur1
     */
    public Dinosaur1()
    {
        this.type = "Dino";
        this.age = 0;
        this.health = 10;
        //this.gender = 50%;
    }

    /**
     * Explicit constructor for the Dino class.
     */
    public Dinosaur1(String t)
    {
        this.type = t;
        this.age = 0;
        this.health = 10;
        //this.gender;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public int getHealth()
    
    
    /******* Setters ********/
     public void setType(String t)
    {
        this.type = t;
    }
    
    public boolean equals(Dinosaur1 d)
    {
        boolean same = false;
        
    if (this.type.equals(d.getType())) 
    {
      if (this.gender.equals(d.getType()))
        {
            int healthDiff = this.health - d.getHealth();
            if (Math.abs(healthDiff) < 10)
               same = true;
        }
       
    }
   }

   public void ageUp()
   {
       if(this.health > 0)
       { 
           this.age++; 
           
           if (this.age < 10)
              this.health = this.health + 10;
              
           else if (this.health >=25 && this.health <=30)
              this.health-=5;
              
           else if (this.age >30)
              this.health-=10;
           
           
       
   




       }
  }   
  
  
  public String toString ()
  {
      String answer = this.type + " " + this.age + " " + this.health;
  




  }
}     