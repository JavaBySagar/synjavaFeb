import java.util.List;
import java.util.function.Predicate;

public interface Manager<T> {
	public List<T> getList();
	public default void insert(T t) {
		getList().add(t);
	}
	public default void delete( Predicate<T> t) {
		getList().removeIf(t);
	}
	public void update(T t) ;
}
