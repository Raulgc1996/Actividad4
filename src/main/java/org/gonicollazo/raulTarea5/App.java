package org.gonicollazo.raulTarea5;

import org.gonicollazo.raulTarea5.Dao.DoctorDao;
import org.gonicollazo.raulTarea5.Dao.PatientDao;
import org.gonicollazo.raulTarea5.Models.Doctor;
import org.gonicollazo.raulTarea5.Models.Patient;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Doctor d1 = new Doctor("doc1", "area1");
		Doctor d2 = new Doctor("doc2", "area2");
		Patient p1 = new Patient("pa1", "men");
		Patient p2 = new Patient("pa2", "undefined");
		d1.addPa(p2);
		p2.addDoctor(d1);
		d2.addPa(p1);
		p1.addDoctor(d2);
		
		DoctorDao daod = new DoctorDao();
		PatientDao daop = new PatientDao();
		daod.insert(d1);
		daod.insert(d2);
		daop.insert(p1);
		daop.insert(p2);

	}
}
