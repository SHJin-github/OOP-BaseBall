import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    private List<Integer> numbers;

    public Computer() {
        this.numbers = new ArrayList<>();
        while (numbers.size()<3){
            int randomNumber = new Random().nextInt(9)+1;
            if(!numbers.contains(randomNumber)){
                numbers.add(randomNumber);
            }
        }
    }

    public List<Integer> setComputerNumbers(){
        return numbers;
    }

}
