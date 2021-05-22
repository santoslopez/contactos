public class Contacto{
    // Variables para almacenar informacion
    private int idContacto;
    private String datos;
    private String correo;

    public int getIDContacto(){
        return idContacto;
    }

    // patron de diseno singleton para crear una sola instancia de la clase
    private static Contacto instancia;
    public static Contacto getInstancia(){
        if(instancia==null){
            instancia=new Contacto();
        }
        return instancia;
    }

    // Constructor
    public Contacto(int idContacto,String datos,String correo){
        this.idContacto=idContacto;
        this.datos=datos;
        this.correo=correo;
    }

    public Contacto(){}

    public String toString(){
        String informacion = "Número: "+String.valueOf(this.getIDContacto()) + " Nombre y apellidos: "+ this.datos + " Correo: "+this.correo;

        return informacion;
    }

}