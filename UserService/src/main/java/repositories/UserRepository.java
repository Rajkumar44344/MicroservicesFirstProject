package repositories;

import org.springframework.data.jpa.repository.JpaRepository; // Correct import for JpaRepository
import org.springframework.stereotype.Repository;
import entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // JpaRepository provides built-in methods like findById, save, delete, etc.
}
