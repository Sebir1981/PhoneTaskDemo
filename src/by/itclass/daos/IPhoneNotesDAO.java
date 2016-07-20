package by.itclass.daos;

import by.itclass.common.PhoneNote;

public interface IPhoneNotesDAO {
	void Add(PhoneNote note);
	void Delete(PhoneNote note);
	void Update(PhoneNote note);
	
	PhoneNote findByID(int id);
}
