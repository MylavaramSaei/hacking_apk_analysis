package VItLRw50eXTZeEfGl0;

import A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class Acstmh57AKoSEkEFNJ extends aPyGSIylzVNKPT1Bls {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static Constructor f1793HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static boolean f1794KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static Method f1795husNiw3snxdgZPAGJm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Class f1796s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static Method f1797zZKhbgvUfsK4AEX3r0;

    public static boolean IPyIQcaNa8aB7drBED(Object obj, String str, int i, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Z9WdNiOsPR0y54zHW4();
        try {
            return ((Boolean) f1797zZKhbgvUfsK4AEX3r0.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Z9WdNiOsPR0y54zHW4() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1794KYHag8HRDlnO3X9zmZ) {
            return;
        }
        f1794KYHag8HRDlnO3X9zmZ = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f1793HJFh0TGMpafqLE9haL = constructor;
        f1796s3fjYDxWOUexjjVgyA = cls;
        f1797zZKhbgvUfsK4AEX3r0 = method2;
        f1795husNiw3snxdgZPAGJm = method;
    }

    private static Object e54J8UWNHWALQNixXM() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Z9WdNiOsPR0y54zHW4();
        try {
            return f1793HJFh0TGMpafqLE9haL.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface pbVGzGjWvY2LDXC8vo(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Z9WdNiOsPR0y54zHW4();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f1796s3fjYDxWOUexjjVgyA, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1795husNiw3snxdgZPAGJm.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public final File Acstmh57AKoSEkEFNJ(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface lEeR5KfoEr4xU5yHH7(Context context, zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Resources resources, int i) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM();
        for (zZKhbgvUfsK4AEX3r0.C0000zZKhbgvUfsK4AEX3r0 c0000zZKhbgvUfsK4AEX3r0 : hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7()) {
            File fileHusNiw3snxdgZPAGJm = OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm(context);
            if (fileHusNiw3snxdgZPAGJm == null) {
                return null;
            }
            try {
                if (!OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL(fileHusNiw3snxdgZPAGJm, resources, c0000zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA())) {
                    return null;
                }
                if (!IPyIQcaNa8aB7drBED(objE54J8UWNHWALQNixXM, fileHusNiw3snxdgZPAGJm.getPath(), c0000zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(), c0000zZKhbgvUfsK4AEX3r0.KYHag8HRDlnO3X9zmZ())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileHusNiw3snxdgZPAGJm.delete();
            }
        }
        return pbVGzGjWvY2LDXC8vo(objE54J8UWNHWALQNixXM);
    }

    @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls
    public Typeface s3fjYDxWOUexjjVgyA(Context context, CancellationSignal cancellationSignal, TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, int i) throws IOException {
        if (s3fjydxwouexjjvgyaArr.length < 1) {
            return null;
        }
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
                File fileAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(parcelFileDescriptorOpenFileDescriptor);
                if (fileAcstmh57AKoSEkEFNJ != null && fileAcstmh57AKoSEkEFNJ.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileAcstmh57AKoSEkEFNJ);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceHJFh0TGMpafqLE9haL = super.HJFh0TGMpafqLE9haL(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceHJFh0TGMpafqLE9haL;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
