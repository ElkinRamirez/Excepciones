/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Estudiante
 */
public class Excepciones {
    public Excepciones() throws ElkinExceptoin{
        xx();
        try{
            dividirCero();
        }catch(IllegalArgumentException x){
            System.out.println("la cagaste papá");
        }
        
        
    }    
    public void xx() throws ElkinExceptoin{
        throw new ElkinExceptoin();
    }
    
    public int dividirCero(){
        
        String f=null;
        try{
            System.out.println(f.length());
        }catch(NullPointerException x){
            throw new IllegalArgumentException();
        }
        int c=0;
        for(int i=0;i<10;i++){
            try{
                c=5/0;
            }catch(ArithmeticException x){
                System.out.println("Division entre Cero."+x.getMessage());
            }
        }
        System.out.println("Punto control 2.");
        return c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        try{
            Excepciones x = new Excepciones();
        }catch(ElkinExceptoin e){
            System.out.println("Que lobada guevon");
        }
        
    }
    
}
