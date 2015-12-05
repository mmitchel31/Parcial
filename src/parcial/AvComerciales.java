
import java.util.Scanner;



public class AvComerciales {
    
    Vuelos a = new Vuelos();
    Vuelos b = new Vuelos();
    
    void avionco1()
    {
        String name = "Airbus A319";
        Scanner dato = new Scanner(System.in);
        int silla=dato.nextInt();
        
        int horas_vuelos=0;
        int distancia_vuelos=0;
        horas_vuelos=horas_vuelos+a.tiempo1+a.tiempo2+a.tiempo3+a.tiempo4+a.tiempo5;
        distancia_vuelos=distancia_vuelos+a.distancia1+a.distancia2+a.distancia3+a.distancia4+a.distancia5;
        if(horas_vuelos==500 || distancia_vuelos==50000)
        {
            System.out.println("El avion necesita mantenimiento.");
            horas_vuelos=0;
            distancia_vuelos=0;
        }
        int[] sillas = new int[150];
        for(int i=0;i<150;i++){
            if(sillas[silla+i]==1)
            {
                System.out.println("La silla "+silla+" esta ocupada.");
            }
            else
            {
                sillas[i+silla]=1;
            }
        }
    }
    void avionco2()
    {
        Scanner dato = new Scanner(System.in);
        int silla=dato.nextInt();
        String name = "Airbus A320";
        int horas_vuelos=0;
        int distancia_vuelos=0;
        horas_vuelos=horas_vuelos+b.tiempo1+b.tiempo2+b.tiempo3+b.tiempo4+b.tiempo5;
        distancia_vuelos=distancia_vuelos+b.distancia1+b.distancia2+b.distancia3+b.distancia4+b.distancia5;
        if(horas_vuelos==500 || distancia_vuelos==50000)
        {
            System.out.println("El avion necesita mantenimiento.");
            horas_vuelos=0;
            distancia_vuelos=0;
        }
        int[] sillas = new int[180];
        for(int i=0;i<180;i++){
            if(sillas[silla+i]==1)
            {
                System.out.println("La silla "+silla+" esta ocupada.");
            }
            else
            {
                sillas[i+silla]=1;
            }
        }
    }
}
