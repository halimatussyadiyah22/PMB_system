package com.halimah.pmb_system.Registrasi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrasiRepository extends JpaRepository<Registrasi,Integer> {
    boolean existRegistrasiByName(String name);
    boolean existRegistrasiById(Integer id);
    boolean existRegistrationByNo_wa(Integer no_wa);
    boolean existsRegistrasiByPassword(String password);
}
