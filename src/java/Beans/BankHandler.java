/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import ws.JspRPGWebService_Service;

/**
 *
 * @author User
 */
@Stateless
public class BankHandler {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/JspRPGBankApp/JspRPGWebService.wsdl")
    private JspRPGWebService_Service service;

    private String makePayments(java.lang.String creditcard, java.lang.String amount) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.JspRPGWebService port = service.getJspRPGWebServicePort();
        return port.makePayments(creditcard, amount);
    }
   
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String makeThePayment(String creditcard, String amount) {
        String response = makePayments(creditcard, amount);
        return response;
    }
    
    
}
