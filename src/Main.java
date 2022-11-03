

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//         수학 과학 영어 평균 구하고 평가
//        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
//
//
//        System.out.print("수학: ");
//        int math = sc.nextInt();
//        System.out.print("과학: ");
//        int science = sc.nextInt();
//        System.out.print("수학: ");
//        int english = sc.nextInt();
//        Grade me = new Grade(math, science, english);
//        System.out.println("평균은 "+me.average());
//        System.out.println(me.getGrade()); // 수 입니다


        //가위바위보
        System.out.println("가위바위보");
        String rps = sc.nextLine();
        Game game = new Game(rps);



    }



}
