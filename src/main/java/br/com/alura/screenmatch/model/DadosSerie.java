package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//Ta em record so pq serve para pegar os dados, n vaii ter metodos ou algo do tipo entao por isso q é record
//esse Jackson Databind tem esse JasonAlias, que vc escreve o nome certinho de como ta na API e ele atribui pro nome que vc deu na variavel
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
