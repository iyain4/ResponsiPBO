/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author robot
 */
public class Main {

    public static void main(String[] args) {
        MovieModel model = new MovieModel();
        MovieView tampilan = new MovieView();
        MovieController kontrol = new MovieController(model, tampilan);
    }
    
}
