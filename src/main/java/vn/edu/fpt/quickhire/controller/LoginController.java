package vn.edu.fpt.quickhire.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.edu.fpt.quickhire.entity.User;
import vn.edu.fpt.quickhire.model.impl.UserServiceImpl;

import java.util.Objects;

@Controller
public class LoginController {

    // Hiển thị form đăng nhập
    @GetMapping("/login")
    public String showLoginForm() {
        return "login/login";
    }

    // Xử lý quá trình đăng nhập
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {

        // Giả lập quá trình xác thực (thực tế bạn có thể lấy từ DB hoặc service)
        if ("admin".equals(username) && "password".equals(password)) {
            // Lưu thông tin người dùng vào session
            session.setAttribute("username", username);

            // Chuyển hướng đến trang chủ sau khi đăng nhập thành công
            return "redirect:/home";
        } else {
            // Đăng nhập thất bại
            model.addAttribute("error", "Invalid username or password");
            return "login/login";
        }
    }

    @GetMapping("/sign-out")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/";
    }
}
