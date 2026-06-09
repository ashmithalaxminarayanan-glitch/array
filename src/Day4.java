void main(){
    //int[] marks = new int[5];
    int[][] marks = new int[5][3];
    int[][] studentmarks ={
            {78,90,34},
            {89,65,89},
            {12,34,56},
            {66,12,89},
            {33,77,88},
    };
    for (int row =0; row < studentmarks.length; row++){
        // 0{78,90,34},
        // 1{89,65,89},
        // 2{12,34,56},
        // 3{66,12,89},
        // 4{33,77,88},
        for (int col =0; col < studentmarks[row].length; col++){
            System.out.print(studentmarks[row][col] + " ");
        }
        System.out.println();
    }
}
