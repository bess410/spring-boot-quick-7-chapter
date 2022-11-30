package com.hotmail.bess410.springBootQuick7chapter.repository;

import com.hotmail.bess410.springBootQuick7chapter.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
