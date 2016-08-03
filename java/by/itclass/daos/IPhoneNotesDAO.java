package by.itclass.daos;

import java.util.Comparator;

import by.itclass.common.PhoneNote;

public interface IPhoneNotesDAO {
	void Add(PhoneNote note);
	void Delete(PhoneNote note);
	void Update(PhoneNote note);
	
	PhoneNote FindByID(int id);
	
	PhoneNote[] AllNotes();
	
	void Sort(Comparator<PhoneNote> comp);
}
