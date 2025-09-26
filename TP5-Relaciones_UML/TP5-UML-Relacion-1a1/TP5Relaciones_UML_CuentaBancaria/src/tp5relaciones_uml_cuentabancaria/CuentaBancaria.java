
package tp5relaciones_uml_cuentabancaria;


public class CuentaBancaria {
    private String cbu;
    private String saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    //Constructor

    public CuentaBancaria(String cbu, String saldo, ClaveSeguridad claveSeguridad) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + '}';
    }
    
    
    
    public void mostrar(){
        System.out.println("Cuenta Bancaria: " + cbu + saldo + " Titular: " + titular.getNombre());
    }
    //Getters

    public String getCbu() {
        return cbu;
    }

    public String getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular){
        this.titular = titular;
    }
    
    
}
