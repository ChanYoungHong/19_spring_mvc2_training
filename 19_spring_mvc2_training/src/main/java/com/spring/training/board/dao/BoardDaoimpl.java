package com.spring.training.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.training.board.dto.BoardDto;

@Repository // DAO Data Access Object 데이터 접근 객체는 @repo에 명시(serivce bean으로 등록)
public class BoardDaoimpl implements BoardDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(BoardDto boardDto) {		
		sqlSession.insert("mapper.BoardMapper.insertBoard", boardDto); // (namepace명.쿼리id명 , 파라메타)
	}

	@Override
	public List<BoardDto> selectAll() {	// service로 보내주는 역할을 한다
		return sqlSession.selectList("mapper.BoardMapper.getAllBoard");
	}

	@Override
	public BoardDto selectOne(int num) {
		return sqlSession.selectOne("mapper.BoardMapper.getOneBoard", num);
	}

}
