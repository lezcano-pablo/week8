/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author FamiliaLezcano
 */
public class Rectangle {
    private int base;
    private int high;

    public Rectangle(){}
    
    public Rectangle(int base, int high)
    {
        this.base= base;
        this.high= high;
    }
    
    public int getHigh(){
        return high;
    }
    
    public void  setHigh(int high){
        this.high= high;
    }
    
    public int getBase(){
        return base;
        
    }
    
    public void setBase(int base){
        this.base= base;
    }
    
    public int getArea(){
        return this.base * this.high;
    }
    
}
