//Le damos un nombre "MiClase" a la clase
public class MiClase
{
    //Atributos de la clase
    private String atributo1;
    private int atributo2;
    private float atributo3;

    //Constructor con el mismo nombre de la clase
    public MiClase(){
        
    }

    public String getAtributo1(){
        return atributo1;
    }
    public void setAtributo1(String nuevoAtributo1){
        atributo1 = nuevoAtributo1;
    }

    public int getAtributo2(){
        return atributo2;
    }
    public void setAtributo2(int nuevoAtributo2){
        atributo2 = nuevoAtributo2;
    }

    public float getAtributo3(){
        return atributo3;
    }
    public void setAtributo1(float nuevoAtributo3){
        atributo3 = nuevoAtributo3;
    }

    //Métodos de la clase
    public void metodo1()
    {
        //Método vacío
    }

    public String metodo2()
    {
        return "metodo2";
    }
}
