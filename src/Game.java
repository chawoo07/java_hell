import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    String rps;
    int com = (int) (Math.random() * 3);




    //가위 1  바위 2  보 3

    public Game(String rps) {

        switch (rps) {
            case "가위":
                System.out.println("당신: " + rps);
                if (com == 0) {
                    System.out.println("컴퓨터: 가위");
                    System.out.println("비겼습니다. ");
                } else if (com == 1) {
                    System.out.println("컴퓨터: 바위");
                    System.out.println("패배");
                } else if (com == 2) {
                    System.out.println("컴퓨터: 보");
                    System.out.println("승리");
                }
                break;
            case "바위":
                System.out.println("당신: " + rps);
                if (com == 0) {
                    System.out.println("컴퓨터: 가위");
                    System.out.println("승리");
                } else if (com == 1) {
                    System.out.println("컴퓨터: 바위");
                    System.out.println("비겼습니다.");
                } else if (com == 2) {
                    System.out.println("컴퓨터: 보");
                    System.out.println("패배 ");
                }
                break;
            case "보":
                System.out.println("당신: " + rps);
                if (com == 0) {
                    System.out.println("컴퓨터: 가위");
                    System.out.println("패배");
                } else if (com == 1) {
                    System.out.println("컴퓨터: 바위");
                    System.out.println("승리.");
                } else if (com == 2) {
                    System.out.println("컴퓨터: 보");
                    System.out.println("비겼습니다.");
                }
                break;
            default:
                System.out.println("오류. 정확히 써주세요.");
                break;
        }
        System.out.println("다시 하시겠습니까? Y/N");
        String input = sc.nextLine();
        if(input.equals("Y") || input.equals("y")){
            System.out.println("가위바위보");
            rps = sc.nextLine();
            Game game = new Game(rps);

        }else if (input.equals("N") || input.equals("n")){

        }else {
            System.out.print("Y, y, N, n 중에 하나를 입력해주세요");


        }
    }
}
