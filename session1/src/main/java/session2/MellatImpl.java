package session2;

public class MellatImpl implements ITransferService{
    @Override
    public Boolean transfer(long cardNumber, double amount) {
        System.out.println("Connecting to Mellat Bank...");
        return true;
    }
}
