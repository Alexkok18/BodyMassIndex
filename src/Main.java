public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double result = service.calculate(90, 1.75);
        System.out.println("Индекс массы тела равен " + result + " кг/м2");
    }
}