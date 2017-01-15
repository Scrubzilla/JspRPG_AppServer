/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Helpers.CharacterHelper;
import Singletons.ZoneStorage;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import jsrpg.Character; 


/**
 *
 * @author User
 */
@Stateless
@WebService
public class ZoneHandlerBean {

    @WebMethod
    public String addAccountToZone(String accName, String zoneId) {
        ZoneStorage.getInstance().addAccountToZone(zoneId, accName);
        return "";
    }
    @WebMethod
    public String moveAccountFromZone(String accName) {
        ZoneStorage.getInstance().moveAccoutFromZone(accName);
        return "";
    }
    @WebMethod
    public ArrayList<String> getZone(String zoneId){
        ArrayList<String> zone = null;
        if(zoneId.equalsIgnoreCase("1")){
            zone = ZoneStorage.getInstance().getZone1();
        }else if(zoneId.equalsIgnoreCase("2")){
            zone = ZoneStorage.getInstance().getZone2();
        }else if(zoneId.equalsIgnoreCase("3")){
            zone = ZoneStorage.getInstance().getZone3();
        }
        
        return zone;
    }
    
    @WebMethod
    public String changeCharLocationInDB(String accName, String zoneId){
        
        CharacterHelper charHelp = new CharacterHelper();
        Character chara = charHelp.getCharacterFromAccountName(accName);
        charHelp.changeLocationOfChar(chara, Integer.parseInt(zoneId));
        
        
        return "";
    }
    
}
