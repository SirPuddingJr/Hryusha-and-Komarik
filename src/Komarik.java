import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Komarik {

  private String name;
  private CopyOnWriteArrayList<Integer> list;

  public Komarik(String name) {
    this.name = name;
    this.list = new CopyOnWriteArrayList<>();
    for (int i = 0; i < 150; i++) {
      list.add(ThreadLocalRandom.current().nextInt(0, 121));

    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CopyOnWriteArrayList<Integer> getList() {
    return list;
  }

  public void setList(CopyOnWriteArrayList<Integer> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "Komarik{" +
            "name='" + name + '\'' +
            ", list=" + list +
            '}';
  }
}
