package login.rest.demo.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.rest.demo.entity.Comment;
import login.rest.demo.entity.Post;
import login.rest.demo.models.CommentDto;
import login.rest.demo.repository.CommentRepo;
import login.rest.demo.repository.PostRepo;


@Service
public class CommentServiceImpl implements CommentService{

	
	@Autowired
	PostRepo postRepo;
	
	@Autowired
	CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) throws Exception {
		Post post= this.postRepo.findById(postId).orElseThrow(()->new Exception());
		Comment comment= this.modelMapper.map(commentDto,Comment.class);
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);
		
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) throws Exception {
		Comment com= this.commentRepo.findById(commentId).orElseThrow(()->new Exception());
		this.commentRepo.delete(com);
		
		
	}

	
	
	
}
