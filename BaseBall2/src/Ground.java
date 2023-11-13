public class Ground {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        Judgement judgement = new Judgement();

        BaseBallGame baseBallGame = new BaseBallGame(computer,player,judgement);
        baseBallGame.start();
    }



}
