package my.pjt.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import my.pjt.domain.ProductVO;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ProductMapperTests {

	@Setter(onMethod_ = @Autowired)
	private ProductMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(product -> log.info(product));
	}
	
	@Test
	public void testGetList2() {
		
		mapper.getList2("A01").forEach(product -> log.info(product));
	}
	
	@Test //이건 입력
	public void aq() {
		ProductVO product = new ProductVO();
		product.setCode("B03");
		product.setPname("모바일그립톡");
		product.setCost(500);
		product.setPnum(1000);
		product.setJnum(2000);
		product.setSale(1500);
		product.setGcode("B");
		mapper.insert(product);
		log.info(product);
	}

//@Test //이건 셀렉트키
//	public void sk() {
//		BoardVO board = new BoardVO();
//		board.setB_title("new title222");
//		board.setB_content("new content222");
//		board.setBoard_writer("new writer222");
//		mapper.insertSelectKey(board);
//		log.info(board);
//	}
//
//@Test
//public void gklj() {
//	BoardVO board = mapper.read(3);
//			log.info(board);
//	
//}	@Test
//public void gsklj() {
//	log.info("delete count : "+ mapper.delete(4));
//		}
//
//@Test
//public void aaf() {
//	BoardVO board = new BoardVO();
//	board.setBno(1);
//	board.setB_title("수정수정");
//	board.setB_content("수정수정 수정수정");
//	board.setBoard_writer("수정수정");
//	int count = mapper.update(board);
//	log.info("update count "  + count );
//}

}
