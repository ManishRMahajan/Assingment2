package kratin.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kratin.project.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom queries or methods if needed
}