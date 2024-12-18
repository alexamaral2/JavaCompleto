package br.com.alexjr.exercicios_jpa.teste.basico;

import br.com.alexjr.exercicios_jpa.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UsuarioTeste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario("Alex Jr", "alexjr@example.com");

        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

        System.out.println("Usuário salvo: " + usuario);

        em.close();
        emf.close();
    }
}
