package kyu8;



public class Grasshopper {
    public static void main(String[] args) {
        System.out.println(getGrade(99,22,9));
    }
    public static char getGrade(int s1, int s2, int s3) {
        int result=(s1+s2+s3)/3;
        System.out.println(result);
        if (result>=90){
            return 'A';
        } else if (result<90&&result>=80) {
            return 'B';
        } else if (result<80&&result>=70) {
            return 'C';
        } else if (result<70&&result>=60) {
            return 'D';
        }else
        return 'F';
    }
}
