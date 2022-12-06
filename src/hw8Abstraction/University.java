package hw8Abstraction;

public interface University {
	// we can not create constructor inside interfaces
	// Because interfaces are public static final by default  
	//they are constant
	public void classSize();
	public void playGround();
	public void teacher();

}
