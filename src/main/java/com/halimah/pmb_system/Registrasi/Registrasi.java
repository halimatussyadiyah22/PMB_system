package com.halimah.pmb_system.Registrasi;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Registrasi {
    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "PMB_id_sequence"
    )


    private Integer id;
    @Column( nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer no_wa;
    @Column(nullable = false)
    private  String password;


    public Registrasi(){
    }

    public Registrasi(String name, Integer no_wa, String password) {
        this.name = name;
        this.no_wa = no_wa;
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNo_wa() {
        return no_wa;
    }

    public void setNo_wa(Integer no_wa) {
        this.no_wa = no_wa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registrasi registrasi = (Registrasi) o;
        return Objects.equals(id, registrasi.id) &&
                Objects.equals(name,registrasi.name) &&
                Objects.equals(no_wa,registrasi.no_wa) &&
                Objects.equals(password,registrasi.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,no_wa,password);
    }


    @Override
    public String toString() {
        return "Customer { " + " id= " + id +
                " name= '" + name +
                '\'' + ",no whatsapp = '" + no_wa+
                '\'' + ",password = " + password + '}';
    }
}

