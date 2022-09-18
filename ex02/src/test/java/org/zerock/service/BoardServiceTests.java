package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
	"file:src/main/webapp/WEB-INF/spring/database-context.xml"})
@Log4j
public class BoardServiceTests {
	@Autowired
	private BoardService service;
	
	
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");
		
		service.register(board);
		
		log.info("생성된 게시글 번호" + board.getBno());
	}
	
	
	public void testGetList() {
		service.getList().forEach(board -> log.info(board));
	}
	
	
	public void testGet() {
		log.info(service.get(1L)); 
		
	}
	
	@Test
	public void testDelete() {
		log.info("제거결과 : " + service.remove(2L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO boardVO = service.get(1L);
		
		if (boardVO == null) {
			return;
		}
		
		boardVO.setTitle("제목 수정합니다.");
		log.info("수정 결과 : " + service.modify(boardVO));
	}
	
}
