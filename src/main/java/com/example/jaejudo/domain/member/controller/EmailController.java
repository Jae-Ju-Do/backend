package com.example.jaejudo.domain.member.controller;

import com.example.jaejudo.domain.member.dto.request.EmailDTO;
import com.example.jaejudo.domain.member.dto.request.VerificationKeyDTO;
import com.example.jaejudo.domain.member.service.EmailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @ResponseBody
    @RequestMapping(value = "/members/sendEmail", method = RequestMethod.POST)
    public void sendEmail(@RequestBody @Valid EmailDTO email) {
        emailService.sendEmail(email.getEmail());
    }

    @RequestMapping(value = "/members/verifyEmail", method = RequestMethod.POST)
    public void verifyEmail(@RequestBody VerificationKeyDTO key) {
        emailService.verifyEmail(key.getKey());
    }
}