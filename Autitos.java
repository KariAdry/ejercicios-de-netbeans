
import java.util.Stack;


public class Autitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack<Auto> auto= new Stack <Auto>(); 
       
        System.out.println("auto esta vacia? "+auto.isEmpty());
       
       auto.push(new Auto("AAA123","Ford","1964","celeste","k1974"));
       auto.push(new Auto("AJK 456","Renault","1999","negro","w235"));
       auto.push(new Auto ("BDM 359","Chevrolet","2000","naranja","l12"));
       auto.push(new Auto("GYU 215","Peugeout","2010","rojo","j52"));
       auto.push(new Auto("BMW 345","Citroen","2013","rojo","k161"));
       
       System.out.println("auto esta vacia? "+auto.isEmpty());
       System.out.println("los elementos de la pila son: ");
       
       for(Auto aut: auto){
           System.out.println("patente "+ aut.getPatente());
           System.out.println("marca " + aut.getMarca());
           System.out.println("modelo "+ aut.getModelo());
           System.out.println("color "+  aut.getColor());
           System.out.println("chasis " + aut.getChasis()); 
           System.out.println("--------------------");
       }
       for(Auto aut: auto){
         
      auto.peek();{
           
           
           System.out.println("el ultimo elemento agregado es patente "+ aut.getPatente());
           System.out.println("el ultimo elemento agregado es marca " + aut.getMarca());
           System.out.println("el ultimo elemento agregado es modelo "+ aut.getModelo());
           System.out.println("el ultimo elemento agregado es color "+  aut.getColor());
           System.out.println("el ultimo elemento agregado es chasis " + aut.getChasis()); 
           System.out.println("--------------------");
       };
                    
       }   
      
    }
     
    }
    

