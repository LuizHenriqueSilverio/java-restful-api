package luiz.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luiz.dio.domain.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public boolean existsByAccountNumber(String accountNumber);
}
