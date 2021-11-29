package com.spring.training.board_advance.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.training.board_advance.dto.BoardAdvanceDto;

@Repository				
public class BoardAdvanceDaoImpl implements BoardAdvanceDao {

	
	@Inject							
	private SqlSession sqlSession;		
	
	@Override
	public List<BoardAdvanceDto> getSearchBoard(Map<String, Object> searchInfo) throws Exception{
		return sqlSession.selectList("com.spring.mapper.BoardAdvanceMapper.getSearchBoard",searchInfo);
	}
	
	@Override
	public int getAllBoardCount(Map<String, String> searchCountInfo) throws Exception {
		return sqlSession.selectOne("com.spring.mapper.BoardAdvanceMapper.getAllBoardCount" , searchCountInfo);
	}
	
	@Override
	public BoardAdvanceDto getOneBoard(int num) throws Exception{
		return sqlSession.selectOne("com.spring.mapper.BoardAdvanceMapper.getOneBoard",num);
	}
	
	@Override
	public void increaseReadCount(int num) throws Exception {
		sqlSession.update("com.spring.mapper.BoardAdvanceMapper.increaseReadCount",num);
	}
	
	@Override
	public void insertBoard(BoardAdvanceDto bdto) throws Exception{
		sqlSession.insert("com.spring.mapper.BoardAdvanceMapper.insertBoard",bdto);
	}
	
	@Override
	public void insertReplyBoard(BoardAdvanceDto bdto) throws Exception {
		sqlSession.insert("com.spring.mapper.BoardAdvanceMapper.insertReplyBoard",bdto);
	}
	
	@Override
	public void updateBoard(BoardAdvanceDto bdto) throws Exception{
		sqlSession.update("com.spring.mapper.BoardAdvanceMapper.updateBoard",bdto);
	}

	@Override
	public void deleteBoard(int num) throws Exception{
		sqlSession.delete("com.spring.mapper.BoardAdvanceMapper.deleteBoard",num);
	}

	@Override
	public void updateBoardReplyStep(BoardAdvanceDto bdto) throws Exception {
		sqlSession.update("com.spring.mapper.BoardAdvanceMapper.updateBoardReplyStep" , bdto);
	}
	
	@Override
	public BoardAdvanceDto validateUserCheck(BoardAdvanceDto bdto) throws Exception {
		return sqlSession.selectOne("com.spring.mapper.BoardAdvanceMapper.validateUserCheck",bdto);
	}

	@Override
	public void makeDummyData(List<BoardAdvanceDto> dataLists) throws Exception {
		sqlSession.insert("com.spring.mapper.BoardAdvanceMapper.makeDummyData" , dataLists);
	}



}
