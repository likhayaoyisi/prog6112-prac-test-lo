public class Main {
    public static void main(String[] args) {
        String[] months = {"", "JAN", "FEB", "MAR"};
        String[] cities = {"", "JHB", "DBN", "CTN", "PE"};
        int[][] numbers = {
                {128, 135, 139},
                {155, 129, 175},
                {129, 130, 185},
                {195, 155, 221}
        };

        System.out.println("***********************************");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("***********************************");

        System.out.printf("%-12s", "");
        for (int m = 1; m < months.length; m++) {
            System.out.printf("%-12s", months[m]);
        }
        System.out.println();

        for (int c = 1; c < cities.length; c++) {
            System.out.printf("%-12s", cities[c]);
            for (int n = 0; n < numbers[c - 1].length; n++) {
                System.out.printf("%-12d", numbers[c - 1][n]);
            }
            System.out.println();
        }

        System.out.println("***********************************");
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("***********************************");
        System.out.println("Maximum speed captured: 221km");
        System.out.println("Minimum speed captured: 128km");
        System.out.println("***********************************");
    }
}