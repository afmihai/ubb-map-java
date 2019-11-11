package Repository;

import Domain.Homework;
import Validator.Validator;

import java.util.ArrayList;

public class HomeworkRepository implements CrudRepository<Integer, Homework> {
    private ArrayList<Homework> list = new ArrayList<>();
    private Validator<Homework> validator;

    public HomeworkRepository(Validator<Homework> validator) {
        this.validator = validator;
    }

    public Homework findOne(Integer id) {
        for (Homework hw : list) {
            if (hw.getId().equals(id))
                return hw;
        }
        return null;
    }

    public ArrayList<Homework> findAll() {
        return list;
    }

    public Homework update(Homework homework) {
        validator.validate(homework);

        int index = -1;
        for (Homework hw : list) {
            if (hw.getId().equals(homework.getId()))
                index = list.indexOf(hw);
            list.set(index, homework);
        }
        return null;
    }

    public Homework save(Homework homework) {
        validator.validate(homework);
        if (list.add(homework))
            return homework;
        return null;
    }

    public Homework delete(Integer id) {
        Homework toDelete = findOne(id);
        if (list.remove(toDelete))
            return toDelete;
        return null;
    }
}
