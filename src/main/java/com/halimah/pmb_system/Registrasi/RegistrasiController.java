package com.halimah.pmb_system.Registrasi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registrasi")
public class RegistrasiController {
    private final  RegistrasiService registrasiService;

    public  RegistrasiController(RegistrasiService registrasiService){
        this.registrasiService = registrasiService;
    }

    @GetMapping
    public List<Registrasi> getRegistrasi(){
        return registrasiService.getAllRegistrasi();
    }
    @GetMapping("{registrasiId}")
    public Registrasi getRegistrasi(
            @PathVariable("registrasiId") Integer registrasiId
    ){
        return registrasiService.getRegistrasi(registrasiId);
    }
    @PostMapping
    public void registerRegistrasi(
            @RequestBody RegistrasiRegistrationRequest request){
        registrasiService.addRegistrasi(request);
    }

}
