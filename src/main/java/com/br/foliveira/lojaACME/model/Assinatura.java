package com.br.foliveira.lojaACME.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public class Assinatura {
    
    BigDecimal mensalidade;
    LocalDate begin;
    Optional<LocalDate> end;
    Cliente cliente;

    public Assinatura(BigDecimal mensalidade, LocalDate begin, LocalDate end, Cliente cliente){

    }

    public Assinatura(BigDecimal mensalidade, LocalDate begin, Cliente cliente){
        
    }

}
