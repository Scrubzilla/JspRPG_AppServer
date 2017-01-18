/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Beans.BankHandler;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;



/**
 *
 * @author User
 */
@WebService(serviceName = "BankwebService")
public class BankwebService {


    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "makePayment")
    public String makePayment(@WebParam(name = "creditcard") String creditcard, @WebParam(name = "amount") String amount) {
        BankHandler bankHa = new BankHandler();
        String response = bankHa.makeThePayment(creditcard, amount);
        //wee
        return response;
    }

    


    
    
}
