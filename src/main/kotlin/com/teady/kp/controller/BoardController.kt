package com.teady.kp.controller

import com.teady.kp.repository.data.dto.BoardDto
import com.teady.kp.service.BoardService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class BoardController(
    private val boardService: BoardService
) {

    @PostMapping("/upload")
    fun upload(@RequestBody boardDto: BoardDto) : HttpStatus = boardService.upload(boardDto)

    @GetMapping("/items")
    fun items() : List<BoardDto> = boardService.items()
}