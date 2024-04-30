import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // la funcion para generar numeros al azar en Java es Math.random()
        // Este metodo devuelve un numero al azar positivo de tipo double 
        // mayor o igual que 0.0 y menor que 1.0. 
        // osea que sus posibles resultados varian entre 0,000123, 0,5233, y 0,99999
  
        double num;
        
        // numero entre 0.0 y 0.9
        num = Math.random();
        System.out.println("el numero aleatorio entre 0.0 y 0.1 es "+num);

        // entre 0 y 10 - y guardo solo la parte entera 
        num = (int)(Math.random()*10);
        System.out.println("el numero aleatorio entre 0 y 1 es "+num);

        // entre 0 y 100 - guardo el double pero muestro solo la parte entera 
        num = (Math.random()*100);
        System.out.println("el numero aleatorio entre 0 y 100 sin  decimal "+(int)num);
        System.out.println("el numero aleatorio entre 0 y 100 con decimales "+num);

        // JOptionPane

        // mensaje con titulo y posibilidad de cambiar tipo de icono de mensaje 
        JOptionPane.showMessageDialog(null, "el numero aleatorio entre 0 y 100 con decimales "+num, "numeros aleatorios", 2);
        // mensaje sin titulo y con icono de tipo de mensaje informativo
        JOptionPane.showMessageDialog(null, "el numero aleatorio entre 0 y 100 sin decimal "+(int)num);

        
    }
}
