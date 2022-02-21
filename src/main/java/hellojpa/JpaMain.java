package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
            //필드와 컬럼 매핑에 대해서 공부한 코드입니다. 주로 Member.java클래스에서 공부했습니다.
            Member member = new Member();
            member.setId(3L);
            member.setUsername("AAA");
            member.setRoleType(RoleType.ADMIN);
            em.persist(member);

            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();

















    }
}
