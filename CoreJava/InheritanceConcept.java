import calculator.AdvCalc;

public class InheritanceConcept {
   public static void main(String[] args) {
       AdvCalc calc = new AdvCalc();



       int add = calc.add(5, 7);
       int subtract = calc.subtract(5, 7);
       int multiply = calc.multiply(5, 7);
       int divide = calc.divide(5, 7);

       System.out.println(add + " " + subtract);
       System.out.println(multiply + " " + divide);
   }
}
