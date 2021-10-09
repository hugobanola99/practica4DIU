/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4diu;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author hugob
 */

public class Lienzo extends JPanel{
    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Integer> arrayY = new ArrayList<Integer>();
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int[] mouseX = ArrayListConverter(arrayX);
        int[] mouseY = ArrayListConverter(arrayY);
        for(int i = 0; i < mouseX.length; i++){
            g.fillOval(mouseX[i],mouseY[i], 20, 20);
        }
        
        //setBack();   
    }
    
    public void wakeCircle(int x, int y){
        System.out.println(arrayX.size());
        arrayX.add(0,x);
        arrayY.add(0,y);
        if(arrayX.size() > 5){
            arrayX.remove(5);
            arrayY.remove(5);
        }
    }
    public int[] ArrayListConverter(ArrayList<Integer> array){
        int[] res = new int[array.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = array.get(i);
        }
        return res;
    }
   
}
