package by.itclass.daos;

import java.util.ArrayList;

import by.itclass.common.PhoneNote;

public class PhoneNotesMemory implements IPhoneNotesDAO {

	private ArrayList<PhoneNote> notes;
	
	public PhoneNotesMemory() {
		notes = new ArrayList<PhoneNote>();
	}
	
	@Override
	public void Add(PhoneNote note) {
		
	}

	@Override
	public void Delete(PhoneNote note) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update(PhoneNote note) {
		// TODO Auto-generated method stub

	}

	@Override
	public PhoneNote findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
