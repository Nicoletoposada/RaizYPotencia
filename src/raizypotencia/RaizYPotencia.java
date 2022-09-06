package raizypotencia;

import javax.swing.JOptionPane;

public class RaizYPotencia
{
    public static void main(String[] args)
    {
        raiz();
    }
    
    public static void raiz()
    {
        double a, c;
        int b;
        
        for(int i = 1; i <= 5; i++)
        {
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            c = Math.sqrt(Math.pow(a, b));
            
            if(c <= 100)
            {
                JOptionPane.showMessageDialog(null, "La raiz es menor a 100");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La raiz es mayor a 100");
            }
            JOptionPane.showMessageDialog(null, "La raiz es = " + c);
        }
    }
    
}
