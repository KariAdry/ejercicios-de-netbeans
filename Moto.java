package ejemplopoo;

public class Moto extends Automotor{
    
int cilindrada;

    public Moto(int cilindrada, String marca, int num_registro, int cant_ruedas) {
        super(marca, num_registro, cant_ruedas);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


}
