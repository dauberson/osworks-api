package com.algaworks.osworks.api.exceptionhandler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

public class Problema {
    @Getter @Setter
    private Integer status;
    @Getter @Setter
    private LocalDateTime dataHora;
    @Getter @Setter
    private String titulo;
    @Getter @Setter
    private List<Campo> campos;
    public static class Campo {
        @Getter @Setter
        private String nome;
        @Getter @Setter
        private String mensagem;

        public Campo(String nome, String mensagem) {
            this.nome = nome;
            this.mensagem = mensagem;
        }
    }
}
