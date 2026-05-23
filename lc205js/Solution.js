var isIsomorphic = function (s, t) {
  const mapS = new Map(),
    mapT = new Map();
  for (let i = 0; i < s.length; i++) {
    let c1 = s[i],
      c2 = t[i];
    if (!mapS.has(c1)) mapS.set(c1, c2);
    if (!mapT.has(c2)) mapT.set(c2, c1);
    if (mapS.get(c1) != c2 || mapT.get(c2) != c1) return false;
  }
  return true;
};
