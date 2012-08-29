package examples.base;

import java.util.List;

public interface Dao<T> {

	public void add(T obj);

	public List<T> findAll();
}
