public class Car {
    private String mark;
    private int year;

    public Car(String mark, int year) {
        this.mark = mark;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car" + "mark='" + mark + ", year=" + year + ";";
    }
}
