package jpa;

public interface CineDAO {

	Cine read(int id);

	void create(Cine cine);

	void update(Cine cine);

	void delete(Cine cine);

}