package br.com.felipemaia.SGAI_multiversa.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alugueis")
public class AlugueisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "imovel_id", nullable = false)
    private ImoveisEntity imovel;

    @ManyToOne
    @JoinColumn(name = "inquilino_id", nullable = false)
    private InquilinosEntity inquilino;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "status", nullable = false)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImoveisEntity getImovel() {
        return imovel;
    }

    public void setImovel(ImoveisEntity imovel) {
        this.imovel = imovel;
    }

    public InquilinosEntity getInquilino() {
        return inquilino;
    }

    public void setInquilino(InquilinosEntity inquilino) {
        this.inquilino = inquilino;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
