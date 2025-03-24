package com.example.rev.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionario")

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String CPF;
    private String RG;
    private String matricula;
    private String setor;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(Long id, String CPF, String RG, String matricula, String setor, double salario) {
        this.id = id;
        this.CPF = CPF;
        this.RG = RG;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", matricula='" + matricula + '\'' +
                ", setor='" + setor + '\'' +
                ", salario=" + salario +
                '}';
    }
}
