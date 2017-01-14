/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletons;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ZoneStorage {
    
    private static ZoneStorage zoneStorage;
    private ArrayList<String> zone1 = new ArrayList<>();
    private ArrayList<String> zone2 = new ArrayList<>(); 
    private ArrayList<String> zone3 = new ArrayList<>(); 
    
    
    private ZoneStorage(){}
    
    public static ZoneStorage getInstance(){
        if(zoneStorage == null){
            zoneStorage = new ZoneStorage();
        }
        return zoneStorage;
    }

    public ArrayList<String> getZone1() {
        return zone1;
    }

    public ArrayList<String> getZone2() {
        return zone2;
    }

    public ArrayList<String> getZone3() {
        return zone3;
    }
    
    public void addAccountToZone(String zone, String accName){
        if(zone.equalsIgnoreCase("1")){
            zone1.add(accName);
        }else if(zone.equalsIgnoreCase("2")){
            zone2.add(accName);
        }else if(zone.equalsIgnoreCase("3")){
            zone3.add(accName);
        }
    }
    
    public void moveAccoutFromZone(String accName){
        for(int i = 0; i < zone1.size(); i++){
            if(zone1.get(i).equalsIgnoreCase(accName)){
                zone1.remove(i);
            }
        }
        
        for(int i = 0; i < zone2.size(); i++){
            if(zone2.get(i).equalsIgnoreCase(accName)){
                zone2.remove(i);
            }
        }
        
        for(int i = 0; i < zone3.size(); i++){
            if(zone3.get(i).equalsIgnoreCase(accName)){
                zone3.remove(i);
            }
        }
    }
}
