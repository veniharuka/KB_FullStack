package org.example.controller.user;

import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final String context = "/user";

    // Get /user/login
    @GetMapping("/login")
    public String loginPage(){
        return context + "/login";
    }
    // Post /user/login
    @PostMapping("/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Model model, HttpSession session
                        ){
        User user = userService.findByUsername(username);

        if(user ==null){
            model.addAttribute("errMsg", "해당 id의 사용자가 업습니다.");
            return context + "/login-failed";
        }
        if(!userService.isPasswordValid(user, password)){
            model.addAttribute("errMsg", "비밀번호가 틀립니다.");
            return context + "/login-failed";
        }
        session.setAttribute("loginUser", user);
        model.addAttribute("username",username);

        return context+"/login-success";
    }

    //Get /user/logout
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
//        session.removeAttribute("loginUser"); 위에 거랑 같으면서 다름 위에건 세션을 통으로 날리고 이건 해당되는 것만 날림.
        return context+"/logout";
    }

    @GetMapping("/register")
    public String registerPage(){
        return context+"/register";
    }
    @PostMapping("/register")
    public String register(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model
    ){
        if(username.isEmpty() || password.isEmpty()){
            model.addAttribute("errMsg", "아이디 또는 비밀번호가 누락 되었습니다.");
            return context+"/register-failed";
        }
        User user = userService.findByUsername(username);
        if(user!=null){
            model.addAttribute("errMsg","동일한 ID를 가지는 사용자가 존재합니다.");
            return context+"/register-failed";
        }
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        userService.save(newUser);

        model.addAttribute("username", username);

        return context + "/register-success";
    }
}
