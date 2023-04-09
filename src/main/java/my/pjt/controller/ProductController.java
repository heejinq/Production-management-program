package my.pjt.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import my.pjt.domain.ProductVO;
import my.pjt.service.ProductService;

@Controller
@Log4j
@AllArgsConstructor
public class ProductController {
	private ProductService service;
	
	@GetMapping("/product_register") //페이지이동용 
	public void product_register(){
		
	}
	
	@PostMapping("/product_register") //작동용
	public String pr(ProductVO product,RedirectAttributes rttr){
		service.register(product);
		rttr.addFlashAttribute("result",product.getCode());
		return "redirect:/index";
		
	}
	
	@GetMapping("/listsearch") //리스트 보기
	public void listsearch(Model model) {
		log.info("listsearch");
		model.addAttribute("listsearch",service.getList());
	}
	
	
	@GetMapping("/listsearch2")
	public String listsearch2(@RequestParam("code") String code, Model model) {
	    log.info("listsearch2");
	    List<ProductVO> productList = service.getList2(code);
	    model.addAttribute("listsearch2", productList);
	    return "/listsearch3";
	}
	
	@PostMapping("/modify") //수정쓰 
	public String modify(ProductVO product,RedirectAttributes rttr){
		log.info("modify : "+product);
		service.modify(product); 
			rttr.addFlashAttribute("Result","success");
		
		return "redirect:/listsearch";
		
	}
	

//	@GetMapping("/modify") // 이동수정페이지
//	public void modify() {
//
//	}
	@GetMapping({"/search","/modify"})
	public void get(@RequestParam("code") String code, Model model) {
		log.info("/search or /modify");
		model.addAttribute("product",service.get(code));
	}
	
	@GetMapping("/remove")
	public String remove(@RequestParam("code") String code,RedirectAttributes rttr) {
		log.info("remove***"+code);
		service.remove(code); 
			rttr.addFlashAttribute("Result","success");
		
		return "redirect:/listsearch";
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
	}
	
	@GetMapping("/first") //우선순위리스트 보기
	public void first(Model model) {
		log.info("first");
		model.addAttribute("first",service.firstmade());
	}
	
	@GetMapping("/group") //재고 전체 확인
	public void group(Model model) {
		log.info("group");
		model.addAttribute("group",service.stock_quantity());
	}
	
	@GetMapping("/group2") //재고 검색 확인
	public String group2(@RequestParam("gcode") String gcode,Model model) {
		log.info("group2");
		List<ProductVO> gro = service.stock_quantity2(gcode);
		model.addAttribute("group2",gro);
		return "/group3";
	}
	
	@GetMapping("/earn") //이익 리스트 보기
	public void earn(Model model) {
		log.info("earn");
		model.addAttribute("earn",service.profit_ranking());
	}
}
