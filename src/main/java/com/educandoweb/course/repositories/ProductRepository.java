package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

//como ele já herda de JPA Repository, neste caso não é necessário colocar
//@repository para indicar que é um repository, mas se colocar também tudo bem
//não irá dar erro, é opcional. Optei por nao colocar
public interface ProductRepository extends JpaRepository<Product, Long> {

}
