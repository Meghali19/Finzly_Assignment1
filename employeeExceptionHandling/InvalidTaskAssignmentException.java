package employeeExceptionHandling;

public class InvalidTaskAssignmentException extends Exception {
    public InvalidTaskAssignmentException(String message) {
        super(message);
    }

}
