package Home_Work.Dz12.phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        addsPhoneDirectory(phoneDirectory);

        Record record = phoneDirectory.find("Donald");
        System.out.println(record);

        List<Record> records = phoneDirectory.findAll("Matvey");
        System.out.println(records);

    }

    private static void addsPhoneDirectory(PhoneDirectory phoneDirectory) {
        phoneDirectory.add(new Record("Matvey", "+3809977"));
        phoneDirectory.add(new Record("Matvey", "+3809977"));
        phoneDirectory.add(new Record("Matvey", "+3803455"));
        phoneDirectory.add(new Record("Donald", "+3806900"));
        phoneDirectory.add(new Record("Alexandr", "+3807351"));
        phoneDirectory.add(new Record("Inna", "+3804117"));
    }

}
