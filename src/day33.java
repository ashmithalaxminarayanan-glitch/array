void main() {
        int[] marks = {87, 32, 44, 89, 23};
    System.out.print("Pass mark: ");
    for (int i = 0; i< marks.length; i++) {
        if (marks[i] >= 40) {
            System.out.print(marks[i]+ ", ");
        }
    }
    System.out.println();

    System.out.print("Fail mark: ");
    for (int i = 0;i<marks.length;i++) {
        if(marks[i] < 40) {
            System.out.print(marks[i]+ ", ");
        }
    }
}