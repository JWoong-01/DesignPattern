package Chain_Of_Responsibility;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    //로깅하는 핸들러
    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
