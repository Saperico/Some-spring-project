package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.AddressEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends Dao<AddressEntity, Long>
{

}
