/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.json.dataaccesslayer;
import org.json.simple.JSONArray;
import com.pb.json.entitylayer.User;

/**
 *
 * @author FamiliaLezcano
 */
public class DA_User {
    public JSONArray arrayUsers(){
        
        JSONArray arr= new JSONArray();
        arr.add(new User(10, "Pablo", "159"));
        arr.add(new User(10, "Sole", "120"));
        arr.add(new User(10, "Delfina", "180"));
        return arr;
        
        
    }
    
}
