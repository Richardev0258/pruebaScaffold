package co.com.bancolombia.usecase.user;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserUseCase {

    private final UserRepository userRepository;

    public void saveUser(User user){
        userRepository.saveUser(user);
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public User getUserByIdNumber(Long idNumber){
        return userRepository.getUserByIdNumber(idNumber);
    }

    public User editUser(User user){
        return userRepository.editUser(user);
    }

    public void deleteUser(Long idNumber){
        userRepository.deleteUser(idNumber);
    }
}
