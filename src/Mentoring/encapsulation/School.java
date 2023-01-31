package Mentoring.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Course> courses = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public School(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    // --------------------------------- Getter - Setter --------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
