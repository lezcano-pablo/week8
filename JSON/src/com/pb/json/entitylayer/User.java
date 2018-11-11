/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.json.entitylayer;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

/**
 *
 * @author FamiliaLezcano
 */
public class User implements JSONStreamAware{
    
   private int id;
   private String username;
   private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   public User(int id, String username, String password){
       super();
       this.id=id;
       this.username=username;
       this.password=password;
       
   }

   
    public void writeJSONString(Writer out) throws IOException {
        LinkedHashMap obj = new LinkedHashMap();
        obj.put("id", String.valueOf(id));
        obj.put("username", username);
        obj.put("password", password);
        JSONValue.writeJSONString(obj, out);
    }
       
   }