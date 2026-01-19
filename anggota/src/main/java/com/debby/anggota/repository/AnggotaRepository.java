package com.debby.anggota.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debby.anggota.model.AnggotaModel;

@Repository
public interface AnggotaRepository extends JpaRepository<AnggotaModel, Long> {

}
