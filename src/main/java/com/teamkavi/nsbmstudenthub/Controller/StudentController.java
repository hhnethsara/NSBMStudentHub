package com.teamkavi.nsbmstudenthub.Controller;



import com.teamkavi.nsbmstudenthub.Model.Student;
import com.teamkavi.nsbmstudenthub.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Task 4: Basic Create Operation
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // Task 5: Pagination and Sorting
    @GetMapping
    public Page<Student> getAllStudents(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return studentService.getStudentsWithPagination(pageable);
    }
}
