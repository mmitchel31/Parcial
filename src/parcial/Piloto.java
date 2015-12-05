

public class Piloto
{
    Vuelos sa = new Vuelos();
    Vuelos sb = new Vuelos();
    Vuelos sc = new Vuelos();
    Vuelos sd = new Vuelos();
    Vuelos se = new Vuelos();
    
    void piloto1()
    {
        String name = "Daniel A.";
        int salario=0;
        salario=sa.tiempo1*100000+sa.tiempo2*100000+sa.tiempo3*100000+sa.tiempo4*100000+sa.tiempo5*100000;
        System.out.println("El salario de este piloto es: "+salario);
    }
    void piloto2()
    {
        String name = "Jose B.";
        int salario=0;
        salario=sb.tiempo1*100000+sb.tiempo2*100000+sb.tiempo3*100000+sb.tiempo4*100000+sb.tiempo5*100000;
        System.out.println("El salario de este piloto es: "+salario);
    }
    void piloto3()
    {
        String name = "Julio C.";
        int salario=0;
        salario=sc.tiempo1*100000+sc.tiempo2*100000+sc.tiempo3*100000+sc.tiempo4*100000+sc.tiempo5*100000;
        System.out.println("El salario de este piloto es: "+salario);
    }
    void piloto4()
    {
        String name = "Carlos D.";
        int salario=0;
        salario=sd.tiempo1*100000+sd.tiempo2*100000+sd.tiempo3*100000+sd.tiempo4*100000+sd.tiempo5*100000;
        System.out.println("El salario de este piloto es: "+salario);
    }
    void piloto5()
    {
        String name = "Jose E.";
        int salario=0;
        salario=se.tiempo1*100000+se.tiempo2*100000+se.tiempo3*100000+se.tiempo4*100000+se.tiempo5*100000;
        System.out.println("El salario de este piloto es: "+salario);
    }
}