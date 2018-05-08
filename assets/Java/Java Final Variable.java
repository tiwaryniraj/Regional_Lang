class FinalVariableExample {
    
 public static void main(String args[]) {
     
  TestClass obj = new TestClass();
  // Following statement is not possible, since num is a final variable
  // obj.num=7;
  System.out.println(obj.num);
  
 }
 
}

class TestClass {
 //num cant be changed throughout the program
 final int num = 5;
}
