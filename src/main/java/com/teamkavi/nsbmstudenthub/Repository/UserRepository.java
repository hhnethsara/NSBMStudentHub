package com.teamkavi.nsbmstudenthub.Repository;




import com.teamkavi.nsbmstudenthub.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

