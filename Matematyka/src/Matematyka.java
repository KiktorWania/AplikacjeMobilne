import java.util.Arrays;

public class Matematyka {

    private double max, min;
    public Get get;

    public Matematyka(){
        get = new Get();
    }

    public int suma(int... liczby){
        max = Arrays.stream(liczby).max().getAsInt();
        min = Arrays.stream(liczby).min().getAsInt();
        return Arrays.stream(liczby).sum();
    }

    public double suma(double... liczby) {
        max = Arrays.stream(liczby).max().getAsDouble();
        min = Arrays.stream(liczby).min().getAsDouble();
        return Arrays.stream(liczby).sum();
    }

    class Get{
        public double max(){
            return max;
        }

        public double min(){
            return min;
        }
    }
}
