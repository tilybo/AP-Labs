 



/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
    public DinoDriver1()
    {
      Dinosaur1 d1 = new Dinosaur1();
      Dinosaur1 d2 = new Dinosaur1("TRex");
      
      Dinosaur1[] pop = new Dinosaur1[10];
      
     for(int i = 0; i < pop.length; i++)
     {
            
      pop[i] = new Dinosaur1("TRex");
      int rand = (int)(Math.random()*40);
      
      for( int j = 0; j< rand; j++)
        {
            pop[i].ageUp();
        }
    
     }
    
     for( int i = 0; i < pop.length; i++)
         System.out.println(pop[i]);
    }
}  