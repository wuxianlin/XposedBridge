package android.content.res;

/**
 * This class is used on non-MIUI ROMs only and shouldn't have any negative impact on them.
 * On MIUI ROM, this class is never seen because the ROM's class hides it (this is intended).
 * @hide
 */
public class MiuiTypedArray extends TypedArray {
	/** Dummy, will never be called (objects are transferred to this class only). */
	/*package*/ MiuiTypedArray(Resources resources, int[] data, int[] indices, int len) {
		super(null, null, null, 0);
		throw new UnsupportedOperationException();
    }

}
