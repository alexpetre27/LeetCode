function hasCommonElement(a, b) {
  const elementsInA = new Set(a);
  for (let j = 0; j < b.length; j++) {
    if (elementsInA.has(b[j])) {
      return true;
    }
  }
  return false;
}
