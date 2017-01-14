/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Helpers.AccountHelper;
import Helpers.CharacterHelper;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "ApplicationWebService")
public class ApplicationWebService {

    /**
     * This is a sample web service operation
     */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCharacter")
    public String addCharacter(@WebParam(name = "name") String name, @WebParam(name = "portrait") int portrait, @WebParam(name = "str") int str, @WebParam(name = "dex") int dex, @WebParam(name = "vit") int vit, @WebParam(name = "intell") int intell, @WebParam(name = "wis") int wis, @WebParam(name = "chr") int chr, @WebParam(name = "accountName") String accountName) {
        AccountHelper accHelp = new AccountHelper();
        accHelp.getAccount(accountName);
        CharacterHelper charHelp = new CharacterHelper();
        String response = charHelp.createCharacter(null, name, portrait, str, dex, vit, intell, wis, chr);
        
        
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addAccount")
    public String addAccount(@WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "eMail") String eMail, @WebParam(name = "securityQ") String securityQ, @WebParam(name = "securityQans") String securityQans) {
        AccountHelper accHelp = new AccountHelper();
        
        String response = accHelp.createAccount(eMail, username, password, securityQans, securityQans);
        
        return response;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "changePassword")
    public String changePassword(@WebParam(name = "username") String username, @WebParam(name = "newPassword") String newPassword) {
        //TODO write your implementation code here:
        return null;
    }
    
    
    
    
}