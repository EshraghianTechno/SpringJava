package session2;

public class Client {

//    first way
//    private ITransferService service = new MellatImpl();


//    third way
    @Autowired(id="bank")
    private ITransferService service;


    public Boolean callTransfer(long cardNumber , double amount){
        System.out.println("Call transfer ...");
        service.transfer(cardNumber, amount);
        return true;

    }
}
