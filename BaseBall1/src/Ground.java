import java.util.ArrayList;
import java.util.List;

public class Ground {

    public static void main(String[] args) {
        Computer computer = new Computer();
        List<Integer> computerNum = computer.setComputerNumbers();
        System.out.println("Computer_Number : "+computerNum);
        System.out.println("1~9까지 3개의 숫자를 입력하세요(공백 구분)");

        User user = new User();
        int cnt = 1;
        List<Integer> userNum = new ArrayList<>();
        while (userNum.size()==0){
            userNum = user.setUserNumbers(userNum);

            Rules rules = new Rules();
            int[] count = rules.strikeAndBoll(userNum,computerNum);
            if(count[0]==3){
                System.out.println(cnt+"번재로 맞추었습니다");
                break;
            } else {
                System.out.println("스트라이크:"+count[0]+" 볼:"+count[1]);
                cnt++;
                userNum.clear();
            }
        }


    }


}
