var containsNearbyDuplicate = function (nums, k) {
  const vf = new Map();
  for (let i = 0; i < nums.length; i++) {
    if (vf.has(nums[i]) && i - vf.get(nums[i]) <= k) {
      return true;
    }
    vf.set(nums[i], i);
  }
  return false;
};
