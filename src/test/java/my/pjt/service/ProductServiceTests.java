package my.pjt.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import my.pjt.domain.ProductVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ProductServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private ProductService service;
	
	@Test
	public void a() {
		log.info(service);
		assertNotNull(service);
	}
	@Test
	public void aa(){
		ProductVO product = new ProductVO();
		product.setCode("B04");
		product.setPname("모바일케이스");
		product.setCost(500);
		product.setPnum(1000);
		product.setJnum(2000);
		product.setSale(1500);
		product.setGcode("B");
		service.register(product);
		log.info("new bno : "+product.getPname());
	}
	@Test
	public void aaa() {
		service.getList().forEach(product ->log.info(product));
	}
//	@Test
//	public void aaaa() {
//		log.info(service.get(2));
//	}
//	@Test
//	public void ud() {
//		BoardVO board = service.get(11);
//		
//		if(board == null) {
//			return;
//		}board.setB_title("updatetitle");
//		log.info("result : "+service.modify(board));
//	}

}

