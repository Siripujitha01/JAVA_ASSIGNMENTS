package Points;

public class Point2D {
	private float x=0.0f;
	private float y=0.0f;
	float[] arr=new float[3];
	public Point2D(float x1,float y1)
	{
	x=x1;
	y=y1;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setXY(){
		this.arr[0]=x;
		this.arr[1]=y;
	}
	public float[] getXY()
	{
		return arr;
	}
	public String toString()
	{
		return "\""+"("+x+","+y+")"+"\"";
	}

}
