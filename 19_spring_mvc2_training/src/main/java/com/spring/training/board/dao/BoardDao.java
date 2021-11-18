package com.spring.training.board.dao;

import java.util.List;

import com.spring.training.board.dto.BoardDto;

public interface BoardDao {

	public void insert(BoardDto boardDto);
	public List<BoardDto> selectAll();
	public BoardDto selectOne(int num);
}
