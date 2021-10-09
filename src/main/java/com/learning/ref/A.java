import com.learning.ref.*;

class A{
	private int x;
	private B ob;
	public B getOb() {
		return ob;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	protected A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	protected A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}