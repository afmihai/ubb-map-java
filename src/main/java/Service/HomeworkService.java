package Service;

import Domain.Homework;
import Repository.HomeworkRepository;

import java.util.ArrayList;

public class HomeworkService {
    private HomeworkRepository homeworkRepository;

    public HomeworkService(HomeworkRepository homeworkRepository) {
        this.homeworkRepository = homeworkRepository;
    }

    public Homework findOne(Integer id) {
        return homeworkRepository.findOne(id);
    }

    public ArrayList<Homework> findAll() {
        return homeworkRepository.findAll();
    }

    public Homework update(Homework homework) {
        return homeworkRepository.update(homework);
    }

    public Homework save(Homework homework) {
        return homeworkRepository.save(homework);
    }

    public Homework delete(Integer id) {
        return homeworkRepository.delete(id);
    }

}
