package org.gl.studentmanagement.repository;

import org.gl.studentmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{
@Query ("SELECT u FROM User u WHERE u.userName = ?1")
	public User getUserByUserName(String userName);
}
