package com.trybe.acc.java.anobissexto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class AnoBissexto.
 */
public class AnoBissexto {

  /**
   * Identificar ano bissexto.
   *
   * @param ano the ano
   * @return true, if successful
   */
  public boolean identificarAnoBissexto(int ano) {
    LocalDate anoRecebido = LocalDate.ofYearDay(ano, 01);
    return anoRecebido.isLeapYear();
  }

  /**
   * Identificar proximo ano bissexto.
   *
   * @param data the data
   * @return the int
   */
  public int identificarProximoAnoBissexto(String data) {
    short contador = 1;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dataRecebida = LocalDate.parse(data, formatador);
    LocalDate proximoAno = dataRecebida.plusYears(contador);
    while (!proximoAno.isLeapYear()) {
      contador++;
      proximoAno = dataRecebida.plusYears(contador);
    }

    return proximoAno.getYear();
  }
}
