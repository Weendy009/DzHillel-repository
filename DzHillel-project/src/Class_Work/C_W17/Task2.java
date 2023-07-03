package Class_Work.C_W17;

public class Task2 {
    public static void main(String[] args) {
        String[] strings = {"9751302862F0693", "3888560693F7262", "5485983835F0649",
                            "2580974299F6042", "9976672161M6561",
                            "0234451011F8013", "4294552179O6482"};
        System.out.println(countSeniors(strings));
    }
    public static int countSeniors(String[] details) {
        int result = 0;
        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                result++;
            }
        }
        return result;
    }
}
