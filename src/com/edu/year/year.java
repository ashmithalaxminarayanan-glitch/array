package com.edu.year;

public class year {

    static class Year extends Department{
        Department(){
            System.out.println("I-Year Have opened");
        }
        @Override
        public void close() throws Exception {
            System.out.println("I-Year Has Closed");
        }
    }

}



