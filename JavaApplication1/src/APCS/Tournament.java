/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APCS;

/**
 *
 * @author maruiling
 */
import java.util.*;

class Player{
    
    private String playername;
    private int playernumber;
    
    public Player(String name, int number){
        playername = name;
        playernumber = number;
    }
    
    public int getPlayerNumber(){
        return playernumber;
    }
}
public class Tournament {
    
    private Player[] slots;
    private List<String> waitingList;
    
    public Player cancelAndReassignSlot(Player p){
        
        for(int i = 0; i < slots.length; i++){
            
            if(slots[i] == p){
                if(waitingList.size() != 0){
                    Player q = new Player(waitingList.remove(0), i);
                    slots[i] = q;
                    return q;
                }else{
                    slots[i] = null;
                    return null;
                }
            }
        }
        return null;
        
    }
    
}
