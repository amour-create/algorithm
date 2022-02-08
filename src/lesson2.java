public class lesson2 {
    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        L1.next = new ListNode(1);
        L1.next.next = new ListNode(1);

        ListNode L2 = new ListNode(1);
        L2.next = new ListNode(1);
        L2.next.next = new ListNode(1);

        System.out.println(L1.next.next.val);
        ListNode res = Solution.addTwoNumbers(L1, L2);
        System.out.println(res);
    }
}

