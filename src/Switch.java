import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenue dans le jeu secret box 🤫");
        int choix_user = Integer.parseInt(JOptionPane.showInputDialog("Veuillez choisir entre '1', '2' ou '3': 👀"));
        switch (choix_user) {
            case 1:
                JOptionPane.showMessageDialog(null, "Voici le premier secret... 🎁");
            case 2:
                JOptionPane.showMessageDialog(null, "Voici le deuxième secret... 🎁");
            case 3:
                JOptionPane.showMessageDialog(null, "Voici le troisième secret... 🎁");

        }
    }
}
