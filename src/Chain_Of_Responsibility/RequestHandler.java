package Chain_Of_Responsibility;


public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //요청 처리를 다음 핸들러에 위임
    public void handle(Request request) {
        //다음 핸들러가 없을 수도 있기 때문에 null이 아닌 경우에 전달
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
