package login.rest.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.rest.demo.models.CategoryDto;
import login.rest.demo.services.CategoryService;


@RestController
@RequestMapping("/api/con")
public class CategoryController {

	
	
	@Autowired
	private CategoryService categoryservice;
	
	
	@PostMapping("/")
	public CategoryDto createCategory(@RequestBody CategoryDto cateogDto)
	{
		CategoryDto c = this.categoryservice.createCategory(cateogDto);
		return c;
	}
	
	@GetMapping("/")
	public List<CategoryDto> getAllCategory()
	{
		return categoryservice.getCategories();
	}
	
	
	
}
