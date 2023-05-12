package com.halimah.pmb_system.Registrasi;

import com.halimah.pmb_system.exception.DuplicateResourceException;
import com.halimah.pmb_system.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrasiService {
    private final RegistrasiDao registrasiDao;

    //public RegistrasiService(RegistrasiDao registrasiDao) {
        //this.registrasiDao = registrasiDao;
    //}
    public RegistrasiService(@Qualifier("jpa") RegistrasiDao registrasiDao) {
       this.registrasiDao = registrasiDao;
    }

    public List<Registrasi> getAllRegistrasi() {
        return registrasiDao.selectAllRegistrasi();
    }


    public Registrasi getRegistrasi(Integer registrasiId) {
        return registrasiDao.selectRegistrasiById(registrasiId).orElseThrow(()->new ResourceNotFoundException("registrasi id [%s] not found ".formatted(registrasiId)));
    }

    public void addRegistrasi(RegistrasiRegistrationRequest registrasiRegistrationRequest) {
            String nameRegistrasi = registrasiRegistrationRequest.name();
            if (registrasiDao.existPersonWithname(registrasiRegistrationRequest.name())){
                throw new DuplicateResourceException("product with nama product [%s] already exist".formatted(nameRegistrasi));
            }
            Registrasi registrasi = new Registrasi(
                    registrasiRegistrationRequest.name(),
                    registrasiRegistrationRequest.no_wa(),
                    registrasiRegistrationRequest.password()
            );
            registrasiDao.insertRegistrasi(registrasi);
        }
    }



