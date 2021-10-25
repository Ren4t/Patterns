package homework3;

public class App {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .addFirstName("Max")
                .addLastName("Smart")
                .addAddress("maxsmart@mail.ru")
                .build();
        System.out.println(student);
    }
}
