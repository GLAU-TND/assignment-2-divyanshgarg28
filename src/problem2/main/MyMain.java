/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(15);
        obj.insert(20);
        obj.insert(32);
        obj.insert(89);
        obj.insert(63);
        obj.insert(40);
        obj.insert(35);
        obj.preVSpost();
    }
}

