public class StudentController {
    private StudentModel model;
    private StudentView view;
    
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Methods to control model object
    public void setStudentName(String name) {
        model.setStudentName(name);
    }

    public String getStudentName() {
        return model.getStudentName();
    }

    public void setIndexNumber(String indexNumber) {
        model.setIndexNumber(indexNumber);
    }

    public String getIndexNumber() {
        return model.getIndexNumber();
    }

    public void setAge(int age) {
        model.setAge(age);
    }

    public int getAge() {
        return model.getAge();
    }
    
    // Methods to control view object
    public void updateView() {
        view.printStudentDetails(model.getStudentName(), model.getIndexNumber(), model.getAge());
    }

}
