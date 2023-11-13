import java.util.List;

public class BaseBallGame implements Game{

    private final Computer computer;
    private final Player player;
    private final Judgement judgement;

    public BaseBallGame(Computer computer, Player player, Judgement judgement) {
        this.computer = computer;
        this.player = player;
        this.judgement = judgement;
    }

    @Override
    public void start() {
        play();
        while (player.wantGame()) play();
    }

    public void play(){
        System.out.println("게임을 시작합니다");
        List<Integer> computerBolls = computer.generateBolls();
        System.out.println("세자리 숫자를 입력하세요");
        int count = 1;
        while(!judgement.isOutComputer(computerBolls, player.guessBolls())) count++;
        System.out.println(count+"번째에 맞추었습니다");

    }

}
