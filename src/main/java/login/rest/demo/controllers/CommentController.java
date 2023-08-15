package login.rest.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.rest.demo.models.CommentDto;
import login.rest.demo.services.CommentService;


@RestController
@RequestMapping("/api/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;

	
	@PostMapping("/post/{postId}/comments")
	public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment,@PathVariable Integer postId) throws Exception
	{
		CommentDto createCommented = this.commentService.createComment(comment, postId);
		return new ResponseEntity<CommentDto>(createCommented,HttpStatus.OK);
		
	}
	
	@PostMapping("/comments/{commentId}")
	public ResponseEntity<CommentDto> deleteComment(@PathVariable Integer commentId) throws Exception
	{
		 this.commentService.deleteComment(commentId);
		return new ResponseEntity<CommentDto>(new CommentDto(),HttpStatus.OK);
		
	}
	
	 
}
