package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//JsonAlias faz uma referência a como está o nome dos atributos no Json da API.
@JsonIgnoreProperties(ignoreUnknown = true) //ignora as propriedades/atributos não mapeados, ou seja, ignora todos que não sejam title, totalSeasons e imdbRating.
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {

}
