package Validator;

import Domain.Homework;

public class HomeworkValidator extends EntityValidator {
    @Override
    public void validate(Object entity) throws ValidationException {
        super.validate(entity);
        if (!(entity instanceof Homework)) {
            throw new ValidationException("entity not instance of Homework");
        }
        Homework homework = (Homework) entity;
        // validate deadline week
        if (homework.getDeadlineWeek() == null
                || homework.getDeadlineWeek() < 1
                || homework.getDeadlineWeek() > 14) {
            throw new ValidationException("deadlineWeek is invalid (null or not between 1-14)");
        }
        // validate assignment week
        if (homework.getStartWeek() == null
                || homework.getStartWeek() < 1
                || homework.getStartWeek() > homework.getDeadlineWeek()) {
            throw new ValidationException("startWeek is invalid (null or not between 1-deadlineWeek)");
        }
        // validate description
        if (homework.getDescription() == null
                || homework.getDescription().length() == 0) {
            throw new ValidationException("description is invalid (null or empty)");
        }
    }
}
