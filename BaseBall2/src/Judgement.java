import java.util.List;


public class Judgement {

    private int strikes;
    private int balls;

    private RuleOfNumber rules;


    public boolean isOutComputer(List<Integer> computerBolls, List<Integer> playerBolls){
        compare(computerBolls, playerBolls);
        if(strikes==rules.LENGHT) return true;
        reset();
        return false;
    }

    private void compare(List<Integer> computerBolls, List<Integer> playerBolls){
        for (int i = 0; i < computerBolls.size(); i++) {
            if (computerBolls.get(i).equals(playerBolls.get(i))) {
                strikes++;
            } else if (playerBolls.contains(computerBolls.get(i))) {
                balls++;
            }
        }
        if (strikes > 0 && balls == 0) {
            System.out.println(strikes + " 스트라이크");
        }
        if (strikes == 0 && balls > 0) {
            System.out.println(balls + " 볼");
        }
        if(strikes > 0 && balls > 0){
            System.out.println(strikes + " 스트라이크 "+ balls + " 볼");
        }
        if (strikes == 0 && balls == 0) {
            System.out.println("낫싱");
        }

    }

    private void reset(){
        strikes =0;
        balls=0;
    }


}
