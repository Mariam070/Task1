public class Car {
    private String model;
    private int year;
    private int max_speed;
    private String color;

    public Car() {
    }

    public Car(String model, int year, int max_speed, String color) {
        this.model = model;
        this.year = year;
        this.max_speed = max_speed;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getFuelType(){
        return getFuelType();
    };


    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMax_speed() {
        return this.max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
    public String getColor() {
        return this.color;
    }

    public void setColor(String name) {
        this.color = name;
    }
}
