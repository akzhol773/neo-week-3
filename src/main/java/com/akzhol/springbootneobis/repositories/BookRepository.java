package com.akzhol.springbootneobis.repositories;


import com.akzhol.springbootneobis.entity.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

interface BookRepository  extends JpaRepository<Book, Long>{

}
