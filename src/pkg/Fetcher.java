package pkg;

public class Fetcher {

    private int records;

    public void pollRecords() {
        records = records + 1;
        System.out.println("polling " + records + " records");
        if (records > 10) {
            records = 0;
        }
    }

    public void reset() {
        records = 0;
    }
}
