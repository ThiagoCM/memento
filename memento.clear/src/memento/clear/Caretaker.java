/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.clear;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Thiago
 */
public class Caretaker {
    private final Map<String, Memento> saveStorage = new HashMap<String, Memento>();
    
    public void saveMemento(Memento m, String saveName) {
        System.out.println("Saving state as: "+saveName);
        saveStorage.put(saveName, m);
    }
    
    public Memento getMemento(String saveName) {
        System.out.println("Undo at:"+saveName);
        return saveStorage.get(saveName);
    }
    
    public void clearSaves() {
        System.out.println("Clearing all saves...");
        saveStorage.clear();
    }
}
