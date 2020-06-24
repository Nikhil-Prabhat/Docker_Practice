package com.cognizant;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Repo extends JpaRepository<User, Integer> 
{

}
