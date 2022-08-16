package com.example.CountryName.CountryName;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoRepo extends JpaRepository<Country, Long>
{

}
