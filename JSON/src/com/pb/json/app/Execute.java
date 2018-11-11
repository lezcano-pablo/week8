/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.json.app;

import com.pb.json.businesslayer.BL_User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author FamiliaLezcano
 */
public class Execute {
    
       public static void main(String[] args) {
          System.out.println("\n==================ENCODE===================\n");
               BL_User bl_user= new BL_User();
               JSONArray array= new JSONArray();
               array= bl_user.arrayUsers();
               StringWriter out= new StringWriter();
               
              try{
                  array.writeJSONString(out);
           } catch (IOException e) {
               e.printStackTrace();
           }
           System.out.println(out);
          System.out.println("\n==================DECODE===================\n");
          JSONObject jsonUsers= new JSONObject();
          jsonUsers.put("users", out);
                  
          JSONParser user_parser= new JSONParser();
           try {
               JSONObject objUsers= (JSONObject) user_parser.parse(jsonUsers.toJSONString());
               JSONArray arrayUsers = (JSONArray)objUsers.get("users");
               for(int i=0; i<arrayUsers.size();i++){
                   JSONObject user= (JSONObject)arrayUsers.get(i);
                   String id= user.get("id").toString();
                   String username= user.get("username").toString();
                   String password=user.get("password").toString();
                   
                   System.out.println(id + "\t" + username + "\t" + password);
               }
               
           } catch (ParseException e) {
               e.printStackTrace();
           }
    }
    
}
    
