package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private int element_num = 0;

    @Override
    public boolean add(int num) {
        this.element_num++;
        return super.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));  // Use add() of InheritanceSortedIntList
        }
        return true;    
    }

    
    public int getTotalAdded(){
        System.out.printf("%d", this.element_num);
        return this.element_num;
    }
}