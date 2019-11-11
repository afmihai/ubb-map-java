package Validator;

import Domain.Student;

public class StudentValidator extends EntityValidator {
    @Override
    public void validate(Object entity) throws ValidationException {
        super.validate(entity);
        if (!(entity instanceof Student)) {
            throw new ValidationException("entity not instance of Student");
        }
        Student student = (Student) entity;
        // validate group
        if (student.getGroup() == null
                || student.getGroup() < 0) {
            throw new ValidationException("group is invalid (null or negative)");
        }
        // validate first name
        if (student.getFirstName() == null
                || !student.getFirstName().matches("^[A-Z][a-z]*")) {
            throw new ValidationException("firstName is invalid (null or malformed)");
        }

        // validate last name
        if (student.getLastName() == null
                || !student.getLastName().matches("^[A-Z][a-z]*")) {
            throw new ValidationException("lastName is invalid (null or malformed)");
        }

        // validate email
        if (student.getEmail() == null
                || !student.getEmail().matches("^\\w+@\\w+\\.\\w+$")) {
            throw new ValidationException("email is invalid (null or malformed)");
        }
        // validate teacher name
        if (student.getTeacher() == null
                || !student.getTeacher().matches("^[A-Z][a-z]*")) {
            throw new ValidationException("teacher is invalid (null or malformed)");
        }
    }
}
