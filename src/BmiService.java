public class BmiService {
    public int calculate(double height, double weigt) {
    double bmi = weigt / (height * height);
    return (int) bmi;
    }
}
