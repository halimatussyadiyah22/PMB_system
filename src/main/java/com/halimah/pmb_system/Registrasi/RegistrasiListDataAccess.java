package com.halimah.pmb_system.Registrasi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("listProduct")
public class RegistrasiListDataAccess implements RegistrasiDao{
    private static List<Registrasi> registrasi;
    static {
        registrasi = new ArrayList<>();
        Registrasi halimah = new Registrasi();
    }

    @Override
    public List<Registrasi> selectAllRegistrasi() {
        return registrasi;
    }

    @Override
    public Optional<Registrasi> selectRegistrasiById(Integer id) {
        return registrasi.stream().filter(registrasi -> registrasi.getId().equals(id)).findFirst();
    }

    @Override
    public void insertRegistrasi(Registrasi registrasi) {
        registrasi.add(registrasi);

    }

    @Override
    public boolean existPersonWithNo_WA(Integer no_wa) {
        return registrasi.stream().anyMatch(registrasi1 -> registrasi1.getNo_wa().equals(no_wa));
    }

    @Override
    public boolean existPersonWithname(String name) {
        return registrasi.stream().allMatch(registrasi -> registrasi.getName().equals(name));
    }

    @Override
    public boolean existPersonWithpassword(String password) {
        return registrasi.stream().allMatch(registrasi -> registrasi.getName().equals(password));
    }

    @Override
    public boolean existPersonWithId(Integer registrasiId) {
        return registrasi.stream().anyMatch(registrasi1 -> registrasi1.getId().equals(registrasiId));
    }

    @Override
    public void deleteRegistrasiById(Integer regostrasiId) {
         registrasi.stream().filter(registrasi1 -> registrasi1.getId().equals(regostrasiId)).findFirst().ifPresent(registrasi::remove);
    }

    @Override
    public void updateRegistrasi(Registrasi update) {
        registrasi.add(update);
    }
}
