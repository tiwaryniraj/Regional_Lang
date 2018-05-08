class PassingParametersToMethod {

 public static void main(String args[]) {
  TestObject obj = new TestObject();
  obj.printMessage("Hello World !!");
 }

}

class TestObject {

 String message;

 void printMessage(String text) {
  message = text;
  System.out.println(message);
 }

}
