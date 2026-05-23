var isHappy = function (n) {
  if (n === 1) return true;
  let set = new Set();
  while (!set.has(n)) {
    set.add(n);
    let sum = 0;
    while (n > 0) {
      let digit = n % 10;
      sum += digit * digit;
      n = Math.floor(n / 10);
    }
    if (sum === 1) return true;
    n = sum;
  }
  return false;
};
