package ma.soft.unes.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.soft.unes.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
