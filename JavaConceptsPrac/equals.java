package JavaConceptsPrac;

public class equals{
    static class Student {
        private String name;
        private int rollNumber;

        public Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        public String getName() {
            return name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!(obj instanceof Student)) return false;
            if (obj == this) return true;
            return this.rollNumber == ((Student) obj).getRollNumber();
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
        }
    }

    public static void main(String[] args) {
        Student dinesh = new Student("Dinesh", 1);
        Student ayush = new Student("Ayush", 1);
        System.out.println("Result:  " + dinesh.equals(ayush));
    }
}