//Persistent Bugger: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec Complete

class Persist {
  public static int persistence(long n) {
    if(n < 10) return 0;
    return recursive(n, 0);
  }

  public static int recursive(long n, int cnt) {
    if(n < 10) {
      return cnt;
    }
    String s = String.valueOf(n);
    long sum = 1;
    for (char c : s.toCharArray()) {
      sum *= c - '0';
    }
    return recursive(sum, cnt + 1);
  }
}