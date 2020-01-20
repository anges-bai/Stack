// ⽀持动态扩容的顺序栈
public class ArrayStack {
private Object[] items; // 数组
private int count; // 栈中元素个数
private int n; // 栈的⼤⼩
// 初始化数组，申请⼀个⼤⼩为 n 的数组空间
public ArrayStack(int n) {
this.items = new Object[n];
this.n = n;
this.count = 0;
 }
// ⼊栈操作
public boolean push(Object item) {
// 数组空间不够时，数组扩容
if (count == n) {
int oldCount = n;
int newCount = oldCount << 1;
// 栈⼤⼩已经超过int的最⼤值
if (((newCount + 8) - Integer.MAX_VALUE) > 0) {
return false;
 }
// 数组扩容
n = newCount;
items = Arrays.copyOf(items,newCount);
 }
// 将 item 放到下标为 count 的位置，并且 count 加⼀
items[count] = item;
++count;
return true;
 }
// 出栈操作
public Object pop() {
// 栈为空，则直接返回 null
if (count == 0) return null;
// 返回下标为 count-1 的数组元素，并且栈中元素个数 count 减⼀
Object tmp = items[count-1];
--count;
return tmp;
 }
public static void main(String[] args) {
ArrayStack stack = new ArrayStack(1);
stack.push(1);
stack.push(3);
stack.push(5);
System.out.println(stack.pop());
 }
}
