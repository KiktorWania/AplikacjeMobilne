public class MyNumber {
    private int number;
    public MyNumber(int number){
        this.number = number;
    }

    public boolean isOdd(){
        return !isEven();
    }

    public boolean isEven(){
        return number % 2 == 0;
    }

    double sqrt(){
        return Math.sqrt(number);
    }

    double pow(MyNumber x){
        return Math.pow(number, x.number);
    }

    MyNumber add(MyNumber x){
        return new MyNumber(number + x.number);
    }

    MyNumber substract(MyNumber x){
        return new MyNumber(number - x.number);
    }


}
