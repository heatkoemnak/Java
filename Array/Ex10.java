
class Ex10 {

    public static void main(String[] args) {

        int[][][] arr = { { { 50, 30, 70 }, { 60, 40, 80 }, { 70, 50, 90 }, { 80, 60, 100 } },
                { { 55, 35, 75 }, { 65, 45, 85 }, { 75, 55, 95 }, { 85, 65, 90 } } };
        String[] subject = { "Name   ", "        Maths", "     Physic", "   Chemistry", "     Total" };

        System.out.println("Group:1");

        int rows = arr.length;
        int col = arr[0].length;
        int cols = arr[0][0].length;

        for (int i = 0; i < rows; i++) {

            System.out.println();
            System.out.println("____________________________________________________________________");
            System.out.println();

            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + "\t");
            }
            System.out.println();
            System.out.println("____________________________________________________________________");
            System.out.println();
            for (int j = 0; j < col; j++) {
                int sumcols = 0;

                System.out.print("Student" + (j + 1));
                for (int k = 0; k < cols; k++) {
                    sumcols = sumcols + arr[i][j][k];

                    System.out.print("      \t" + arr[i][j][k]);

                }
                System.out.println("      \t" + sumcols);

            }

            System.out.println();
            System.out.println("Group:2");
        }

    }
}
