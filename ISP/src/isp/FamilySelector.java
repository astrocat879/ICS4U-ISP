/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author hewmatt
 */
import java.util.*;
public class FamilySelector {
    public static void add(Event ee){
        ISP.FEvents.add(ee);
        ISP.FUsed.add(false);
    }
    public int select(){
        boolean has = false;
        for(int i = 0;i<ISP.FUsed.size();i++){
            if(ISP.FUsed.get(i) == true){
                has = true;
                break;
            }
        }
        if(!has)return -1;
        while(true){
            int id = (int)(Math.random()*(ISP.FEvents.size()));
            if(ISP.FUsed.get(id) == false){
                return id;
            }
        }
    }
    public Event getEvent(int id){
        return ISP.FEvents.get(id);
    }
    public void complete(int id){
        ISP.FUsed.set(id,true);
    }
}