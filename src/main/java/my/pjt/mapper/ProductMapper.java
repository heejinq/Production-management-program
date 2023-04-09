package my.pjt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import my.pjt.domain.ProductVO;

public interface ProductMapper {
	
	public void insert(ProductVO product); //입력
	public ProductVO read(String code); //코드로 읽기처리
	public List<ProductVO> getList(); //리스트 보기
	public List<ProductVO> getList2(@Param("code") String code); //검색 리스트 보기 
	public void delete(String code); //삭제처리
	public void update(ProductVO product); //수정처리
	public List<ProductVO> firstmade(); //우선생산리스트보기
	public List<ProductVO> stock_quantity(); //재고수량전체리스트
	public List<ProductVO> stock_quantity2(@Param("gcode") String gcode); //재고수량검색리스트
	public List<ProductVO> profit_ranking(); //이익순위
}
