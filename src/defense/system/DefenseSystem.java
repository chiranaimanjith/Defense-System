/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defense.system;

import defense.system.Observer.Observable;

/**
 *
 * @author User
 */
public class DefenseSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observable observable= Observable.getInstance();
        MainController m1 = MainController.getInstance();
        m1.setVisible(true);
        observable.addObserver(new Helicopter());
        observable.addObserver(new Tank());
        observable.addObserver(new Submarine());
        
        
    }
    
}
