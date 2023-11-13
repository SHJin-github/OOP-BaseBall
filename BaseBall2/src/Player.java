import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    private RuleOfNumber rules;
    private List<Integer> bolls;
    private final Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);;
    }

    public boolean wantGame(){
        while (true) {
            System.out.println("게임을 다시 시작하려면 " + rules.RESTART_GAME + "를, 게임을 종료하려면 " + rules.END_GAME + "를 눌러주세요");
            int input = scanner.nextInt();
            if (input == rules.RESTART_GAME) {
                return true;
            } else if (input == rules.END_GAME) {
                System.out.println("게임을 종료합니다.");
                return false;
            } else {
                System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
            }
        }
    }

    public List<Integer> guessBolls(){
        while (true) {
            try {
                String str = scanner.nextLine();
                bolls = checkBolls(str);
                break;
            } catch (IllegalArgumentException e) { }
        }
        return bolls;
    }

    private List<Integer> checkBolls(String str){
        int num = isNumber(str);
        List<Integer> bolls = new ArrayList<>();

        bolls.add(num/100);
        bolls.add(num%100/10);
        bolls.add(num%10);

        if (!(isRangeNumber(bolls) && isNotDuplication(bolls))) {
            throw new IllegalArgumentException();
        }
        return bolls;
    }

    private int isNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("숫자만 입력하세요");
            throw new IllegalArgumentException();
        }
    }

    private boolean isRangeNumber(List<Integer> bolls){
        for(Integer boll :  bolls){
            if(!(boll >= rules.START_NUMBER && boll <= rules.END_NUMBER)) {
                System.out.println(rules.START_NUMBER+"~"+rules.END_NUMBER+"숫자로 입력하세요");
                return false;
            }
        }
        return true;
    }

    private boolean isNotDuplication(List<Integer> bolls){
        List<Integer> set = new ArrayList<>();
        for (int boll : bolls) {
            if (set.contains(boll)) {
                System.out.println("중복된 숫자가 있습니다");
                return false;
            }
            set.add(boll);
        }
        return true;
    }


}
