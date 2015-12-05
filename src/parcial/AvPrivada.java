
import java.util.Scanner;



public class AvPrivada {
    
    Vuelos e = new Vuelos();
    Vuelos f = new Vuelos();
    
    void avionp1()
    {
        Scanner dato = new Scanner(System.in);
        int silla=dato.nextInt();
        String name = "Cessna Skycatcher";
        int horas_vuelos=0;
        int distancia_vuelos=0;
        horas_vuelos=horas_vuelos+e.tiempo1+e.tiempo2+e.tiempo3+e.tiempo4+e.tiempo5;
        distancia_vuelos=distancia_vuelos+e.distancia1+e.distancia2+e.distancia3+e.distancia4+e.distancia5;
        if(horas_vuelos==500 || distancia_vuelos==45000)
        {
            System.out.println("El avion necesita mantenimiento.");
            horas_vuelos=0;
            distancia_vuelos=0;
        }
        int[] sillas = new int[4];
        for(int i=0;i<4;i++){
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
    void avionp2()
    {
        Scanner dato = new Scanner(System.in);
        int silla=dato.nextInt();
        String name = "Eclipse 550";
        int horas_vuelos=0;
        int distancia_vuelos=0;
        horas_vuelos=horas_vuelos+f.tiempo1+f.tiempo2+f.tiempo3+f.tiempo4+f.tiempo5;
        distancia_vuelos=distancia_vuelos+f.distancia1+f.distancia2+f.distancia3+f.distancia4+f.distancia5;
        if(horas_vuelos==500 || distancia_vuelos==45000)
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
}
