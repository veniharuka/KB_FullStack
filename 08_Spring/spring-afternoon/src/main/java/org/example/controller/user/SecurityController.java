package org.example.controller.user;

import lombok.RequiredArgsConstructor;
import org.example.security.service.CustomUserDetailService;
import org.example.service.user.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@RequestMapping("/security")
public class SecurityController {
    private final UserService userService;
    private final String context = "/security";
    private final CustomUserDetailService customUserDetailService;


    @GetMapping("/login")
    public String loginPage() {
        return context +  "/login";
    }
    @GetMapping("/login-failed")
    public String loginFailPage() {
        return context +  "/login-failed";
    }
    @GetMapping("/member")
    public String loginSuccessPage(Model model, Principal principal) {
        if(principal == null){
            return "redirect:/security/login";
        }
        UserDetails userDetails = customUserDetailService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return context +  "/member";
    }
    @GetMapping("/admin")
    public String admin(){
        return context +  "/admin";
    }

}
