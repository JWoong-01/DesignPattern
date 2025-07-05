package SingleTon.SingleTon4;

public class Settings { //double checked locking으로 효율적인 동기화 블럭 만들기
    private static volatile Settings instance;

    private  Settings() {

    }
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                instance = new Settings();
            }
        }
        return instance;
    }
}
