package by.itclass.common;

public class PhoneNote {
	private int id;
	private String name;
	private String surname;
	private PhoneNumber number;
	private TagType tag;
	
	public PhoneNote(int id, String name, String surname,
					PhoneNumber number, TagType tag) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.tag = tag;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public PhoneNumber getNumber() {
		return number;
	}
	public void setNumber(PhoneNumber number) {
		this.number = number;
	}
	public TagType getTag() {
		return tag;
	}
	public void setTag(TagType tag) {
		this.tag = tag;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj.getClass() != PhoneNote.class) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		PhoneNote other = (PhoneNote)obj;
		if (this.id != other.id) {
			return false;
		} else {
			return true;
		}
	}
}
