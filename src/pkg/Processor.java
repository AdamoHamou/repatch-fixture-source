package pkg;

public class Processor {

    public void process(int value) {
        int doubled = value * 2;
        System.out.println(value + ":" + doubled);
    }

    public String tag() {
        return "base";
    }
}
