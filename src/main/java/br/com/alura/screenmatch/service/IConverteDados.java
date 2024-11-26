package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //isso é um metodo generico, como é generico ele aceita tanto String, Integer e outros tipos
    <T> T obterDados(String json, Class<T> classe);
}
