package CarTailor.src.CarTailorConfiguration;

import CarTailor.src.CarTailor.*;
import carTailorConfigurator.Observable;

import javax.swing.*;
import java.util.Iterator;

public class IHM implements Observer{

    Interior interieur = new Interior();
    Exterior exterieur = new Exterior();
    Engine moteur = new Engine();
    Transmission transmission = new Transmission();


    IncompatibilityManager incompatibilityManager = new IncompatibilityManager();

    public static void main(String[]args){
    JFrame fenetre=new JFrame();
    fenetre.setTitle("CarTailor");
    fenetre.setSize(400, 500);
    fenetre.setLocationRelativeTo(null);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);

    JPanel panneau_config = new JPanel();
    JComboBox<Iterator<String>> choix_interieur = new JComboBox<>();
        //choix_interieur.setModel(new DefaultComboBoxModel(ls.toArray()));
        choix_interieur.addItem(interieur.getContent());
    JComboBox<String> choix_exterieur = new JComboBox<>();
       // choix_exterieur.setModel(new DefaultComboBoxModel<String>((Vector<String>) exterieur.getContent()));
    JComboBox<String> choix_moteur = new JComboBox<>();
        //choix_moteur.setModel(new DefaultComboBoxModel<String>((Vector<String>) moteur.getContent()));
    JComboBox<String> choix_transmission = new JComboBox<>();
        //choix_transmission.setModel(new DefaultComboBoxModel<String>((Vector<String>) transmission.getContent()));
    panneau_config.add(choix_interieur);/*panneau_config.add(choix_exterieur);panneau_config.add(choix_moteur);panneau_config.add(choix_transmission);*/

    fenetre.add(panneau_config);

}


    public void update(Observable o) {

    }
}
