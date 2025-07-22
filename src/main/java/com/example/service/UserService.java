package com.example.service;

import com.example.domain.User;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // ✅ 로그인 처리
    public boolean login(String username, String password) {
        Optional<User> userOpt = userRepository.findByUsername(username);
        return userOpt.isPresent() && userOpt.get().getPassword().equals(password);
    }

    // ✅ 회원가입 처리 (중복 체크 포함)
    public boolean register(String username, String password) {
        Optional<User> existingUser = userRepository.findByUsername(username);

        if (existingUser.isPresent()) {
            // 이미 존재하는 아이디
            return false;
        }

        // 새 사용자 저장
        User user = User.builder()
                .username(username)
                .password(password) // 나중에 BCrypt로 암호화할 예정
                .provider("local")
                .build();

        userRepository.save(user);
        return true;
    }
}
