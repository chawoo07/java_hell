public class Sumnum {
    int num = 0;
    int i = 0;
    Sumnum(){}

    public Sumnum(int num){
        this.num = num;
    }

    public void show(){
        int  sum = 0;
        for( i = 0; i <= num; i++){
            sum += i;
        }
        System.out.println("1부터 "+num+"까지의 합은"+sum);
    }
}
