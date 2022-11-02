public class Grade {
    int math = 0;
    int science = 0;
    int english = 0;
    private final int COUNT = 3;
    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }


    public double average() {
      return ((double) (math + science + english)) / COUNT;
    }

    public String getGrade() {
        double avg = average();
        if (avg >= 90){
            return "수.";
        } else if (avg >= 80) {
            return "우.";
        } else if (avg >= 70) {
            return "미.";
        } else if (avg >= 60) {
            return "양.";
        }  else {
            return "가.";
        }
    }
}
