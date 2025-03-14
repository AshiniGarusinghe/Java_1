public class Main {
    public static void main(String[] args) {
        // Create model object
        StudentModel model = getStudentDataFromDatabase();
        // Create view object
        StudentView view = new StudentView();
        // Create controller object
        StudentController controller = new StudentController(model, view);
        // Print model object's data
        controller.updateView();
    }

    private static StudentModel getStudentDataFromDatabase() {
        StudentModel model = new StudentModel();
        model.setStudentName("John");
        model.setIndexNumber("123456");
        model.setAge(20);
        return model;
    } 
}
