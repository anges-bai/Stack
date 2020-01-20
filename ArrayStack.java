// 基于数组实现的顺序栈
public class ArrayStack {
private String[] items; // 数组
private int count; // 栈中元素个数
private int n; // 栈的⼤⼩
// 初始化数组，申请⼀个⼤⼩为 n 的数组空间
public ArrayStack(int n) {
this.items = new String[n];
this.n = n;
this.count = 0;
 }
// ⼊栈操作
public boolean push(String item) {
// 数组空间不够了，直接返回 false，⼊栈失败。
if (count == n) return false;
// 将 item 放到下标为 count 的位置，并且 count 加⼀
items[count] = item;
++count;
return true;
 }
// 出栈操作
public String pop() {
// 栈为空，则直接返回 null
if (count == 0) return null;
// 返回下标为 count-1 的数组元素，并且栈中元素个数 count 减⼀
String tmp = items[count-1];
--count;
return tmp;
 }
}