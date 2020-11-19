import java.util.*;
public class ClassA {
    Random rand = new Random();
    public void method1(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        System.out.println(intNumb);
    }
    public void method2(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        System.out.println("\nNormal List " + intNumb);
        Collections.reverse(intNumb);
        System.out.println("Reversed list: " + intNumb);
    }
    public void method3(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        Collections.sort(intNumb);
        System.out.println("Increasing align numbers of list: " + intNumb);
    }
    public void method4(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        Collections.sort(intNumb, Collections.reverseOrder());
        System.out.println("Decreasing align numbers of list: " + intNumb);
    }
    public void method5(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        System.out.println("The first list: " + intNumb);
        intNumb.add(rand.nextInt(70));
        intNumb.add(rand.nextInt(70));
        intNumb.add(rand.nextInt(70));
        System.out.println("3 numbers added into the list at the end: " + intNumb);
    }
    public void method6(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        System.out.println("without element adding" + intNumb);
        for (int i = 0; i <= 4; i++){
            if((i+1) % 2 == 0 | (i+1) % 3 == 0 | (i+1) % 4 == 0){
                intNumb.add(i++, rand.nextInt(70));
            }
        }
        System.out.println("element added after index" + intNumb);
    }
    public void method7(){
        Scanner sc = new Scanner(System.in);
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        System.out.println("without element adding" + intNumb);
        System.out.println("Enter the index number:\n");
        int inpt1 = sc.nextInt();
        for (int i = 0; i <= 4; i++){
            if((i+1) % inpt1 == 0){
                intNumb.add(i++, rand.nextInt(70));
            }
        }
        System.out.println("element added after index" + intNumb);
    }
    public void method8(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        System.out.println("List before delete first 3 numbers: " + intNumb);
        intNumb.remove(0);
        intNumb.remove(0);
        intNumb.remove(0);
        System.out.println("Deleted first 3 numbers from the list: " + intNumb);
    }
    public void method11(){
        List<Integer> intNumb = new ArrayList<>();
        for (int i = 0; i <= 4; i++){
            intNumb.add(rand.nextInt(70));
        }
        System.out.println("List before delete element which is equal to 30" + intNumb);
        for (int i = 0; i <= intNumb.size() -1 ; i++){
            if (intNumb.get(i) == 30){
                intNumb.remove(intNumb.get(i));
            }
        }
        System.out.println("List after delete element which is equal to 30" + intNumb);
    }
}
