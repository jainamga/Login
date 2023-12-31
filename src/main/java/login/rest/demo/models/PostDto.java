package login.rest.demo.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class PostDto {
private String title;
private String content;
private String imageName;
private Date dateAdded;

public PostDto() {
	super();
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String getImageName() {
	return imageName;
}

public void setImageName(String imageName) {
	this.imageName = imageName;
}

public Date getDateAdded() {
	return dateAdded;
}

public void setDateAdded(Date dateAdded) {
	this.dateAdded = dateAdded;
}


public CategoryDto getCategory() {
	return category;
}

public void setCategory(CategoryDto category) {
	this.category = category;
}

public User getUser() {
	return user;
}

public Set<CommentDto> getComments() {
	return comments;
}

public void setComments(Set<CommentDto> comments) {
	this.comments = comments;
}

public void setUser(User user) {
	this.user = user;
}


private CategoryDto category;

private User user;

private Set<CommentDto> comments = new HashSet<>();


}
