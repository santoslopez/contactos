import javax.swing.JOptionPane;
import java.util.LinkedList;


// Autor: Santos Lopez 


public class Agenda{

    // Estructura de datos donde se almacena la informacion.
    private static LinkedList linkedlist = new LinkedList();

    private static int contador;

    public static void listarContactos(LinkedList linkedList){
        if(linkedList.isEmpty()) {
            JOptionPane.showMessageDialog(null,"No hay informacion para mostrar");
            menu();
        }

        int longitudlista = linkedList.size();
        for(int i=0;i<longitudlista;i++){
            System.out.println(linkedList.get(i).toString());
        }      
    }


    public static void menu(){

        try{
            int opcionDisponible = Integer.parseInt(JOptionPane.showInputDialog("\n Agenda\n 1. Registrar contactos \n 2. Modificar contactos. \n 3. Eliminar contactos \n 4. Mostrar contactos \n 5. Salir \n \n Ingrese número de opción\n"));

            switch(opcionDisponible){
                case 1:
                    //int id = Integer.parseInt(JOptionPane.showMessageDialog("Ingrese su id"));
                    
                    String datos = JOptionPane.showInputDialog("Ingrese su nombre y apellidos");
                    JOptionPane.showMessageDialog(null,"Datos ingresados: "+datos);

                    System.out.println(datos);
                    String correo = JOptionPane.showInputDialog("Ingrese su correo");
                    JOptionPane.showMessageDialog(null,"Correo ingresado "+correo);
                    contador = contador + 1;
                    Contacto contacto = new Contacto(contador,datos,correo);
                    
                    linkedlist.add(contacto);
                    menu();

                break;

                case 2:
                JOptionPane.showMessageDialog(null,"Interfaz grafica en desarrollo");
                menu();
                break;

                case 3:
                JOptionPane.showMessageDialog(null,"Interfaz grafica en desarrollo");
                menu();
                break;

                case 4:
                listarContactos(linkedlist);
                JOptionPane.showMessageDialog(null,"Interfaz grafica en desarrollo");
                menu();
                break;

                case 5:
                System.exit(0);
                break;

                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta","Mensaje error",JOptionPane.ERROR_MESSAGE);
                    menu();
                break;
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Opción incorrecta","Mensaje error",JOptionPane.ERROR_MESSAGE);
             menu();
        }

    }



}