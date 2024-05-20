public class gradeDB {
    int[][] gradesTable = {
            { 90, 80, 70 },
            { 85, 75, 65 },
            { 80, 70, 60 },
            { 75, 65, 55 },
            { 70, 60, 50 },
            { 65, 55, 45 },
            { 60, 50, 40 },
            { 55, 45, 35 },
            { 50, 40, 30 },
            { 45, 35, 25 }
    };

    int min(int x, int y) {
        return (x < y) ? x : y;
    }

    int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public void printGrade() {
        int lowest = 100, higest = 0;
        System.out.printf("%12sTest 1 Test 2 Test 3 Average", "");
        for (int i = 0; i < gradesTable.length; i++) {
            System.out.printf("\nStudent %3d ", i + 1);
            for (int j = 0; j < gradesTable[i].length; j++) {
                System.out.printf("%6d ", gradesTable[i][j]);
                lowest = min(lowest, gradesTable[i][j]);
                higest = max(higest, gradesTable[i][j]);
            }
            float average = (gradesTable[i][0] + gradesTable[i][1] + gradesTable[i][2]) / 3;
            System.out.printf("%7.2f", average);
            System.out.println();
        }
        System.out.printf("\nLowest grade in the grade book is: %d\n", lowest);
        System.out.printf("Highest grade inthe grade book is: %d\n", higest);

    }

    public void gradeDistribtion() {
        int[] distribution = new int[11];
        for (int i = 0; i < gradesTable.length; i++) {
            for (int j = 0; j < gradesTable[i].length; j++) {
                int grade = gradesTable[i][j];
                if (grade == 100) {
                    distribution[10]++;
                } else {
                    distribution[grade / 10]++;
                }
            }
        }
        System.out.println("\nOverall Grade distribution:");

        for (int i = 0; i < distribution.length - 1; i++) {
            System.out.printf("%2d - %2d: ", i * 10, i * 10 + 9);
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.printf("%5d:", 100);
        for (int j = 0; j < distribution[10]; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
