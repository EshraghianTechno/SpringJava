package continueOfSession2WithSpring;

import org.springframework.stereotype.Component;

@Component("Mellat")
public class MellatImpl implements ITransferService{
    @Override
    public Boolean transfer(long cardNumber, double amount) {
        System.out.println("Connecting to Mellat Bank...");
        return true;
    }
}
