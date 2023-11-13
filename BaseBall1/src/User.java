import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    public List<Integer> setUserNumbers(List<Integer> user){

        Scanner scanner = new Scanner(System.in);

        boolean validInput = false; //입력값 check
        while (!validInput) {
            String[] inputs = scanner.nextLine().split(" ");

            if (inputs.length != 3) {// 3개 입력 CHECK
                System.out.println("3개만 입력해주세요");
                continue;
            }
            for(String inputNum:inputs){
                try {
                    int userNumber = Integer.parseInt(inputNum);
                    if (userNumber >= 1 && userNumber <= 9 && !user.contains(userNumber)) { //1~9까지의 숫자만 입력
                        user.add(userNumber);
                    } else {
                        System.out.println("1~9까지의 숫자만 입력하세요");
                        user.clear();
                        break;
                    }
                } catch (NumberFormatException e){ // 숫자 CHECK
                    System.out.println("숫자만 입력하세요");
                    break;
                }
            }
            if(user.size() == 3){
                validInput = true;
            }
        }
        return user;
    }


}
