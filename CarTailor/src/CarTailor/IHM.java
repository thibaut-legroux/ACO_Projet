package CarTailor.src.CarTailor;

import CarTailor.src.Category.*;
import CarTailor.src.Interface.Observable;
import CarTailor.src.Interface.Observer;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;

public class IHM  {

    Interior interieur = new Interior();
    Exterior exterieur = new Exterior();
    Engine moteur = new Engine();
    Transmission transmission = new Transmission();


    HashMap<PartImpl, PartImpl> incomptatibility = new HashMap<>();
    HashMap<PartImpl, PartImpl> requirement = new HashMap<>();
    //CarTailor.src.CarTailor.IncompatibilityManager incompatibilityManager = new CarTailor.src.CarTailor.IncompatibilityManager(incomptatibility,requirement);


   /* public void ajouterIncompatiblity(){
        Interior interieur = new Interior();
        Exterior exterieur = new Exterior();
        Engine moteur = new Engine();
        Transmission transmission = new Transmission();

        incompatibilityManager.addincompatibilities(interieur.IS,moteur.EG100);incompatibilityManager.addincompatibilities(interieur.IS,transmission.TM5);
        incompatibilityManager.addincompatibilities(transmission.TA5,moteur.EG100);incompatibilityManager.addincompatibilities(transmission.TSF7,moteur.EG100);
        incompatibilityManager.addincompatibilities(transmission.TSF7,moteur.EG133);incompatibilityManager.addincompatibilities(transmission.TSF7,moteur.ED110);
        incompatibilityManager.addincompatibilities(exterieur.XC,moteur.EG210);incompatibilityManager.addincompatibilities(exterieur.XM,moteur.EG100);
        incompatibilityManager.addincompatibilities(exterieur.XS,moteur.EG100);

        incompatibilityManager.addrequirements(moteur.EH120,transmission.TC120);incompatibilityManager.addrequirements(transmission.TC120,moteur.EH120);
        incompatibilityManager.addrequirements(exterieur.XS,interieur.IS);incompatibilityManager.addrequirements(interieur.IS,exterieur.XS);

    }*/



    /*public static void main(String[]args){
    JFrame fenetre=new JFrame();
    fenetre.setTitle("CarTailor");
    fenetre.setSize(400, 500);
    fenetre.setLocationRelativeTo(null);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);

    JPanel panneau_config = new JPanel();
    JComboBox<Iterator<String>> choix_interieur = new JComboBox<>();
        //choix_interieur.setModel(new DefaultComboBoxModel(ls.toArray()));
        choix_interieur.addItem(this.interieur.getContent());
    JComboBox<String> choix_exterieur = new JComboBox<>();
       // choix_exterieur.setModel(new DefaultComboBoxModel<String>((Vector<String>) exterieur.getContent()));
    JComboBox<String> choix_moteur = new JComboBox<>();
        //choix_moteur.setModel(new DefaultComboBoxModel<String>((Vector<String>) moteur.getContent()));
    JComboBox<String> choix_transmission = new JComboBox<>();
        //choix_transmission.setModel(new DefaultComboBoxModel<String>((Vector<String>) transmission.getContent()));
    panneau_config.add(choix_interieur);/*panneau_config.add(choix_exterieur);panneau_config.add(choix_moteur);panneau_config.add(choix_transmission);*/

   /* fenetre.add(panneau_config);

    }
*/

  /*  public void update(Observable o) {

    }*/
}
