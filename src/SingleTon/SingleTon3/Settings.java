package SingleTon.SingleTon3;

public class Settings { //이른 초기화 (eager initialization)을 사용하는 방법

    private static final Settings INSTANCE = new Settings();
    private Settings() {}
    public static Settings getInstance() {
        return INSTANCE;
    }
}
