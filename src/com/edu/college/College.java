package com.edu.college;

public class College {
    static class College implements AutoClose{
        college(){
            System.out.println("college Opens");
        }
        @Override
        public void close() throws Exception {
            System.out.println("College Closed");
        }
    }


}



