package org.zerock.mapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/database-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper mapper;
	
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	

	public void testInsert() {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("새로 작성하는 글");
		boardVO.setContent("새로 작성하는 내용");
		boardVO.setWriter("newbie");
		
		mapper.insert(boardVO);
		log.info(boardVO);
	}
	
	public void testInsertSelectKey() {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("새로 작성하는 글 SelectKey");
		boardVO.setContent("새로 작성하는 내용 SelectKey");
		boardVO.setWriter("newbie");
		
		mapper.insertSelectKey(boardVO);
		log.info(boardVO);
	}
	
	
	public void testBoard() {
		BoardVO boardVO = mapper.read(5L);
		
		log.info(boardVO);
	}
	
	
	public void testDelete() {
		log.info(mapper.delete(3L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBno(5L);
		boardVO.setTitle("수정된 제목");
		boardVO.setContent("수정된 내용");
		boardVO.setWriter("user00");
		
		int count = mapper.update(boardVO);
		log.info("upcount : " + count);
	}
}
