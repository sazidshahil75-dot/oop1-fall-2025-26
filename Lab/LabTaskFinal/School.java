class School {
    Student[] students;
    int count = 0;

    School(int size) {
        students = new Student[size];
    }

    void addStudent(Student s) {
        students[count++] = s;
    }

    void show() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].name + " - "
                + students[i].contact.phone + ", "
                + students[i].contact.email);
        }
    }
}

