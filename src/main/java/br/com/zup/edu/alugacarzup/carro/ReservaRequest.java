package br.com.zup.edu.alugacarzup.carro;

public class ReservaRequest {

    private Long idCarro;

    private String reservadoPara;

    @Deprecated
    public ReservaRequest(){}

    public ReservaRequest(Long idCarro) {
        this.idCarro = idCarro;
    }

    public ReservaRequest(Long idCarro, String reservadoPara) {
        this.idCarro = idCarro;
        this.reservadoPara = reservadoPara;
    }

    public Long getIdCarro() {
        return idCarro;
    }

    public String getReservadoPara() {
        return reservadoPara;
    }

    public Reserva toModel(Carro carro) {
        return new Reserva(carro);
    }
}
