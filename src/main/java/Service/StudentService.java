package Service;

import Domain.Student;
import Repository.StudentRepository;

import java.util.ArrayList;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student findOne(Integer id) {
        return studentRepository.findOne(id);
    }

    public ArrayList<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student update(Student student) {
        return studentRepository.update(student);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student delete(Integer id) {
        return studentRepository.delete(id);
    }

}
