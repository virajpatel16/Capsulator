import java.util.Scanner;

//2. Create a java class area, 
//with data member length & width, and Member function getdata.
// Calculate and display the area of a rectangle.

public class area {
    public static void main(String[] args) {
      map m =new map();
      m.setlength(122);
      m.setwidth(12);
    
      System.out.println("the length is  = "+m.getlength());
      System.out.println("the width is "+m.getwidth());
   
      Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
          double length= s.nextDouble();
         System.out.println("Enter the width:");
          double width= s.nextDouble();
         
           
            double a=length*width;
            System.out.println("the area of reactangle is "+a);
    }
      
          
    
      
      
    
       
    }


class map{
    
    int length;
    int width;
    int a;

   public void setlength(int length){
 

        this.length = length;
  
    }

    public int  getlength(){
        return length;
     

    }

    public void setwidth(int  width){
        this.width=width;
    }
    public float getwidth(){
        return width;
    }
   

 
    


  
  
}

  

