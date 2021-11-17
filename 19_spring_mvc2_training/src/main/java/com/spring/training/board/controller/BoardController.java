package com.spring.training.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.training.board.dto.BoardDto;
import com.spring.training.board.service.BoardService;
import com.spring.training.board.service.BoardServiceImpl;

@Controller // 컨트롤러임을 명시 (controller bean에 등록)
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/boardWrite" , method=RequestMethod.GET) // value에는 url주소를 명시 , method는 요청 타입을 명시( 생략시 GET,POST 모두 처리 )     
	public String boardWrite() {
		return "board/bWrite"; // servlet-context.xml에 명시된 대로 포워딩 시킬 jsp파일을 작성한다.
	}
	
	@RequestMapping(value="/boardWrite" , method=RequestMethod.POST) 
	public String boardWrite(BoardDto boardDto) {
		
		System.out.println("-----controller-----");
		System.out.println(boardDto);
		
		boardService.insertBoard(boardDto);
		
		return "home"; 
		
	}
	
	
	
	
}
