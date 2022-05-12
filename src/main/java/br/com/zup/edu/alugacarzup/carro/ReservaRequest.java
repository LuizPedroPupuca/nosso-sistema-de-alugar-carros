package br.com.zup.edu.alugacarzup.carro;

public class ReservaRequest {

    private Long idCarro;

    @Deprecated
    public ReservaRequest(){}

    public ReservaRequest(Long idCarro) {
        this.idCarro = idCarro;
    }

    public Long getIdCarro() {
        return idCarro;
    }

    public Reserva toModel(Carro carro) {
        return new Reserva(carro);
    }
}
