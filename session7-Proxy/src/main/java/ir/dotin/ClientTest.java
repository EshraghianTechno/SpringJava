package ir.dotin;

public class ClientTest {

    public static void main(String[] args) {

        getService().m(); // the method is called on dynamic proxy object
        
    }
    
    static I getService() {
        
        return (I) IHandler.createFor( new Target() ); // return the dynamic proxy for target
        
    }
    
}
