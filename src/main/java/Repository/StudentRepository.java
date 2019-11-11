package Repository;

import Domain.Student;
import Validator.Validator;

import java.util.ArrayList;

public class StudentRepository implements CrudRepository<Integer, Student> {
    private ArrayList<Student> list = new ArrayList<>();
    private Validator<Student> validator;

    public StudentRepository(Validator<Student> validator) {
        this.validator = validator;
    }

    public Student findOne(Integer id) {
        for (Student stud : list) {
            if (stud.getId().equals(id))
                return stud;
        }
        return null;
    }

    public ArrayList<Student> findAll() {
        return list;
    }

    public Student update(Student student) {
        validator.validate(student);

        int index = -1;
        for (Student stud : list) {
            if (stud.getId().equals(student.getId()))
                index = list.indexOf(stud);
                list.set(index, student);
        }
        return null;
    }

    public Student save(Student student) {
        validator.validate(student);
        if (list.add(student))
            return student;
        return null;
    }

    public Student delete(Integer id) {
        Student toDelete = findOne(id);
        if (list.remove(toDelete))
            return toDelete;
        return null;
    }
}
