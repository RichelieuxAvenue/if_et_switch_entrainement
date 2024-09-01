import javax.swing.*;

public class If {
    public static void main(String []args){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Veuillez saisir votre age: 👀"));
        if (age > 18){
            JOptionPane.showMessageDialog(null, "Vous êtes majeur. 🧑");
            System.out.println("Fin du programme...");
        } else if (age ==18) {
            JOptionPane.showMessageDialog(null, "🎊Félicitation vous venez d'atteindre la majorité!🎉");
            System.out.println("Fin du programme...");
        } else{
            JOptionPane.showMessageDialog(null, "Vous êtes mineur. 👶");
            System.out.println("Fin du programme...");
        }
    }
}
