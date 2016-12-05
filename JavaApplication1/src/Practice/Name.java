/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author maruiling
 */
import java.util.HashMap;

public class Name {
    public static void main(String[] args){
        HashMap <String, Integer> friendName = new HashMap <String, Integer>();
        friendName.put("Ruiling", 16);
        friendName.put("Hanxiao", 15);
        friendName.put("Jiayi", 17);
        friendName.put("Jiaqi", 18);
        
        System.out.println(friendName.size());
        for (String name : friendName.keySet()){
            System.out.println(name + " is " + friendName.get(name));
        }
                
        System.out.println(friendName.get(friendName.keySet()));
    }
   
    
}
