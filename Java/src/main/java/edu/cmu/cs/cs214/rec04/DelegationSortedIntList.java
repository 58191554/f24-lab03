package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// public class DelegationSortedIntList implements IntegerList{
//     // Write your implementation below with API documentation
//     private final SortedIntList sortedlist;
//     private int element_num = 0;

//     public DelegationSortedIntList(){
//         this.sortedlist = new SortedIntList();
//     }

//     @Override
//     public boolean add(int num) {
//         this.element_num++;
//         return this.sortedlist.add(num);
//     }

//     @Override
//     public boolean addAll(IntegerList list) {
//         for(int i = 0; i < list.size(); i++){
//             this.add(list.get(i));
//         }
//         return true;
//     }

//     @Override
//     public int get(int index) {
//         return this.sortedlist.get(index);
//     }

//     @Override
//     public int size() {
//         return this.sortedlist.size();
//     }

//     @Override
//     public boolean remove(int num) {
//         return this.remove(num);
//     }

//     @Override
//     public boolean removeAll(IntegerList list) {
//         return this.sortedlist.removeAll(list);
//     }

//     public int getTotalAdded(){
//         return this.element_num;
//     }
// }