package com.AgendaDeContatosv2.Agendav2.respository;


import com.AgendaDeContatosv2.Agendav2.model.AgendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository  extends JpaRepository<AgendaModel, Long> {
}
