package samouczekProgramisty;

public class MyNumber {
    int number;

    public MyNumber(int number) {
        this.number = number;
    }
    public boolean isOdd(){
        if (number%2==1) return true;
        else return false;
    }
    public boolean isEven(){
        if (number%2==0) return true;
        else return false;
    }
    public double sqrt(){
        return Math.sqrt(number);
    }
}
