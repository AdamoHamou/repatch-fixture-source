package pkg;

public class Processor {

    public void process(int record) {
        int doubled = record * 2;
        System.out.println(record + ":" + doubled);
    }

    public String tag() {
        return "source-pr";
    }
}
