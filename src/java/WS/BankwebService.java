/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import WSClients.BankService_Service;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author User
 */
@WebService(serviceName = "BankwebService")
public class BankwebService {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/BankService/BankService.wsdl")
    private BankService_Service service;

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
        String response = makePayment_1(creditcard, Float.parseFloat(amount));
        //wee
        return response;
    }

    private String makePayment_1(java.lang.String creditCard, float paymentAmount) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        WSClients.BankService port = service.getBankServicePort();
        return port.makePayment(creditCard, paymentAmount);
    }
    
    
}
