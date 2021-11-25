package com.spring.training.board.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.training.board.dto.BoardDto;
import com.spring.training.board.service.BoardService;
import com.spring.training.board.service.BoardServiceImpl;

@Controller // 컨트롤러임을 명시 (controller bean에 등록)
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String main() {
		return "board/bMain";
	}
	
	@RequestMapping(value="/boardWrite" , method=RequestMethod.GET) // value에는 url주소를 명시 , method는 요청 타입을 명시( 생략시 GET,POST 모두 처리 )     
	public String boardWrite() {
		return "board/bWrite"; // servlet-context.xml에 명시된 대로 포워딩 시킬 jsp파일을 작성한다.
	}
	
	@RequestMapping(value="/boardWrite" , method=RequestMethod.POST) 
	public String boardWrite(BoardDto boardDto) {
		
//		System.out.println("-----controller-----");
//		System.out.println(boardDto);
		
		boardService.insertBoard(boardDto);
		
//		return "board/bList";
		return "redirect:boardList"; // redirct :url 해당 url로 이동한다.
		
	}
	
	@RequestMapping(value="/boardList" , method=RequestMethod.GET)
	public String boardList(Model model) {
		
		List<BoardDto> boardList = boardService.getBoardList();
		
		
		
//		for(BoardDto boardDto : boardList) {
//			System.out.println(boardDto);
//		}
//		boardService.getBoardList();
		
//		request.setAttribute("boardList", boardList);
		
//		mv.addObject("boardList", boardList);
		model.addAttribute("boardList", boardList);
		
		return "board/bList";
		
	}
	
	@RequestMapping(value="/boardInfo", method=RequestMethod.GET)
	public String boardInfo(@RequestParam("num") int num, Model model) {		// bList에서 ?num=에서 받아오는 것 
		
//		System.out.println(num);

		BoardDto boardDto = boardService.getOneBoard(num);
		model.addAttribute("boardDto", boardDto);
		
//		System.out.println(boardDto);
		return "board/bInfo";
	}
	
	@RequestMapping(value="/boardDelete", method=RequestMethod.GET)
	public String boardDelete(@RequestParam("num") int num, Model model) {
		
		model.addAttribute("boardDto", boardService.getOneBoard(num));
		return "board/bDelete";
	}
	
	@RequestMapping(value="/boardDelete", method=RequestMethod.POST)
	public String boardDelete(BoardDto boardDto, Model model) {
		
		if (boardService.deleteBoard(boardDto)) {
			model.addAttribute("success", true);
		}
		else {
			model.addAttribute("success", false);
		}
		
		return "board/bDeletePro";
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.GET)
	public String boardUpdate(@RequestParam("num") int num, Model model) {
		
		model.addAttribute("boardDto", boardService.getOneBoard(num));
		
		return "board/bUpdate";
	}
	
	@RequestMapping(value="/boardUpdate", method=RequestMethod.POST)
	public String boardUpdate(BoardDto boardDto, Model model) {
		
		if(boardService.updateBoard(boardDto)) {
			model.addAttribute("success", true);
		}
		else {
			model.addAttribute("success", false);
		}
		
		return "board/bUpdatePro";
	}
	
	
	
}
