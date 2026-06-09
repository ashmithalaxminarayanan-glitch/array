 void main(){
     int n = 5;
    //row loop
    for(int row = 1; row <= n; row++) {
        //column loop
        for (int column = 1; column <= row; column++){
            System.out.print(column);
        }
        System.out.println();
     }
}

