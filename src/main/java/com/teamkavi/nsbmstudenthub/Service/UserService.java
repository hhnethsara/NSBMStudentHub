package com.teamkavi.nsbmstudenthub.Service;



import com.teamkavi.nsbmstudenthub.Model.User;
import com.teamkavi.nsbmstudenthub.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User registerUser(User user) {
        // Task 7: Encrypting the password before saving
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }
}
