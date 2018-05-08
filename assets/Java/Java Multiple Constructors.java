
class MultipleConstructorsExample {
 public static void main(String args[]) {
  SampleObject obj = new SampleObject();
  SampleObject obj2 = new SampleObject(12);
  SampleObject obj3 = new SampleObject(12, 13);
  SampleObject obj4 = new SampleObject(12, 13, 14);

  System.out.println(obj.num1 + ", " + obj.num2 + ", " + obj.num3);
  System.out.println(obj2.num1 + ", " + obj2.num2 + ", " + obj2.num3);
  System.out.println(obj3.num1 + ", " + obj3.num2 + ", " + obj3.num3);
  System.out.println(obj4.num1 + ", " + obj4.num2 + ", " + obj4.num3);

 }
}

class SampleObject {
 int num1 = 0;
 int num2 = 0;
 int num3 = 0;

 SampleObject() {
  this.num1 = 1;
 }
 SampleObject(int num1) {
  this.num1 = num1;
 }
 SampleObject(int num1, int num2) {
  this.num1 = num1;
  this.num2 = num2;
 }
 SampleObject(int num1, int num2, int num3) {
  this.num1 = num1;
  this.num2 = num2;
  this.num3 = num3;
 }
}
