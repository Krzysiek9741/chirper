package pl.kf.chirper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.kf.chirper.authentication.UserDetailsImpl;
import pl.kf.chirper.model.user.User;
import pl.kf.chirper.repository.UserRepository;

import java.util.Date;

@Service
public class UserService implements UserDetailsService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new UserDetailsImpl(userRepository.findUserByEmail(s));
    }

    public void createNewUser(User user){

        user.addNewRole("USER");
        user.setCreationDate(new Date());
        userRepository.save(user);
    }
}
