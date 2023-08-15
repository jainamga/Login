package login.rest.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import login.rest.demo.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
