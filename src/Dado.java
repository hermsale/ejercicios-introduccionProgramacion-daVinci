
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dado {
    public static void main(String[] args) {
        double dado;
        String numStr;
        boolean sinIntentos = true;
        // obtenemos valores entre el 1 y 6
        dado = (int)(Math.random()*6+1);
        int intentos=3;
        boolean valido = false;
        int num=0;

        // Lo que se tiene que respetar si o si de un showInputDialog es que tenga 7 paramtros y que el 4to parametro sea un Joptionpane.INFORMATION_MESSAGE
        while(sinIntentos){
            // validamos el ingreso de dato
            while(!valido){
                numStr = (String) JOptionPane.showInputDialog(
                    null,
                    "Ingrese un número entre el 1 y 6: "+dado+" \n Cantidad de intentos restantes: "+intentos,
                    "Adivinar dado:",
                    JOptionPane.INFORMATION_MESSAGE, // indicas de que tipo es el Joptionpane. en este caso tipo mensaje 
                    new ImageIcon(Dado.class.getResource("./img/dado.jpg")), // 5to parametro para obtener la imagen creamos un ImageIcon, y adentro indicamos el nombre de la clase .class.getResource
                    null, 
                    null
                );
               
                num = Integer.parseInt(numStr);
                // verificamos si el numero ingresado esta entre los valores correspondientes
                if(num > 6 || num < 0){
                    JOptionPane.showMessageDialog(null, "El numero debe estar entre el 1 y 6","Mensaje",JOptionPane.ERROR_MESSAGE);
                }else{
                    valido=true;
                }
            }

            // parseo el numStr
            if(num==dado){
                // System.out.println("Felicitaciones! El numero de dado es "+(int)dado);
                JOptionPane.showMessageDialog(null, "Felicitaciones! El numero de dado es "+num,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
                break;
            }else{
                // System.out.println("incorrecto");
                // JOptionPane.showConfirmDialog(null, "Incorrecto");
                JOptionPane.showMessageDialog(null, "Incorrecto", "Mensaje", JOptionPane.ERROR_MESSAGE);
                intentos--;
                valido=false; // para que pueda volver a entrar al validador
                if (intentos==0) {
                    JOptionPane.showMessageDialog(null, "Perdiste! Vuelve la próxima ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                    sinIntentos=false;                    
                }
            }
        }
    }
}
