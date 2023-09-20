package org.edu_leetcode.easy.Merge_Two_Sorted_Lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsSolutionTest {

    private final MergeTwoSortedListsSolution solution = new MergeTwoSortedListsSolution();

    // Test case 1: Both lists are empty
    @Test
    void testMergeTwoListsEmptyLists() {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode merged = solution.mergeTwoLists(list1, list2);
        assertNull(merged);
    }

    // Test case 2: One list is empty, the other is not
    @Test
    void testMergeTwoListsOneEmpty(){
        ListNode list1 = null;
        ListNode list2 = new ListNode(1);
        ListNode merged = solution.mergeTwoLists(list1, list2);
        assertEquals(list2, merged);
    }

    // Test case 3: Both lists have some elements
    @Test
    void testMergeTwoLists(){
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode merged = solution.mergeTwoLists(list1, list2);
        assertTrue(areListsEqual(expected, merged));
    }

    // Help method to check if two linked lists are equal
    private boolean areListsEqual(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1 == null && list2 == null;
    }
}
