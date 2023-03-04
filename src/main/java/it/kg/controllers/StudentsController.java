package it.kg.controllers;

import it.kg.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentsController {

    private static List<Student> students;

    static {
        students = new ArrayList<>();

        students.add(new Student(1, "Elmirbek", 45));
        students.add(new Student(2, "Zhanarbek", 27));
        students.add(new Student(3, "Ariet", 12));
        students.add(new Student(4, "Aktan", 35));
        students.add(new Student(5, "Beks", 5));
    }

    //get by id
    @GetMapping("/get/by/{id}")
    public static String getById(Model model, @PathVariable int id) {
        for (Student value : students) {
            if (value.getId() == id) {
                model.addAttribute("student", value);
                break;
            }
        }
        return "find";
    }

    //find all
    @GetMapping("/")
    public String findAllStudents(Model model) {
        model.addAttribute("all", students);
        return "show-students";
    }

    @PostMapping("/saveStudent")
    private String saveStudent(@RequestParam("name") String name, @RequestParam("age") int age) {
        Student student = new Student();
        student.setId(students.size() + 1);
        student.setName(name);
        student.setAge(age);
        students.add(student);
        return "redirect:/";
    }

    @GetMapping("/studentForm")
    public String saveStudentPage() {
        return "student-save";
    }

    //delete by id
    @GetMapping("/deleteStudent/{id}")
    public String deleteById(@PathVariable int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
        return "redirect:/";
    }
}
