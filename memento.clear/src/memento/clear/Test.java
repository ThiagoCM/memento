/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.clear;

/**
 *
 * @author Thiago
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("Phase 1", "Thiago", caretaker);
        
        System.out.println("Default state:"+originator);
        
        originator.setPhase("Phase 2");
        
        System.out.println("State:"+originator);
        originator.savePoint("FIRST_SAVE");
        
        originator.setPhase("Phase 3");
        System.out.println("State:"+originator);
        
        originator.undo();
        System.out.println("State after undo: "+originator);
        
        originator.setPhase("Phase 4");
        originator.savePoint("SECOND_SAVE");
        System.out.println("State:"+originator);
        
        originator.setPhase("Phase 5");
        originator.savePoint("THIRD_SAVE");
        System.out.println("State:"+originator);
        
        originator.setPhase("Phase 6");
        originator.savePoint("FOURTH_SAVE");
        System.out.println("State:"+originator);
        
        originator.undo("SECOND_SAVE");
        System.out.println("Undo at second save: "+originator);

        originator.setPhase("Phase 8");
        originator.savePoint("FIFTH_SAVE");
        System.out.println("State:"+originator);
        
        originator.undoAll();
        System.out.println("State after undo all: "+originator);
    }
    
}