package now.homework.hw1;

public class Application {
    private int number;
    private int data;
    private Type type;

    public Application() {

    }

    public Application(int number, int data, Type type) {
        this.number = number;
        this.data = data;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void writeAStatement() {
        System.out.println("Application" + "Number: " + number +
                " " + data + type);
    }

    @Override
    public String toString() {
        return "Application{" +
                "number=" + number +
                ", data=" + data +
                ", type=" + type +
                '}';
    }
}

