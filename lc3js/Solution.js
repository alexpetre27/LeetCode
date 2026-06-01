var lengthOfLongestSubstring = function (s) {
  const set = new Set();
  let left = 0,
    maxLength = 0;
  for (let r = 0; r < s.length; ++r) {
    while (set.has(s.charAt(r))) {
      set.delete(s.charAt(left));
      left++;
    }
    set.add(s.charAt(r));
    maxLength = Math.max(maxLength, r - left + 1);
  }
  return maxLength;
};
