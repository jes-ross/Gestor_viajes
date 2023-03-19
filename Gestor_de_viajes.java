/*
 * Jesús Rosales Santana.
 * 19-03-2023.
 * Gestor de viajes, que desea realizar el cliente.
 */
import java.util.Scanner;//Librería para recoger las respuestas del usuario.

public class Gestor_de_viajes{//Clase pública y principal del programa.
    public static void main(String[] args) {//Metodo main.
        System.out.println("==============================");
        System.out.println("Procederemos a elegir el viaje");
        System.out.println("==============================");

        int vCongo = 5;//Definimos número de viajes para cada uno.
        int vCaribe = 5;
        int vEEUU = 5;
        String congo = "Congo";//Definimos nombres de los viahjes.
        String caribe = "Caribe";
        String EEUU = "Estados Unidos";

        
        Scanner decision = new Scanner(System.in);//Decisión del usuario.
        System.out.println("Dime que deseas hacer, elegir viajes[1] o salir[2]");
        
        int usuario = decision.nextInt();
        
        while(usuario != 2){
            System.out.println("Dime que deseas hacer, elegir viajes[1] o salir[2]");
            usuario = decision.nextInt();    
            if(usuario == 1){//Si elige uno se cumplirá la condición y se realizara la otra parte del código. 
                Scanner viaje = new Scanner(System.in);//Decision de que viaje escoger. 
                System.out.println("Dime si quieres ir al Congo[1], o si quieres ir al Caribe[2] o si quieres ir a los Estados Unidos[3]");
                int user = viaje.nextInt();
                if(user == 1){//Diferentes opciones del usuario. 
                    if(vCongo == 0){//Si se cumple la condición da este mensaje.
                        System.out.println("No se puede elegir, no hay tickets");
                    }else if(vCongo > 0){//Si se cumple la condición da este mensaje y resta un ticket al viaje seleccionado. 
                        System.out.println("Has elegido el viaje a el " + congo + " y puedes realizarlo porque quedan " + vCongo + " viajes para ese destino");
                        vCongo -= 1;
                    }
                }else if(user == 2){
                    if(vCaribe == 0){
                        System.out.println("No se puede elegir, no hay tickets");
                    }else if(vCaribe > 0){
                        System.out.println("Has elegido el viaje a el  " + caribe + " y puedes realizarlo porque quedan " + vCaribe + " viajes para ese destino");
                        vCaribe -= 1;
                    }
                }else if(user == 3){
                    if(vEEUU == 0){
                        System.out.println("No se puede elegir, no hay tickets");
                    }else if(vEEUU > 0){
                        System.out.println("Has elegido el viaje a " + EEUU + " 3y puedes realizarlo porque quedan " + vEEUU + " viajes para ese destino");
                        vEEUU -= 1;
                    }
                }else{//En caso de equivocarse. 
                    System.out.println("Opción no válida");
                }
            }else if(usuario == 2){//En caso de que elija dos se acaba el programa.
                System.out.println("Se acabo el programa");
            }else{//Por si pone otro número. 
                System.out.println("Opción incorrecta");
            
            }
        
        
    }


}
}