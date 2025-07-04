package VItLRw50eXTZeEfGl0;

import A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class Z9WdNiOsPR0y54zHW4 extends aPyGSIylzVNKPT1Bls {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Constructor f1808HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Method f1809husNiw3snxdgZPAGJm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Class f1810s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final Method f1811zZKhbgvUfsK4AEX3r0;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f1808HJFh0TGMpafqLE9haL = constructor;
        f1810s3fjYDxWOUexjjVgyA = cls;
        f1811zZKhbgvUfsK4AEX3r0 = method2;
        f1809husNiw3snxdgZPAGJm = method;
    }

    public static boolean Acstmh57AKoSEkEFNJ() {
        Method method = f1811zZKhbgvUfsK4AEX3r0;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static boolean IPyIQcaNa8aB7drBED(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1811zZKhbgvUfsK4AEX3r0.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Object Z9WdNiOsPR0y54zHW4() {
        try {
            return f1808HJFh0TGMpafqLE9haL.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Typeface pbVGzGjWvY2LDXC8vo(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f1810s3fjYDxWOUexjjVgyA, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1809husNiw3snxdgZPAGJm.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface lEeR5KfoEr4xU5yHH7(Context context, zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Resources resources, int i) {
        Object objZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4();
        if (objZ9WdNiOsPR0y54zHW4 == null) {
            return null;
        }
        for (zZKhbgvUfsK4AEX3r0.C0000zZKhbgvUfsK4AEX3r0 c0000zZKhbgvUfsK4AEX3r0 : hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7()) {
            ByteBuffer byteBufferS3fjYDxWOUexjjVgyA = OANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA(context, resources, c0000zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA());
            if (byteBufferS3fjYDxWOUexjjVgyA == null || !IPyIQcaNa8aB7drBED(objZ9WdNiOsPR0y54zHW4, byteBufferS3fjYDxWOUexjjVgyA, c0000zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(), c0000zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(), c0000zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ())) {
                return null;
            }
        }
        return pbVGzGjWvY2LDXC8vo(objZ9WdNiOsPR0y54zHW4);
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface s3fjYDxWOUexjjVgyA(Context context, CancellationSignal cancellationSignal, TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, int i) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4();
        if (objZ9WdNiOsPR0y54zHW4 == null) {
            return null;
        }
        Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1();
        for (TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
            Uri uriZZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0();
            ByteBuffer byteBufferKYHag8HRDlnO3X9zmZ = (ByteBuffer) tCyPEKSzIyweCN5yp1.get(uriZZKhbgvUfsK4AEX3r0);
            if (byteBufferKYHag8HRDlnO3X9zmZ == null) {
                byteBufferKYHag8HRDlnO3X9zmZ = OANkd3mP6AYvwbNLJM.KYHag8HRDlnO3X9zmZ(context, cancellationSignal, uriZZKhbgvUfsK4AEX3r0);
                tCyPEKSzIyweCN5yp1.put(uriZZKhbgvUfsK4AEX3r0, byteBufferKYHag8HRDlnO3X9zmZ);
            }
            if (byteBufferKYHag8HRDlnO3X9zmZ == null || !IPyIQcaNa8aB7drBED(objZ9WdNiOsPR0y54zHW4, byteBufferKYHag8HRDlnO3X9zmZ, s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL(), s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm(), s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ())) {
                return null;
            }
        }
        Typeface typefacePbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(objZ9WdNiOsPR0y54zHW4);
        if (typefacePbVGzGjWvY2LDXC8vo == null) {
            return null;
        }
        return Typeface.create(typefacePbVGzGjWvY2LDXC8vo, i);
    }
}
