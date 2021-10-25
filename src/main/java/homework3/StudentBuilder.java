package homework3;

public class StudentBuilder {
    private Student student;

    public StudentBuilder(){
        this.student = new Student();
    }

    public StudentBuilder addFirstName(String firstName){
        student.setFirstName(firstName);
        return this;
    }

    public StudentBuilder addLastName(String lastName){
        student.setLastName(lastName);
        return this;
    }

    public StudentBuilder addAddress(String address){
        student.setAddress(address);
        return this;
    }
    public Student build(){
        return student;
    }
}
