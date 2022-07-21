package com.example.emailtest.global.email

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MailController(
    var userService: UserService
) {

    @GetMapping("send")
    fun send(): ResponseEntity<String> {
        userService.sendSimpleMesssage("your@naver.com", "test", "test")
        return ResponseEntity.ok().body("문자 메일이 성공적으로 발송 되었습니다.")
    }
}