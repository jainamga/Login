package login.rest.demo.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




public class CategoryDto {

	
	private Integer categoryId;
	private String cateogoryTitle;
	public CategoryDto() {
		super();
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCateogoryTitle() {
		return cateogoryTitle;
	}
	public void setCateogoryTitle(String cateogoryTitle) {
		this.cateogoryTitle = cateogoryTitle;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	private String categoryDescription;

}
