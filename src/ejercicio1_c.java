
import javax.swing.JOptionPane;


public class ejercicio1_c {

    public static void main(String[] args) {
        final int saldo_inicial = 10000;
        int opcion;
        float ingreso,saldoActual,retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(" Bienvenido a su cajeroautomatico\n"
        + "1. ingrese dinero a la cuenta\n"
        + "2. retirar dinero de la cuenta\n"
        + "3. salir")) ;



        switch (opcion) {
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en la cuenta:"));
                    saldoActual = saldo_inicial + ingreso;
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta:" +saldoActual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));

            if (retiro>saldo_inicial) {
                JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro");
            }
            else {
                saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+saldoActual);
            }
            break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null,"se equivoco de opcion del menu") ; break;

            }
    }
}
