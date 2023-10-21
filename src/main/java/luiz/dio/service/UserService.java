package luiz.dio.service;

import luiz.dio.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User userToCreate);
}
