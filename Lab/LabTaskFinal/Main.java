public class Main {
    public static void main(String[] args) {

        School school = new School(3); 

        school.addStudent(new Student("Rahim",
                new Contact("01711", "r@mail.com")));

        school.addStudent(new Student("Karim",
                new Contact("01822", "k@mail.com")));

        school.addStudent(new Student("Jamal",
                new Contact("01933", "j@mail.com")));

        school.show(); 
}
}