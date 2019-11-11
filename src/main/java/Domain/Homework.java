package Domain;

import java.util.Objects;

public class Homework extends Entity<Integer> {
    private String description;
    private Integer startWeek;
    private Integer deadlineWeek;

    public Homework(Integer id, String description, Integer startWeek, Integer deadlineWeek) {
        super(id);
        this.description = description;
        this.startWeek = startWeek;
        this.deadlineWeek = deadlineWeek;
    }

    public Homework(Homework homework) {
        super(homework);
        description = homework.description;
        startWeek = homework.startWeek;
        deadlineWeek = homework.deadlineWeek;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getDeadlineWeek() {
        return deadlineWeek;
    }

    public void setDeadlineWeek(Integer deadlineWeek) {
        this.deadlineWeek = deadlineWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework homework = (Homework) o;
        return getDescription().equals(homework.getDescription()) &&
                getStartWeek().equals(homework.getStartWeek()) &&
                getDeadlineWeek().equals(homework.getDeadlineWeek());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getStartWeek(), getDeadlineWeek());
    }

    @Override
    public String toString() {
        return "Homework{" +
                super.toString() +
                ", description='" + description + '\'' +
                ", startWeek=" + startWeek +
                ", deadlineWeek=" + deadlineWeek +
                '}';
    }
}
