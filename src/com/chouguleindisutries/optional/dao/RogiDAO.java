package com.chouguleindisutries.optional.dao;

import java.util.Collection;
import java.util.Optional;

import com.chouguleindisutries.optional.dto.RogiDTO;
import com.chouguleindisutries.optional.search.RogiSearch;

public interface RogiDAO {

	boolean save(RogiDTO dto);

	Optional<RogiDTO> findOne(RogiSearch search);

	Optional<Integer> totalSize();

	Optional<RogiDTO> findByMaxAge();

	Optional<RogiDTO> findByMinAge();

	Collection<RogiDTO> findAll();

	Collection<RogiDTO> findAll(RogiSearch search);

}
