package ejemplopoo;

public class Automotor {
    String marca;
    int num_registro;
    int cant_ruedas;

    public Automotor(String marca, int num_registro, int cant_ruedas) {
        this.marca = marca;
        this.num_registro = num_registro;
        this.cant_ruedas = cant_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

 public void estacionar(){
     System.out.println("Estoy estacionando");
}

public void arrancar(){
    System.out.println("Ya arranque");
}
}
