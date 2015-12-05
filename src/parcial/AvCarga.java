
import java.util.Scanner;


public class AvCarga {
    
    Vuelos c = new Vuelos();
    Vuelos d = new Vuelos();
    
    void avionca1()
    {
        Scanner dato = new Scanner(System.in);
        int silla=dato.nextInt();
        String name = "Antonov An-225";
        int horas_vuelos=0;
        int distancia_vuelos=0;
        horas_vuelos=horas_vuelos+c.tiempo1+c.tiempo2+c.tiempo3+c.tiempo4+c.tiempo5;
        distancia_vuelos=distancia_vuelos+c.distancia1+c.distancia2+c.distancia3+c.distancia4+c.distancia5;
        if(horas_vuelos==500 || distancia_vuelos==50000)
        {
            System.out.println("El avion necesita mantenimiento.");
            horas_vuelos=0;
            distancia_vuelos=0;
        }
        int[] sillas = new int[10];
        for(int i=0;i<10;i++){
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
    void avionca2()
    {
        Scanner dato = new Scanner(System.in);
        int silla=dato.nextInt();
        String name = "Boeing 747-8";
        int horas_vuelos=0;
        int distancia_vuelos=0;
        horas_vuelos=horas_vuelos+d.tiempo1+d.tiempo2+d.tiempo3+d.tiempo4+d.tiempo5;
        distancia_vuelos=distancia_vuelos+d.distancia1+d.distancia2+d.distancia3+d.distancia4+d.distancia5;
        if(horas_vuelos==500 || distancia_vuelos==50000)
        {
            System.out.println("El avion necesita mantenimiento.");
            horas_vuelos=0;
            distancia_vuelos=0;
        }
        int[] sillas = new int[8];
        for(int i=0;i<8;i++){
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
