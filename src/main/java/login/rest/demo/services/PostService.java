package login.rest.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import login.rest.demo.models.PostDto;


@Service
public interface PostService {

	
	PostDto createPost(PostDto postDto,Long userId,Integer categoryId) throws Exception;

	PostDto updatePost(PostDto postDto,Integer postId) throws Exception;
	
	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize,String sortBy);
	
	PostDto getPostById(Integer postId) throws Exception;
	
	List<PostDto> getPostsByCategory(Integer categoryId) throws Exception;
	
	List<PostDto> getPostsByUser(Long userId) throws Exception;
	
	List<PostDto> searchPostByKeyword(String keyword);
	
}
	