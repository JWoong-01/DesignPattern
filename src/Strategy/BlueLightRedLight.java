package Strategy;

public class BlueLightRedLight {

    //메서드 파라미터로 전략 주기
    public void blueLight(Speed speed) {
        speed.blueLight();
    }

    public void redLight(Speed speed) {
        speed.redLight();
    }
}
