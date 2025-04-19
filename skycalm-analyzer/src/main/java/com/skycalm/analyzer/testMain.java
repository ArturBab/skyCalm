package com.skycalm.analyzer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.skycalm.analyzer.model.AirlineTicket;
import com.skycalm.analyzer.model.FlightCommentary;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class testMain {
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {

            tx.begin();

            // Create ticket
            AirlineTicket ticket = new AirlineTicket();
            ticket.setAirline("SCAT");
            ticket.setDepartureDate(LocalDate.of(2025, 4, 11));
            ticket.setDepartureTime(LocalTime.of(15, 30));
            ticket.setFrom("Shymkent");
            ticket.setTo("Moscow");

            em.persist(ticket); // saving

            // Create commentary
            FlightCommentary commentary = new FlightCommentary();
            commentary.setSummary("Фиктивный анализ");
            commentary.setAdvice("Пока что заглушка.");
            commentary.setCreatedAt(LocalDateTime.now());
            commentary.setAirlineTicket(ticket); // связка с билетом

            em.persist(commentary); // saving

            tx.commit();
            System.out.println("DONE!");

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();

        } finally {
            em.close();
            JPAUtil.shutdown();
        }
    }
}