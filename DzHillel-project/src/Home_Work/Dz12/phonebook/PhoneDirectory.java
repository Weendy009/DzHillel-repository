package Home_Work.Dz12.phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneDirectory {
    private List<Record> records;

    public void add(Record... recordsInput) {
        if (records == null) {
            records = new ArrayList<>();
        }
        records.addAll(Arrays.asList(recordsInput));
    }

    public Record find(String nameInput) {
        for (Record record : records) {
            if (record.getName().equals(nameInput)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String nameInput) {
        List<Record> records = new ArrayList<>();

        for (Record record : this.records) {
            if (record.getName().equals(nameInput)) {
                records.add(record);
            }
        }
        return records;
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "records=" + records +
                '}';
    }
}
