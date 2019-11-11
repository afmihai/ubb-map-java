package Validator;

import Domain.Entity;

public class EntityValidator implements Validator {

    @Override
    public void validate(Object entity) throws ValidationException {
        if (!(entity instanceof Entity)) {
            throw new ValidationException("entity not instance of Entity");
        }
        Entity myEntity = (Entity) entity;
        // validate id
        if (myEntity.getId() == null
                || (int) myEntity.getId() < 0) {
            throw new ValidationException("id is invalid (null or negative)");
        }
    }
}