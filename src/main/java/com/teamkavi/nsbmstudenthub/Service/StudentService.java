package com.teamkavi.nsbmstudenthub.Service;



import com.teamkavi.nsbmstudenthub.Model.Student;
import com.teamkavi.nsbmstudenthub.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // This method specifically handles Task 5 (Pagination/Sorting)
    public Page<Student> getStudentsWithPagination(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
