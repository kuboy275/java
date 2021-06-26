package DOAN;

import java.util.List;

public interface CrudFeature {
	
	public void display(List<Drinks> list );
	public void save(List<Drinks> list);
	public void add(List<Drinks> list);
	public void edit(List<Drinks> list , int i);
	public void delete(List<Drinks> list , int i);

}
