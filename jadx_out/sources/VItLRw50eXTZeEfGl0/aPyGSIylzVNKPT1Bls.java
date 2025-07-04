package VItLRw50eXTZeEfGl0;

import A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class aPyGSIylzVNKPT1Bls {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public ConcurrentHashMap f1812lEeR5KfoEr4xU5yHH7 = new ConcurrentHashMap();

    public class lEeR5KfoEr4xU5yHH7 implements s3fjYDxWOUexjjVgyA {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
        /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
        public int lEeR5KfoEr4xU5yHH7(TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            return s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm();
        }

        @Override // VItLRw50eXTZeEfGl0.aPyGSIylzVNKPT1Bls.s3fjYDxWOUexjjVgyA
        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: merged with bridge method [inline-methods] */
        public boolean s3fjYDxWOUexjjVgyA(TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            return s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ();
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
        int lEeR5KfoEr4xU5yHH7(Object obj);

        boolean s3fjYDxWOUexjjVgyA(Object obj);
    }

    public static Object KYHag8HRDlnO3X9zmZ(Object[] objArr, int i, boolean z, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        Object obj = null;
        int i2 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(obj2) - i) * 2) + (s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA(obj2) == z ? 0 : 1);
            if (obj == null || i2 > iAbs) {
                obj = obj2;
                i2 = iAbs;
            }
        }
        return obj;
    }

    public static Object husNiw3snxdgZPAGJm(Object[] objArr, int i, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return KYHag8HRDlnO3X9zmZ(objArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, s3fjydxwouexjjvgya);
    }

    public Typeface HJFh0TGMpafqLE9haL(Context context, InputStream inputStream) {
        File fileHusNiw3snxdgZPAGJm = OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm(context);
        if (fileHusNiw3snxdgZPAGJm == null) {
            return null;
        }
        try {
            if (OANkd3mP6AYvwbNLJM.zZKhbgvUfsK4AEX3r0(fileHusNiw3snxdgZPAGJm, inputStream)) {
                return Typeface.createFromFile(fileHusNiw3snxdgZPAGJm.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileHusNiw3snxdgZPAGJm.delete();
        }
    }

    public TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA TCyPEKSzIyweCN5yp1(TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, int i) {
        return (TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA) husNiw3snxdgZPAGJm(s3fjydxwouexjjvgyaArr, i, new lEeR5KfoEr4xU5yHH7());
    }

    public abstract Typeface lEeR5KfoEr4xU5yHH7(Context context, zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, Resources resources, int i);

    public abstract Typeface s3fjYDxWOUexjjVgyA(Context context, CancellationSignal cancellationSignal, TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, int i);

    public Typeface zZKhbgvUfsK4AEX3r0(Context context, Resources resources, int i, String str, int i2) {
        File fileHusNiw3snxdgZPAGJm = OANkd3mP6AYvwbNLJM.husNiw3snxdgZPAGJm(context);
        if (fileHusNiw3snxdgZPAGJm == null) {
            return null;
        }
        try {
            if (OANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL(fileHusNiw3snxdgZPAGJm, resources, i)) {
                return Typeface.createFromFile(fileHusNiw3snxdgZPAGJm.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileHusNiw3snxdgZPAGJm.delete();
        }
    }
}
