package com.example.controller;

import com.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    // ✅ 로그인 페이지
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // ✅ 로그인 처리
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {

        boolean success = userService.login(username, password);

        if (success) {
            session.setAttribute("loginUser", username);
            return "redirect:/"; // 메인 페이지로
        } else {
            model.addAttribute("error", "아이디 또는 비밀번호가 틀렸습니다.");
            return "login";
        }
    }

    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           Model model) {

        boolean success = userService.register(username, password);

        if (success) {
            return "redirect:/login";  // 회원가입 성공 → 로그인 페이지로 이동
        } else {
            model.addAttribute("error", "이미 존재하는 아이디입니다.");
            return "register"; // 회원가입 페이지로 다시 이동
        }
    }

    // ✅ 로그아웃 처리
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    // ✅ 회원가입 페이지 (이거 하나만 추가)
    @GetMapping("/register")
    public String showRegisterForm() {
        return "register"; // templates/register.html로 연결됨
    }
}

