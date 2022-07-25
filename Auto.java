package ejemplopoo;


public class Auto {

    public static void main(String[] args) {
       Automotor aut =new Automotor ("Nissan",548996, 5);
       Vehiculo auto1 = new Vehiculo(1,"rojo","JKA 112","Adrian",true,"Ford", 156846534,5);
       Vehiculo auto2 = new Vehiculo(2,"negro","JFK 765","Karina",false,"Volkswagen",15454, 2);
       Camion camion =new Camion( true, 3,"Volvo",11564,6);
       Moto moto = new Moto(125,"Yamaha",265364,2);

Automotor vector[]=new Automotor[5];
vector[0]= aut;
vector[1]= auto1;
vector[2]=auto2;
vector[3]=camion;
vector[4]=moto;
        int i;

for(i=0; i<5; i++){
        System.out.println("los regustros son: " + i + vector[i].getMarca());
}





/*
 auto2.encender();
 auto2.acelerar(80);
 auto2.frenar(20);
 auto2.apagar();

*/
 }   
}
