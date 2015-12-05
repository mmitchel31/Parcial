

public class Cliente
{
    private String Nombre;
    private int ID;
    private int Telefono;
    private String Correo;
    
    public Cliente(String Nombre, int ID, int Telefono, String Correo)
    {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }
    public String getNombre()
    { 
        return Nombre;
    }
    public int getID()
    {
        return ID;
    }
    public int getTelefono()
    {
        return Telefono;
    }
    public String getCorreo()
    { 
        return Correo;
    }
}