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
    public class Memento {
        private String phase;
        private String name;

        public Memento(String phase, String name) {
            this.phase = phase;
            this.name = name;
        }

        public String getPhase() {
            return phase;
        }

        public String getName() {
            return name;
        }

    }
