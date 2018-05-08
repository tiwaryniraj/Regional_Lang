class StaticClassExample {

 private String first;
 private String last;
 private static int members = 0;

 public StaticClassExample(String fn, String ln) {
  first = fn;
  last = ln;
  members++;
  System.out.println("Members in the club :" + members);
 }

 public String getfirst() {
  return first;
 }

 public String getlast() {
  return last;
 }

 public static int getmembers() {
  return members;
 }
}

class MainClass {

 public static void main(String args[]) {

  StaticClassExample obj1 = new StaticClassExample("Abc", "Bcd");
  StaticClassExample obj2 = new StaticClassExample("Cde", "Def");
  StaticClassExample obj3 = new StaticClassExample("Efg", "Fgh");

  System.out.println(obj2.getfirst());
  System.out.println(StaticClassExample.getmembers());
 }
}
