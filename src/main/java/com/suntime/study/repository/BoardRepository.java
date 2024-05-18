<<<<<<< HEAD
package com.suntime.study.repository;

import com.suntime.study.entity.Board;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface BoardRepository extends CrudRepository<Board,Long> {
    @Override
    ArrayList<Board> findAll();
}
=======
package com.suntime.study.repository;

import com.suntime.study.entity.Board;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface BoardRepository extends CrudRepository<Board,Long> {
    @Override
    ArrayList<Board> findAll();
}
>>>>>>> d0cd6e2ceeeb75a71fd1707bb05f98092e3f4db3
