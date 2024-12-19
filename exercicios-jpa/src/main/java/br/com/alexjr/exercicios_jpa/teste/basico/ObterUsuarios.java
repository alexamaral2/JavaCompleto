package br.com.alexjr.exercicios_jpa.teste.basico;

import br.com.alexjr.exercicios_jpa.model.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        //String jpql = "select u from Usuario u";
        //TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        //query.setMaxResults(5);

        List<Usuario> usuarios = em
                .createQuery("select u from Usuario u", Usuario.class)
                .setMaxResults(5)
                .getResultList();

        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId()
                    + " | Nome: " + usuario.getNome()
                    + " | Email: " + usuario.getEmail()
            );
        }

        em.close();
        emf.close();
    }
}
