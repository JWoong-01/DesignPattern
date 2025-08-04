package Chain_Of_Responsibility;


public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    //체인 구성 AuthRequestHandler -> LoggingRequestHandler -> PrintRequestHandler -> null
    //체인을 만드는 main메서드에서 체인이 결정된다.
    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}

