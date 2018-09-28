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
public class Originator {

    private String phase;
    private String name;
    
    private String savedPoint;
    Caretaker caretaker;
    
    public Originator(String phase, String name, Caretaker caretaker) {
        this.phase = phase;
        this.name = name;
        this.caretaker = caretaker;
        
        savePoint("INITIAL");
    }
    
    public String getPhase() {
        return phase;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPhase(String phase) {
        this.phase = phase;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void savePoint(String saveName) {
        caretaker.saveMemento(new Memento(this.phase, this.name), saveName);
        savedPoint = saveName;
    }
    
    public void undo() {
        setOriginatorState(savedPoint);
    }
    
    public void undo(String saveName) {
        setOriginatorState(saveName);
    }
    
    public void undoAll() {
        setOriginatorState("INITIAL");
        caretaker.clearSaves();
    }
    
    private void setOriginatorState(String saveName) {
        Memento m  = caretaker.getMemento(saveName);
        this.name = m.getName();
        this.phase = m.getPhase();
    }
    
    @Override
    public String toString() {
        return "Name: "+ name+", Phase:"+phase;
    }
}


