package io.github.akotu235.nametags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
public class AppController {
    @PostMapping("/name-tags")
    public String processFile(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        String contents = new String(file.getBytes(), StandardCharsets.UTF_8);
        model.addAttribute("contents", contents);
        return "name-tags";
    }
}
