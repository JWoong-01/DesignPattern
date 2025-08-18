package Memento;


public class Client {

    //CareTaker
    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        //10,20 값 저장
        GameSave save = game.save();

        //12, 22 새로 설정
        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        //저장값 복원
        game.restore(save);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
