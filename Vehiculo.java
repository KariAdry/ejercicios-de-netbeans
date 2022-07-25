package ejemplopoo;

public class Vehiculo extends Automotor {
    /**atributos**/
 int id;
String color;
String patente;
String propietario;
boolean caja_manual;

/*constructores*/


    public Vehiculo(int id, String color, String patente, String propietario, boolean caja_manual, String marca, int num_registro, int cant_ruedas) {
        super(marca, num_registro, cant_ruedas);
        this.id = id;
        this.color = color;
        this.patente = patente;
        this.propietario = propietario;
        this.caja_manual = caja_manual;
    }

   
/*getters y setters*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public boolean isCaja_manual() {
        return caja_manual;
    }

    public void setCaja_manual(boolean caja_manual) {
        this.caja_manual = caja_manual;
    }

/**metodos*/
public void encender(){
    System.out.println("Estoy encendiendo");
}

public void apagar(){
    System.out.println("Estoy apagando");
}

public void acelerar(double km){
 
    System.out.println("Estoy acelerando " +  km +" kms") ;
}

public void frenar (double km){

    System.out.println("Estoy frenando " + km + "kms");
}
}
