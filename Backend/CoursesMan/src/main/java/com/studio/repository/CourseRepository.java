package com.studio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studio.entity.CourseEntity;





public interface CourseRepository extends JpaRepository<CourseEntity,Integer>
{

}
