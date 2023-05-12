package com.halimah.pmb_system.Registrasi;

import java.util.List;
import java.util.Optional;

public interface RegistrasiDao {
    List<Registrasi> selectAllRegistrasi();

    Optional<Registrasi> selectRegistrasiById(Integer id);

    void insertRegistrasi(Registrasi registrasi);

    boolean existPersonWithNo_WA(Integer no_wa);
    boolean existPersonWithname(String name);
    boolean existPersonWithpassword(String password);
    boolean existPersonWithId(Integer registrasiId);
    void deleteRegistrasiById(Integer regostrasoId);
    void updateRegistrasi(Registrasi update);

}

