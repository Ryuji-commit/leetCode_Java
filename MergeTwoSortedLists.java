public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode cur = null;
        ListNode bk = null;
        if (list1.val <= list2.val) {
            cur = list1;
            bk = list2;
        } else {
            cur = list2;
            bk = list1;
        }
        ListNode first = cur;

        while (true) {
            if (bk == null) {
                break;
            } else if (cur.next == null) {
                cur.next = bk;
                break;
            }

            if (cur.next.val <= bk.val) {
                cur = cur.next;
            } else {
                ListNode temp = cur.next;
                cur.next = bk;
                bk = temp;
            }
        }

        return first;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
