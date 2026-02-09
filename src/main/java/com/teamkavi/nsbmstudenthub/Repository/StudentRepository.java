package com.teamkavi.nsbmstudenthub.Repository;



import com.teamkavi.nsbmstudenthub.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository already includes PagingAndSortingRepository!
}