package Chain_Of_Responsibility;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    //Request 출력
    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}

