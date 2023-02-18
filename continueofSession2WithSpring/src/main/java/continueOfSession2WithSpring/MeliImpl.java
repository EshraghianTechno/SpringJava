package continueOfSession2WithSpring;

import org.springframework.stereotype.Component;

@Component("Meli")
public class MeliImpl implements ITransferService {
    @Override
    public Boolean transfer(long cardNumber, double amount) {
        System.out.println("Connecting to Meli Bank ...");
        return true;
    }
}
