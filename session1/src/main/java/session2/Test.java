package session2;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        new MyContent().injectIn(client);
        client.callTransfer(123 , 1021.5);
    }
}
