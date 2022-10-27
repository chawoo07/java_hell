class VariableDecl {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;

        //if문
        if (n1 < n2) {
            System.out.println("n1 > n2 is true");
        }

        //if~else
        if (n1 == n2) {
            System.out.println("n1 == n2 is true");
        } else {
            System.out.println("n1 == n2 is false");
        }
        int kor, eng, math;

        kor = 90;
        eng = 60;
        math = 80;
        int total;
        double avg;

        total = kor + eng + math;
        avg = total / 3.0;

        System.out.println(total);
        System.out.println(avg);

        if (avg >= 90) {
            System.out.println("수");
        } else if (avg >= 80) {
            System.out.println("우");
        } else if (avg >= 70) {
            System.out.println("미");
        } else if (avg >= 60) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }

/////////////////////////////////////////////////////////////////////////////

        //삼항 연산자

        int num1 = 50;
        int num2 = 100;

        int big;
        int diff;

        big = (num1 > num2) ? num1 : num2;
        System.out.println("큰수" + big);

        //if문으로 하면

        if (num1 > num2) {
            System.out.println("큰수" + num1);
        } else {
            System.out.println("큰수" + num2);
        }
        //num3 num4 의 차이의 절대값을 구하는 프로그램을 짜시오

        big = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        System.out.println(big);


        if ((num1 - num2) > 0) {
            System.out.println(num1 - num2);
        } else {
            System.out.println(num2 - num1);
        }

        //////////////////////////////////////////////////////////////////////

        //switch문의 기본구성
        //char도 상관없이 들어감

        int n = 65;


        switch (n) {
            case 'A':
                System.out.println("Simple Java");
            case 2:
                System.out.println("Funny Java");
                break;
            case 3:
                System.out.println("Fantastic Java");
            default:
                System.out.println("The Best Programming language");

        }
        System.out.println("Do you like Java?");
        //switch
        // break 를 걸어야 case값이 할당되었을때 빠져나올수 있다. 걸어서 하늘까지() - 걸리면 break 까지
        //문자열도 사용할수 있다.
        //컴파일될때 65,에이 값이 아스키코드로 변환

        ///////////////////////////////////////////////////////

        //for, while , do~ while
        //반복문

        int num = 0;
        while (num < 5) {
            System.out.println("I like Javaa " + num);
            num++;
        }

        num = 0;

        do {
            System.out.println("I like Java " + num);
            num++;
        } while (num < 5);

        num = 0;

        for (num = 0; num < 5; num++) {
            System.out.println("I love Javva" + num);
        }

        //1~100까지 다 더하기

        int p = 0;
        for (int o = 1; o <= 100; o++) {
            p = p + o;
            System.out.println(p);
        }


        //break와 continue   스위치에서는 break 반복문에서는 continue

        int num5 = 1;
        boolean search = false;

        //처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
        while (num5 < 100) {
            if (((num5 % 5) == 0) && ((num5 % 7) == 0)) {
                search = true;
                break;
            }
            num5++;
        }
        if (search)
            System.out.println("찾는 정수 : " + num5);
        else {
            System.out.println("5의 배수이자 7의 배수를 찾지 못했습니다.");
        }
        search = false;


        ///////////////////////////////////////////////////////

        num5 = 1;
        int count = 0;
        while (num5 < 100) {
            if (((num5 % 5) == 0) && (num5 % 7) == 0) {
                search = true;
                System.out.println(num5);
                count++;
            }
            num5++;
        }
        System.out.println("count : " + count);


//        while((num++) < 100){
//            if(((num % 5) != 0) || ((num % 7) != 0))
//                continue;  //5와 7의 배수 아니라면 나머지 건너띄고 위로 이동
//            count++; // 5,7의 배수인 경우만 실행
//            System.out.println(num); //5,7의 배수인 경우만 실행
//        }
//        System.out.println("count: " + count);

        ////////////////////////////////////////////
        //무한루프//
//        for(;;){
//            System.out.println("Hello world");
//        }
        num = 1;
        while (true) {
            if (((num % 6) == 0) && ((num % 14) == 0))
                break;
            num++;
        }
        System.out.println(num);

        //2중 for문을 제일 많이 씀


        //////////////////////////////////////////////////////////////////
        //99단
        int k;
        int j;
        for (k = 1; k < 10; k++) {
            for (j = 1; j < 10; j++)
                System.out.println(k + " X " + j + "  = " + (k * j));
            System.out.println(" ");
        }
        //for 문할때 i,j,k i>j>l
        // 짝수단만

        for (k = 1; k < 10; k++) {
            if (k % 3 == 0)

                for (j = 1; j <= 9; j++) {
                    System.out.println(k + " X " + j + "  = " + (k * j));
                }

        }
        int i;
        for (i = 1; i <= 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
//        println = 콘솔에 찍고 나서 다음줄에 쓴다 3333+\n
//
//        print = 띄어쓰기 하지 않고 바로 씀 3333
    }
}


//값 0.0
//정수끼리 연산하게 되면 0.75이지만 형변환 원칙에 의해
//0이 리턴 그뒤 double로 인해 0.0으로 변환
// -  명시적 형변환으로 (double)을 붙임  - a / (double)b ,
//  (double) (a/b);은 안됨. 계산이 먼저 행해짐
//0.75가 나오게 하기 위해서는 int를 double로 계산하게끔 바꿈


//:3.0000001999999997
//이유는 실수 표현에 오차가 존재하기 때문
//컴퓨터의 오차가 있는 이유
//소숫점 즉 실수는 무한대
//하지만 메모리는 한도가 있어서

//2100000000 + 2100000000 하면 값이 이상함
//1. 컴파일러가 구려서
//2.스택오브스테일러

//아스키코드
