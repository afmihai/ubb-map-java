import Repository.HomeworkRepository;
import Repository.StudentRepository;
import Validator.HomeworkValidator;
import Validator.StudentValidator;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentValidator studentValidator = new StudentValidator();
        HomeworkValidator homeworkValidator = new HomeworkValidator();

        StudentRepository studentRepository = new StudentRepository(studentValidator);
        HomeworkRepository homeworkRepository = new HomeworkRepository(homeworkValidator);

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println("Introdu: ");
//        System.out.println("You entered integer " + a);

        Calendar cal = Calendar.getInstance();
        LocalDateTime time = new LocalDateTime();

        Date date = new Date("01-10-2019");
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
    }
}
