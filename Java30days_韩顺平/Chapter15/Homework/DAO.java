package Java30days_韩顺平.Chapter15.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO<T> {
    private Map<String,T> map = new HashMap<>();
    public void save(String id,T entity){
       map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    //遍历map，将map的value()封装到Arraylist
    public List<T> list() {
        ArrayList<T> tlist = new ArrayList<>();
        for (T o :map.values()){
             tlist.add(o);
        }return tlist;
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public void delete(String id){
        map.remove(id);
    }
}
