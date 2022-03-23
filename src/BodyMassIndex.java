public class BodyMassIndex {

    public double calculate(double weight, double growth) {

        double index = growth * growth ;
        double result = weight / index ;
        return result;

    }
}

