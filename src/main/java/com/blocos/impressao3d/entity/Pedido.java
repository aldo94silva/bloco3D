package com.blocos.impressao3d.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int andares;

    @NotNull
    private String cor1;

    @NotNull
    private String cor2;

    @NotNull
    private String cor3;

    private String desenho1;
    private String desenho2;
    private String desenho3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public String getCor1() {
        return cor1;
    }

    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }

    public String getCor2() {
        return cor2;
    }

    public void setCor2(String cor2) {
        this.cor2 = cor2;
    }

    public String getCor3() {
        return cor3;
    }

    public void setCor3(String cor3) {
        this.cor3 = cor3;
    }

    public String getDesenho1() {
        return desenho1;
    }

    public void setDesenho1(String desenho1) {
        this.desenho1 = desenho1;
    }

    public String getDesenho2() {
        return desenho2;
    }

    public void setDesenho2(String desenho2) {
        this.desenho2 = desenho2;
    }

    public String getDesenho3() {
        return desenho3;
    }

    public void setDesenho3(String desenho3) {
        this.desenho3 = desenho3;
    }
}
