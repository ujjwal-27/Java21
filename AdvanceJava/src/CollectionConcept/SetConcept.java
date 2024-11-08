package CollectionConcept;

import java.util.HashSet;
import java.util.TreeSet;

public class SetConcept {
    public static void main(String[] args) {
        HashSet<Integer> hashObj = new HashSet<>();

        hashObj.add(77);
        hashObj.add(22);
        hashObj.add(77);
        hashObj.add(53);
        hashObj.add(90);
        hashObj.add(88);
        hashObj.add(19);

        System.out.println(hashObj);

        for (int h : hashObj) {
            System.out.println(h);
        }

        System.out.println("-------------------------------------");

        TreeSet<Integer> treeObj = new TreeSet<>();

        treeObj.add(78);
        treeObj.add(27);
        treeObj.add(95);
        treeObj.add(87);
        treeObj.add(50);
        treeObj.add(87);

        System.out.println(treeObj);

        for (int t : treeObj) {
            System.out.println(t);
        }


//        TreeSet<Integer> nums = new TreeSet<>();
//
//        nums.add(71);
//        nums.add(23);
//        nums.add(99);
//        nums.add(99);
//        nums.add(58);
//
//        Iterator<Integer> values = nums.iterator();
//
//        while (values.hasNext()) {
//            System.out.println(values.next());
//        }

//        for (int n : nums) {
//            System.out.println(n);
//        }
//
//        System.out.println(nums);
    }
}
