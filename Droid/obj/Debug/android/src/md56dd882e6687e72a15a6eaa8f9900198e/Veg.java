package md56dd882e6687e72a15a6eaa8f9900198e;


public class Veg
	extends md56dd882e6687e72a15a6eaa8f9900198e.RestaurantCustomer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("SushEat.Droid.Veg, SushEat.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Veg.class, __md_methods);
	}


	public Veg ()
	{
		super ();
		if (getClass () == Veg.class)
			mono.android.TypeManager.Activate ("SushEat.Droid.Veg, SushEat.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}