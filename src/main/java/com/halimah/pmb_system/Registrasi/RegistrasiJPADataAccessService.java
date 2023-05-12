package com.halimah.pmb_system.Registrasi;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("jparegistrasi")
public class RegistrasiJPADataAccessService implements RegistrasiDao{
    public RegistrasiJPADataAccessService(RegistrasiRepository registrasiRepository){
        this.registrasiRepository = registrasiRepository;
    }

    private final RegistrasiRepository registrasiRepository;

    @Override
    public List<Registrasi> selectAllRegistrasi() {
        return null;
    }

    @Override
    public Optional<Registrasi> selectRegistrasiById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void insertRegistrasi(Registrasi registrasi) {

    }

    @Override
    public boolean existPersonWithNo_WA(Integer no_wa) {
        return registrasiRepository.existRegistrationByNo_wa(no_wa);
    }

    @Override
    public boolean existPersonWithname(String name) {
        return registrasiRepository.existRegistrasiByName(name);
    }

    @Override
    public boolean existPersonWithpassword(String password) {
        return registrasiRepository.existsRegistrasiByPassword(password);
    }

    @Override
    public boolean existPersonWithId(Integer registrasiId) {
        return registrasiRepository.existRegistrasiById(registrasiId);
    }

    @Override
    public void deleteRegistrasiById(Integer regostrasoId) {

    }

    @Override
    public void updateRegistrasi(Registrasi update) {

    }
}
