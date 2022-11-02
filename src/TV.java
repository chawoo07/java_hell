public class TV {
    //커밋asddasf
    String brand;
    int year;
    int inch;

    public TV(){}

    public TV(String brand, int year, int inch){
        this.brand = brand;
        this.year = year;
        this.inch = inch;

    }

    public void show(){
        System.out.println(brand+"의 " +year+"년형 "+inch+"인치 티비");
    }
}
