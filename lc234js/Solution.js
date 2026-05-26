var isPalindrome = function (head) {
  let slow = head;
  let fast = head;
  while (fast && fast.next) {
    slow = slow.next;
    fast = fast.next.next;
  }
  let prev = null;
  while (slow) {
    let next = slow.next;
    slow.next = prev;
    prev = slow;
    slow = next;
  }
  while (prev) {
    if (prev.val !== head.val) {
      return false;
    }

    prev = prev.next;
    head = head.next;
  }
  return true;
};
