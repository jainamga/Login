package login.rest.demo.services;

import login.rest.demo.models.CommentDto;

public interface CommentService {

	
	CommentDto createComment(CommentDto commentDto,Integer postId) throws Exception;
	void deleteComment(Integer commentId) throws Exception;
}
