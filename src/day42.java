void main(){
    int[][] attendance={
            {0,1,0},
            {1,0,0},
            {1,1,1},
            {1,0,1},
            {0,0,0},
    };
    for (int row = 0; row < attendance.length;row++){
        System.out.println("Student "+(row+1)+":");
        for(int col =0; col < attendance[row].length; col++) {
            if (attendance[row][col] == 1) {
                System.out.println("Class" + (col + 1) + ": Present");
            } else {
                System.out.println("Class" + (col + 1) + ": Absent");
            }
        }
            System.out.println();

    }
}