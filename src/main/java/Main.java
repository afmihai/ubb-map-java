import Repository.HomeworkRepository;
import Repository.StudentRepository;
import Validator.HomeworkValidator;
import Validator.StudentValidator;
import jdk.vm.ci.meta.Local;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
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

        String input = "20200224";
        String format = "yyyyMMdd";

        SimpleDateFormat df = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = df.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println(week);
    }
}
