package br.com.zup.edu.alugacarzup.carro;

import javax.persistence.*;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Carro carro;

    @Deprecated
    public Reserva(){}

    public Reserva(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }


}
