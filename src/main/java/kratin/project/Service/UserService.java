package kratin.project.Service;

import org.springframework.stereotype.Service;

import kratin.project.model.User;
import kratin.project.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
		return user;
        // Add logic to create a new user and save it in the repository
    }

    public User getUser(Long userId) {
		return null;
        // Add logic to retrieve a user by ID from the repository
    }

    // Other methods for updating, deleting, and retrieving users
}
