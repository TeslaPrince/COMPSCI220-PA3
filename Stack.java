package PA3;
public final class Stack{
	private final java.util.Stack<String> stack;
	public Stack() {
		this.stack = new java.util.Stack<String>();
	}
	public final void push(final String val) {
		this.stack.push(val);
	}
	public final String pop() {
		return this.stack.pop();
	}
	public final String peek() {
		return this.stack.peek();
	}
	public final int size() {
		return this.stack.size();
	}
	public final void clear() {
		this.stack.clear();
	}
}
