package test.com.univ;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.univ.*;

/**
 * Hello world!
 *
 */
		public class App
		{
			public static void main( String[] args )
			{
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
				EntityManager entityManager = emf.createEntityManager();

				EntityTransaction tx = entityManager.getTransaction();

				try{

					tx.begin();

					Person p = new Person();
					p.setName("Tintin");
					Person q = new Person();
					p.setName("Wangyu");

					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					Date beginDate = dateFormat.parse("23/09/2015");
				Date endDate = dateFormat.parse("23/09/2019");
					Date qDate = dateFormat.parse("23/10/2017");
					p.setDate(beginDate);
					q.setDate(qDate);

					entityManager.persist(p);
					entityManager.persist(q);
					Vehicule v1=new Vehicule();
					v1.setPlateNumber("FR948");
					entityManager.persist(v1);
					Car c1 = new Car();
					c1.setNumberOfSeats(4);
					c1.setPlateNumber("FR994");
					entityManager.persist(c1);
					Van van1 =new Van();
					van1.setMaxWeight(500);
					van1.setPlateNumber("CG5590");
					entityManager.persist(van1);

					Rent r1 =new Rent();
					r1.setBeginRent(beginDate);
					r1.setEndRent(endDate);
					r1.setVehicule(c1);
					p.addRents(r1);
					entityManager.persist(r1);









					tx.commit();

				}catch(Exception e){
					tx.rollback();
				}

			}
		}

