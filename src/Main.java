import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        printBonusDatesBetween(2010, 2015);

    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {

        LocalDate operatingDate = LocalDate.of(fromYear, 1, 1);

        while (operatingDate.getYear() != toYear) {

            String dateInString = operatingDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

            if (dateInString.equals(reverseStringDate(dateInString))) {
                System.out.println(operatingDate);
            }

            operatingDate = operatingDate.plusDays(1);
        }
    }

    public static String reverseStringDate(String dateInString) {

        StringBuilder reverseDate = new StringBuilder();

        for (int i = dateInString.length() - 1; i >= 0; i--) {
            reverseDate.append(dateInString.charAt(i));
        }

        return reverseDate.toString();
    }
}