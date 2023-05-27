package kr.ac.inha.command;

// 클라이언트 클래스
public class PokemonGame {
    public static void main(String[] args) {
        // 리시버 객체 생성
        Pokemon pikachu = new Pokemon("피카츄");

        // 커맨드 객체 생성
        Command attackCommand = new AttackCommand(pikachu);
        //Command defendCommand = new DefendCommand(pikachu);

        // 인보커 객체 생성
        Game game = new Game();

        // 커맨드 설정 및 실행
        game.setCommand(attackCommand); // 커맨드 객체 등록
        game.play();

        //game.setCommand(defendCommand);
        game.setCommand(()-> pikachu.defend());  // lambda expression
        game.play();
    }
}