package kr.ac.inha.command;

// 인보커 클래스
class Game {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void play() {
        command.execute();
    }
}
