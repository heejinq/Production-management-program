package my.pjt.service;

import java.util.List;

import my.pjt.domain.ProductVO;

public interface ProductService {
	public void register(ProductVO product); //등록
	public ProductVO get(String code); //상세보기
	public List<ProductVO> getList(); //리스트 보기
	public List<ProductVO> getList2(String code); //리스트 보기
	public void remove(String code); //삭제처리
	public void modify(ProductVO product); //수정처리
	public List<ProductVO> firstmade(); //우선생산리스트보기
	public List<ProductVO> stock_quantity(); //재고수량
	public List<ProductVO> stock_quantity2(String gcode); //검색재고수량
	public List<ProductVO> profit_ranking(); //이익순위
}
