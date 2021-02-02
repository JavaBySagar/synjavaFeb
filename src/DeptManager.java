import java.util.ArrayList;
import java.util.List;

public class DeptManager implements Manager<Dept>{

	private List<Dept> list = new ArrayList<>();

@Override
public List<Dept> getList() {
	// TODO Auto-generated method stub
	return list;
}

public void update(Dept t) {
	for (Dept dept : list) {
		if (dept.getDeptno() == t.getDeptno()) {
			dept.setDname(t.getDname());
			dept.setLoc(t.getLoc());
			break;
		}
	}
}

public static void main(String[] args) {
	DeptManager mgr =new DeptManager();
	for (int i =10;i < 50;i+=10){
		Dept d= new Dept();
		d.setDeptno(i);
		d.setDname("Dnameof"+i);
		if (i %20==0)
				d.setLoc("Pune");
		else
				d.setLoc("Hyd");
		mgr.insert(d);
	}
	mgr.delete((d)->d.getDeptno()==20);
	Dept d= new Dept();
	d.setDeptno(10);
	d.setDname("HR");d.setLoc("BLR" );
	mgr.update(d);
	mgr.getList().forEach(System.out::println);
}	
}
