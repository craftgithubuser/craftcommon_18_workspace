package abdi;

public class ComAbdi {int height, weight;
  public ComAbdi(int height, int weight) {
    this.height = height;
    this.weight = weight;
  }
  public int getHeight(){
    return height;
  }
  public int getWeight(){
    return weight;
  }
  public static void main(String[] args) {
    ComAbdi a = new ComAbdi(6,182);
    System.out.println(" h is " + a.getHeight());
    System.out.println(" w is " + a.getWeight());

	}

}
