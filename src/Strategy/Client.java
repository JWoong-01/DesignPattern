package Strategy;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        //전략 선택
        game.blueLight(new Normal());
        game.redLight(new Fastest());
        //매서드를 호출하는 순간에 익명 내부클래스를 사용해서 구현도 가능
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }
}
