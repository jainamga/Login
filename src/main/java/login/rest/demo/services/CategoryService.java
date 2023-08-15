package login.rest.demo.services;

import java.util.List;

import login.rest.demo.models.CategoryDto;


public interface CategoryService {
  CategoryDto createCategory(CategoryDto categorydto);
  CategoryDto updateCategory(CategoryDto categorydto);
  void deleteCategory(Integer categoryId) throws Exception;
  CategoryDto getCategory(Integer categoryId);
  List<CategoryDto> getCategories();
CategoryDto updateCategory(CategoryDto categorydto, Integer categoryId) throws Exception;
  
}
