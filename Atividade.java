package domain;

import java.time.LocalDateTime;

public class Atividade {
    
    private Integer id;
    private String titulo;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Double cargaHoraria;
    private Integer quantidadeVagas;
    private Evento evento;
    private Local local;

    //

    public Atividade(Integer id, String titulo, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, Double cargaHoraria, Integer quantidadeVagas, Evento evento, Local local){
        this.id = id;
        this.titulo = titulo;
        this.dataHoraInicio = dataHoraInicio;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeVagas =  quantidadeVagas;
        this.evento = evento;
        this.local = local;
    };

    // 

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    //

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    //

    public LocalDateTime getDataHoraInicio(){
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio){
        this.dataHoraInicio=dataHoraInicio;
    }

    //

    public LocalDateTime getDataHoraFim(){
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim){
        this.dataHoraFim=dataHoraFim;
    }

    //

    public Double getCargaHoraria (){
        return cargaHoraria;
    }

    public void setCargaHoraria (Double cargaHoraria){
        this.cargaHoraria=cargaHoraria;
    }

    //

    public Integer getQuantidadeVagas(){
        return quantidadeVagas;
    }

    public void setQuantidadeVagas (Integer quantidadeVagas){
        this.quantidadeVagas=quantidadeVagas;
    }

    //

    public Evento getEvento (){
        return evento;
    }

    public void setEvento (Evento evento){
        this.evento=evento;
    }

    //

    public Local getLocal (){
        return local;
    }

    public void setLocal (Local local){
        this.local=local;
    }


}
