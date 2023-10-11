package wbsantiago.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/users")
public class userController {
    
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
    public void create(@RequestBody UserModel UserModel) {
        System.out.println(UserModel.getUsername());
    }

}