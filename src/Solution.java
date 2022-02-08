public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result = 0;
        int carry = 1;
        ListNode r1 = l1.next;
        ListNode r2 = l2.next;
        result = l1.val;
        while (r1 != null) {
            result += r1.val * (10^carry);
            r1 = r1.next;
            carry++;
        }
        System.out.println(result);
        System.out.println(carry);
        result += l2.val;
        carry = 1;
        while (r2 != null) {
            result += r2.val * (10^carry);
            r1 = r2.next;
            carry++;
        }
        System.out.println(result);
        ListNode res = new ListNode(0);
        ListNode r = res;
        while (result != 0) {
            r.val = result % 10;
            result = result / 10;
            if (r.next != null)
                r = r.next;
        }
        return res;
    }

}
