
class Day3 {
  public static void main(String args[]) {
    CustomStack obj = new CustomStack(3);
    obj.push(1);
    obj.push(2);
    obj.push(3);
    int param_2 = obj.pop();
    System.out.println(obj);
    System.out.println(param_2);
    obj.increment(3, 3);
    System.out.println(obj);
  }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
class CustomStack {
  int stack[];
  int max;
  int pop;

  public CustomStack(int maxSize) {
    stack = new int[maxSize];
    max = maxSize;
    pop = 0;
  }

  public void push(int x) {
    if (pop < max)
    {stack[pop] = x;
    pop++;}
  }

  public int pop() {
      if(pop>0)
      {int res = stack[--pop];
        stack[pop] = 0;
        return res;}
      else
        return -1;
    }

  public void increment(int k, int val) {
    for (int i = 0; i < (k < max ? k : max); i++) {
      stack[i] += val;
    }

  }

  public String toString() {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < max; i++) {
      res.append(stack[i] + " ");
    }
    return res.toString();
  }
}