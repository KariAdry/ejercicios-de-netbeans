package ejemplopoo;

public class Camion extends Automotor{
    
boolean tiene_acoplado;
int cant_ejes;

     public Camion(boolean tiene_acoplado, int cant_ejes, String marca, int num_registro, int cant_ruedas) {
        super(marca, num_registro, cant_ruedas);
        this.tiene_acoplado = tiene_acoplado;
        this.cant_ejes = cant_ejes;
    }

    public boolean isTiene_acoplado() {
        return tiene_acoplado;
    }

    public void setTiene_acoplado(boolean tiene_acoplado) {
        this.tiene_acoplado = tiene_acoplado;
    }

    public int getCant_ejes() {
        return cant_ejes;
    }

    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }


}
