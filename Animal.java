public class Animal
{
    private String raza;
    private String nombre;
    private int edad;


    public Animal(String nuevoNombre)
    {
        nombre = nuevoNombre;
    }

    //Método para obtener la edad del animal
    public int getEdad()
    {
        return edad;
    }

    //Método para establecer la edad del animal
    public void setEdad(int nuevaEdad)
    {
        edad = nuevaEdad;
    }

    //Método para obtener el nombre del animal
    public String getNombre()
    {
        return nombre;
    }
    
    //Método para obtener la raza del animal
    public String getRaza()
    {
        return raza;
    }
}
