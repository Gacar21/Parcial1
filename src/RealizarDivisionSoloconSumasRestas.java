
package realizardivisionsoloconsumasrestas;

public class RealizarDivisionSoloconSumasRestas {
    
    public static void main(String[] args) {
     int  numerador = 8;
     int denominador = 5;
     int contador = 0;
     int multi =0;
     int residuo;
     for(int i = denominador; i <= numerador; i= i+denominador){
            
            contador = contador+1;
            multi = denominador + multi;
        }
     residuo = numerador-multi; 
     
     
      
        
       
        
        System.out.println(numerador + "dividio por " + denominador + " es igual " + contador + " y el residuo es " + residuo);
         if(residuo == 0){
           System.out.println("la division es exacta");
       }else {
           System.out.println("la division es inexacta");
       }
    }
    
}
