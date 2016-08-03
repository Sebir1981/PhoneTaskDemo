package by.itclass.daos;

import java.util.ArrayList;
import java.util.Comparator;

import by.itclass.common.PhoneNote;

public class PhoneNotesMemory implements IPhoneNotesDAO {

	private ArrayList<PhoneNote> notes;
	
	public PhoneNotesMemory() {
		notes = new ArrayList<PhoneNote>();
	}
	
	@Override
	public void Add(PhoneNote note) {
		boolean exists = notes.contains(note);
		if (exists) {
			throw new IllegalArgumentException("Такой номер уже существует");
		} else {
			notes.add(note);
		}
	}

	@Override
	public void Delete(PhoneNote note) {
		boolean exists = notes.contains(note);
		if (exists) {
			notes.remove(note);
		} else {
			throw new IllegalArgumentException("Такой номер не существует");			
		}

	}

	@Override
	public void Update(PhoneNote note) {
		PhoneNote temp = FindByID(note.getId());
		int index = notes.indexOf(temp);
		notes.set(index, note);
	}

	@Override
	public PhoneNote FindByID(int id) {
		PhoneNote temp = null;
		for (PhoneNote phoneNote : notes) {
			if (phoneNote.getId() == id) {
				temp = phoneNote;
				break;
			}
		}
		return temp;
	}

	@Override
	public PhoneNote[] AllNotes() {
		PhoneNote[] arr = notes.toArray(new PhoneNote[notes.size()]);
		return arr;
	}

	@Override
	public void Sort(Comparator<PhoneNote> comp) {
		notes.sort(comp);
		
	}
	
	

}
