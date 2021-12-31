package Points;

public class Point3D extends Point2D{
	private float z=0.0f;
	public Point3D(float x1,float y1,float z1)
	{
		super(x1,y1);
		z=z1;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(){
		this.arr[2]=z;
	}
	public float[] getXYZ()
	{
		return arr;
	}
	public String toStrings()
	{
		return "\""+"("+getX()+","+getY()+","+z+")"+"\"";
	}


}
