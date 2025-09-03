
package naveespacial;


public class Principal {

   
    public static void main(String[] args) {
       //Crear la nave espacial
       NaveEspacial nave = new NaveEspacial("Explorador", 50, 100);
       
       //Intentar avanzar sin haber despegado
       nave.avanzar(10);
       
       //Despegue (consume 10)
       nave.despegar();
       
       //Intentar avanzar 40 km (si lo hace consume 80, no va a alcanzar combustible)
       nave.avanzar(40);
       
       //Recargar 40 unidades
       nave.recargarCombustible(40);
       
       //Avanzar 20 Km
       nave.avanzar(20);
       
       //Mostrar estado
       nave.mostrarEstado();
       
               
    }
    
}
