package ir.dotin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client2 {

//    first way
//    private ITransferService service = new MellatImpl();


    //    third way
    @Autowired
    @Qualifier("Mellat")
    private ITransferService service;


    public Boolean   callTransfer(long cardNumber, double amount) {
        System.out.println("Call transfer ...");
        service.transfer(cardNumber, amount);
        System.out.println("!!!!!!Test Git");
        return true;

    }
}
