var lengthOfLastWord = function (s) {
  let k = 0;
  for (let i = s.length - 1; i >= 0; --i) {
    if (s[i] === " ") {
      if (k > 0) return k;
    } else {
      k++;
    }
  }
  return k;
};
