package com.example.crudcompanyspringboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@Repository
@RepositoryRestResource(path = "companies", collectionResourceRel = "companies")
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
