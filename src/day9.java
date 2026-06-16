public class day9 {
    static class college implements AutoCloseable {
        college() {
            System.out.println("college");
        }

        @Override
        public void close() throws Exception {
            System.out.println("college close");
        }
    }

    static class dept extends college {
        dept() {
            System.out.println("dept");
        }

        @Override
        public void close() throws Exception {
            System.out.println("dept close");
            super.close();
        }

        static class year extends college {
            year() {
                System.out.println("year");
            }

            @Override
            public void close() throws Exception {
                System.out.println("year");
                super.close();
            }
        }

        static void main() throws Exception {
            try (year year = new year()) {

            }
        }
    }
}
