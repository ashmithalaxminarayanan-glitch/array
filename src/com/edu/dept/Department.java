package com.edu.dept;

import com.edu.college.College;

public class Department {

    static class Department extends College {
        Department(){
            System.out.println("AI&DS Have opened");
        }
        @Override
        public void close() throws Exception {
            System.out.println("AI&DS Has Closed");
        }
    }


}


