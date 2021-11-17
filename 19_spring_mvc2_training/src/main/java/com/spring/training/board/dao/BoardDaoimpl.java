package com.spring.training.board.dao;

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
		
		System.out.println("----dao----");
		System.out.println(boardDto);
		
							// (namepace명.쿼리id명 , 파라메타)
		sqlSession.insert("mapper.BoardMapper.insertBoard", boardDto);
		

	}

}
