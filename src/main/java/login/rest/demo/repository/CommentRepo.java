package login.rest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import login.rest.demo.entity.Comment;


@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
