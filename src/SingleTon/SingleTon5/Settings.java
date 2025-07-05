package SingleTon.SingleTon5;

public class Settings { //static innerclass 사용
    private Settings() {}
    private static class SettingsHolder {
        private static final Settings SETTINGS = new Settings();
    }
    public static Settings getInstance() {
        return SettingsHolder.SETTINGS;
    }
}

