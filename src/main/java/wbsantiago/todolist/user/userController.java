package wbsantiago.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/users")
public class userController {
    
    @Autowired
    private IUserRepository userRepository;

    /**
    * String (texto)
    * Integer (int) numeros inteiros
    * Double (double) nuimeros 0.0000
    * FLoat (float) numeros 0.000
    * char ( A C )
    * Date (data)
    * void
    */

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel UserModel) {
        var userCreated = this.userRepository.save(UserModel);
        return userCreated;
    }

}