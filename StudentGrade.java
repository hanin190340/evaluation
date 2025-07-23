import java.util.Arrays;
public class StudentGrade { public static void main(String[] args) {
    String[] students = {"Nasser", "Haitham", "Manal", "Hanin"};
    int[] scores = {95, 67, 45, 78};

    System.out.println( "Names " + Arrays.toString(students));
    for (int i = 0; i < students.length; i++) {
        String n = students[i];
        String reversedName = reverseString(n);
        students[i] = reversedName; // Store the reversed name back in the array
    }
    System.out.println("Reversed Names : " + Arrays.toString(students));
    char[] Grades = new char[scores.length];
    for (int i = 0; i < scores.length; i++) {
        Grades[i] = getLetterGrade(scores[i]);
    }
    System.out.println("Letter Grades: " + Arrays.toString(Grades));
    String[] failingStudents = findFailingStudents(students, scores);
    System.out.println("Failing Students: " + Arrays.toString(failingStudents));
}
    public static String reverseString(String n) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = n.length() - 1; i >= 0; i--) {
            reversedString.append(n.charAt(i));
        }
        return reversedString.toString(); // Return the reversed string
    }
    public static char getLetterGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 61 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static String[] findFailingStudents(String[] names, int[] scores) {
        String[] failingStudents = new String[names.length];
        int count = 0; // To keep track of failing students

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failingStudents[count] = names[i];
                count++;
            }
        }
        return Arrays.copyOf(failingStudents, count);
    }
}



