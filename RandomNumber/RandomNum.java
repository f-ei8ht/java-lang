package RandomNumber;

public class RandomNum {
    public static int randomNum(int min, int max) throws ValueException {
        if (max < min || max == min)
            throw new ValueException("Max should be greater than Min, and they should not be equal.");
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
