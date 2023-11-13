import java.util.List;

public class Rules {

    private final int START_NUMBER = 1;
    private final int END_NUMBER = 1;
    private final int COUNT = 3;


    public int[] strikeAndBoll(List<Integer> user, List<Integer> computer){
        int[] count = new int[2];
        for(int i = 0;i<3;i++){
            for(int j =0;j<3;j++){
                if(i==j && user.get(i).equals(computer.get(j))){
                    count[0]++;
                }else if (i!=j && user.get(i).equals(computer.get(j))){
                    count[1]++;
                }
            }
        }
        return count;
    }
}
