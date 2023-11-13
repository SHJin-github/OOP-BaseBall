import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    private List<Integer> bolls;

    private RuleOfNumber rules;

    public List<Integer> generateBolls(){
        Random random = new Random();
        bolls = new ArrayList<>();

        while (bolls.size() < rules.LENGHT){
            int boll = random.nextInt(rules.END_NUMBER)+rules.START_NUMBER;
            if(!bolls.contains(boll))
                bolls.add(boll);
        }
        return bolls;
    }

}
