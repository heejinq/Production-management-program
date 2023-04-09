package my.pjt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import my.pjt.domain.ProductVO;
import my.pjt.mapper.ProductMapper;

@Log4j
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
	
	@Setter(onMethod_ = @Autowired)
	private ProductMapper mapper;

	@Override
	public void register(ProductVO product) { //입력하기
		log.info("register*******" + product);
		mapper.insert(product);
	}

	@Override 
	public ProductVO get(String code) { //조회하기
		log.info("get*******" + code);
		return mapper.read(code);
	}

	@Override
	public List<ProductVO> getList() { // 리스트보기
		log.info("List*******");
		return mapper.getList();
	}
	
	@Override
	public List<ProductVO> getList2(String code) { // 리스트보기
		log.info("List2*******");
		return mapper.getList2(code);
	}

	@Override
	public void remove(String code) { //삭제
		log.info("remove"+code);
		mapper.delete(code);
	}

	@Override
	public void modify(ProductVO product) { //수정
		log.info("modify"+product);
		mapper.update(product);
	}

	@Override
	public List<ProductVO> firstmade() { //우선생산
		log.info("firstList");
		return mapper.firstmade();
	}

	@Override
	public List<ProductVO> stock_quantity() { //재고
		log.info("stock_quantity");
		return mapper.stock_quantity();
	}
	
	@Override
	public List<ProductVO> stock_quantity2(String gcode) { //검색재고
		log.info("stock_quantity2");
		return mapper.stock_quantity2(gcode);
	}

	@Override
	public List<ProductVO> profit_ranking() {
		log.info("List*******");
		return mapper.profit_ranking();
	}

}
