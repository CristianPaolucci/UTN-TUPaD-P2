
package tp7.herencia.polimorfismo.ej2;


public class Principal {

   
    public static void main(String[] args) {
        // Se crea un array de Figuras (polimorfismo)
        Figura[] figuras = new Figura[3];
        
        
        figuras[0] = new Circulo("Circulo 1", 4.5);
        figuras[1] = new Rectangulo("Rectangulo 1", 5, 3);
        figuras[2] = new Circulo("Circulo 2", 2.2);
        
        //Recorremos el array y mostramos las áreas
        for (Figura f : figuras){
            System.out.println("Figura: " + f.getNombre());
            System.out.println("Área: " + f.calcularArea());

    //Demostración de upcasting / instanceof
            if(f instanceof Circulo){
                System.out.println("Es un Círculo");
            } else if (f instanceof Rectangulo){
                System.out.println("Es un Rectángulo");
        }

        System.out.println("------------------------");
}

            
        
        
    }
    
}
