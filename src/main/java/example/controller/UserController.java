package example.controller;

import example.entity.User;
import example.repository.UserRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

@Controller("/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Get()
    public HttpResponse getUser(@QueryValue Long id) {
        User user = userRepository.findUserById(id);
        return HttpResponse.ok(user);
    }
}
