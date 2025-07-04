package VItLRw50eXTZeEfGl0;

import A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class e54J8UWNHWALQNixXM extends Acstmh57AKoSEkEFNJ {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final Method f1814Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final Constructor f1815IPyIQcaNa8aB7drBED;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public final Method f1816T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Class f1817TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final Method f1818Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final Method f1819e54J8UWNHWALQNixXM;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final Method f1820pbVGzGjWvY2LDXC8vo;

    public e54J8UWNHWALQNixXM() {
        Class clsXHA29AmDt6y96AnB3t;
        Constructor constructorLIMtzhnLwQyigzK0KO;
        Method methodY43RdunnpKgpbny0lE;
        Method methodR9SAhYMerGybF9OAjL;
        Method methodA49QRPHynYLCBN0SqP;
        Method methodSTkWmhpZ5b1ArQIw4K;
        Method methodG7AC3DWIx9i9fdanjk;
        try {
            clsXHA29AmDt6y96AnB3t = xHA29AmDt6y96AnB3t();
            constructorLIMtzhnLwQyigzK0KO = LIMtzhnLwQyigzK0KO(clsXHA29AmDt6y96AnB3t);
            methodY43RdunnpKgpbny0lE = Y43RdunnpKgpbny0lE(clsXHA29AmDt6y96AnB3t);
            methodR9SAhYMerGybF9OAjL = R9SAhYMerGybF9OAjL(clsXHA29AmDt6y96AnB3t);
            methodA49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP(clsXHA29AmDt6y96AnB3t);
            methodSTkWmhpZ5b1ArQIw4K = sTkWmhpZ5b1ArQIw4K(clsXHA29AmDt6y96AnB3t);
            methodG7AC3DWIx9i9fdanjk = G7AC3DWIx9i9fdanjk(clsXHA29AmDt6y96AnB3t);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            clsXHA29AmDt6y96AnB3t = null;
            constructorLIMtzhnLwQyigzK0KO = null;
            methodY43RdunnpKgpbny0lE = null;
            methodR9SAhYMerGybF9OAjL = null;
            methodA49QRPHynYLCBN0SqP = null;
            methodSTkWmhpZ5b1ArQIw4K = null;
            methodG7AC3DWIx9i9fdanjk = null;
        }
        this.f1817TCyPEKSzIyweCN5yp1 = clsXHA29AmDt6y96AnB3t;
        this.f1815IPyIQcaNa8aB7drBED = constructorLIMtzhnLwQyigzK0KO;
        this.f1820pbVGzGjWvY2LDXC8vo = methodY43RdunnpKgpbny0lE;
        this.f1814Acstmh57AKoSEkEFNJ = methodR9SAhYMerGybF9OAjL;
        this.f1818Z9WdNiOsPR0y54zHW4 = methodA49QRPHynYLCBN0SqP;
        this.f1819e54J8UWNHWALQNixXM = methodSTkWmhpZ5b1ArQIw4K;
        this.f1816T9PhQIpGRhE4yZDm1C = methodG7AC3DWIx9i9fdanjk;
    }

    public Method A49QRPHynYLCBN0SqP(Class cls) {
        return cls.getMethod("freeze", null);
    }

    public Method G7AC3DWIx9i9fdanjk(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Constructor LIMtzhnLwQyigzK0KO(Class cls) {
        return cls.getConstructor(null);
    }

    public final boolean OANkd3mP6AYvwbNLJM(Object obj) {
        try {
            return ((Boolean) this.f1818Z9WdNiOsPR0y54zHW4.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method R9SAhYMerGybF9OAjL(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final void T9PhQIpGRhE4yZDm1C(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f1819e54J8UWNHWALQNixXM.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public Method Y43RdunnpKgpbny0lE(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean aPyGSIylzVNKPT1Bls(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f1814Acstmh57AKoSEkEFNJ.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object e54J8UWNHWALQNixXM() {
        try {
            return this.f1815IPyIQcaNa8aB7drBED.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean hoXrIDAFrSwfShk8da(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1820pbVGzGjWvY2LDXC8vo.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // VItLRw50eXTZeEfGl0.Acstmh57AKoSEkEFNJ, VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface lEeR5KfoEr4xU5yHH7(Context context, zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!zaq8hOURtfwbcX17cG()) {
            return super.lEeR5KfoEr4xU5yHH7(context, hJFh0TGMpafqLE9haL, resources, i);
        }
        Object objE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM();
        if (objE54J8UWNHWALQNixXM == null) {
            return null;
        }
        for (zZKhbgvUfsK4AEX3r0.C0000zZKhbgvUfsK4AEX3r0 c0000zZKhbgvUfsK4AEX3r0 : hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7()) {
            if (!hoXrIDAFrSwfShk8da(context, objE54J8UWNHWALQNixXM, c0000zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(), c0000zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(), c0000zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(), c0000zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0000zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0()))) {
                T9PhQIpGRhE4yZDm1C(objE54J8UWNHWALQNixXM);
                return null;
            }
        }
        if (OANkd3mP6AYvwbNLJM(objE54J8UWNHWALQNixXM)) {
            return pbVGzGjWvY2LDXC8vo(objE54J8UWNHWALQNixXM);
        }
        return null;
    }

    public Typeface pbVGzGjWvY2LDXC8vo(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f1817TCyPEKSzIyweCN5yp1, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1816T9PhQIpGRhE4yZDm1C.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // VItLRw50eXTZeEfGl0.Acstmh57AKoSEkEFNJ, VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface s3fjYDxWOUexjjVgyA(Context context, CancellationSignal cancellationSignal, TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefacePbVGzGjWvY2LDXC8vo;
        if (s3fjydxwouexjjvgyaArr.length < 1) {
            return null;
        }
        if (!zaq8hOURtfwbcX17cG()) {
            TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(s3fjydxwouexjjvgyaArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm()).setItalic(s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1.KYHag8HRDlnO3X9zmZ()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapIPyIQcaNa8aB7drBED = OANkd3mP6AYvwbNLJM.IPyIQcaNa8aB7drBED(context, s3fjydxwouexjjvgyaArr, cancellationSignal);
        Object objE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM();
        if (objE54J8UWNHWALQNixXM == null) {
            return null;
        }
        boolean z = false;
        for (TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapIPyIQcaNa8aB7drBED.get(s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0());
            if (byteBuffer != null) {
                if (!aPyGSIylzVNKPT1Bls(objE54J8UWNHWALQNixXM, byteBuffer, s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL(), s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm(), s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ() ? 1 : 0)) {
                    T9PhQIpGRhE4yZDm1C(objE54J8UWNHWALQNixXM);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            T9PhQIpGRhE4yZDm1C(objE54J8UWNHWALQNixXM);
            return null;
        }
        if (OANkd3mP6AYvwbNLJM(objE54J8UWNHWALQNixXM) && (typefacePbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(objE54J8UWNHWALQNixXM)) != null) {
            return Typeface.create(typefacePbVGzGjWvY2LDXC8vo, i);
        }
        return null;
    }

    public Method sTkWmhpZ5b1ArQIw4K(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    public Class xHA29AmDt6y96AnB3t() {
        return Class.forName("android.graphics.FontFamily");
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface zZKhbgvUfsK4AEX3r0(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!zaq8hOURtfwbcX17cG()) {
            return super.zZKhbgvUfsK4AEX3r0(context, resources, i, str, i2);
        }
        Object objE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM();
        if (objE54J8UWNHWALQNixXM == null) {
            return null;
        }
        if (!hoXrIDAFrSwfShk8da(context, objE54J8UWNHWALQNixXM, str, 0, -1, -1, null)) {
            T9PhQIpGRhE4yZDm1C(objE54J8UWNHWALQNixXM);
            return null;
        }
        if (OANkd3mP6AYvwbNLJM(objE54J8UWNHWALQNixXM)) {
            return pbVGzGjWvY2LDXC8vo(objE54J8UWNHWALQNixXM);
        }
        return null;
    }

    public final boolean zaq8hOURtfwbcX17cG() {
        if (this.f1820pbVGzGjWvY2LDXC8vo == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1820pbVGzGjWvY2LDXC8vo != null;
    }
}
