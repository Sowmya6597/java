package com.cts.training.restresource;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.training.model.Register;
@RepositoryRestResource(path = "registerlist", collectionResourceRel = "registerlist")
public interface RegisterRestResource extends PagingAndSortingRepository<Register, Integer> {

}
