class Bag {
  int[] values;
  String getString() {
    String res = "";
<<<<<<< /tmp/left7337095501163286766.java
    String sep = ",";
=======
    String sep = ";";
>>>>>>> /tmp/right4520139882411665154.java
    for (int v : values) {
      res += v + sep;
    }
    return res;
  }
  Bag(int[] v) {
    values = v;
  }
}
