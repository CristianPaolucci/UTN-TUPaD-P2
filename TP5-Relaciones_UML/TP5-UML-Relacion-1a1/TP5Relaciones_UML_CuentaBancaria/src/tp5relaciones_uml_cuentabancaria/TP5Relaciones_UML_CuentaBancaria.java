
package tp5relaciones_uml_cuentabancaria;


public class TP5Relaciones_UML_CuentaBancaria {

   
    public static void main(String[] args) {
       
        
        //Crear clave seguridad
        ClaveSeguridad clave1 = new ClaveSeguridad("7201", "12/07/2925");
         //Crear Cuenta bancaria aun sin titular
        CuentaBancaria cuenta1 = new CuentaBancaria("1234-9900-4876-1190", " saldo: 12500", clave1);
        //Crear Titular
        Titular titular1 = new Titular("Florencia Ramallo", "31009461", null);
        
        //Asociar titular a la cuenta y viceversa
        titular1.setCuentaBancaria(cuenta1);
        
        //Mostrar datos de la cuenta
        cuenta1.mostrar();
        
        System.out.println();
        //Mostrar los objetos con toString()
        System.out.println(cuenta1);
        System.out.println(titular1);
        
    }
    
}
