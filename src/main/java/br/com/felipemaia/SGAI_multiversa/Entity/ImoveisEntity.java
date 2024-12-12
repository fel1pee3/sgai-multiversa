package br.com.felipemaia.SGAI_multiversa.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "imoveis")
public class ImoveisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "preco_aluguel", nullable = false)
    private Double precoAluguel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(Double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

}
