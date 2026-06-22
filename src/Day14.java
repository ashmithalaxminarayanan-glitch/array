
public class Day14 {
    static class Student {
        String name;
        String dept;
        int age;

        Student(Builder builder) {
            this.name = builder.name;
            this.dept = builder.dept;
            this.age = builder.age;
        }

        static class Builder {
            private String name;
            private int age;
            private String dept;

            public Builder name(String namevalue) {
                this.name = namevalue;
                return this;
            }

            public Builder dept(String deptvalue) {
                this.dept = deptvalue;
                return this;
            }

            public Builder age(int agevalue) {
                this.age = agevalue;
                return this;
            }
        public Student build(){
                return new Student(this);
        }
        }
    }

        static void main() {
            Student student = new Student.Builder()
                    .name("Ashmitha")
                    .dept("AI&DS")
                    .age(18)
                    .build();
            System.out.println(student.name);

        }
    }
