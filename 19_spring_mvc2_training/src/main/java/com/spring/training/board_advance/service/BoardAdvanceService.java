package com.spring.training.board_advance.service;

import java.util.List;
import java.util.Map;

import com.spring.training.board_advance.dto.BoardAdvanceDto;

public interface BoardAdvanceService {
	
	public List<BoardAdvanceDto> getSearchBoard(Map<String, Object> searchInfo) throws Exception;
	public int getAllBoardCount(Map<String, String> searchCountInfo) throws Exception;
	public BoardAdvanceDto getOneBoard(int num) throws Exception;
	public void insertBoard(BoardAdvanceDto bdto) throws Exception;
	public void insertReplyBoard(BoardAdvanceDto bdto) throws Exception;
	public boolean updateBoard(BoardAdvanceDto bdto) throws Exception;
	public boolean deleteBoard(BoardAdvanceDto bdto) throws Exception;
	public void makeDummyData() throws Exception;
	
}
