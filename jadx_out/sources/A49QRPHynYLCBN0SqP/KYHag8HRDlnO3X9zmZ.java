package A49QRPHynYLCBN0SqP;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ThreadLocal f4lEeR5KfoEr4xU5yHH7 = new ThreadLocal();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final WeakHashMap f5s3fjYDxWOUexjjVgyA = new WeakHashMap(0);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Object f3HJFh0TGMpafqLE9haL = new Object();

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final int f6HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final ColorStateList f7lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Configuration f8s3fjYDxWOUexjjVgyA;

        public HJFh0TGMpafqLE9haL(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f7lEeR5KfoEr4xU5yHH7 = colorStateList;
            this.f8s3fjYDxWOUexjjVgyA = configuration;
            this.f6HJFh0TGMpafqLE9haL = theme == null ? 0 : theme.hashCode();
        }
    }

    public static abstract class husNiw3snxdgZPAGJm {
        public static Handler husNiw3snxdgZPAGJm(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void HJFh0TGMpafqLE9haL(final int i, Handler handler) {
            husNiw3snxdgZPAGJm(handler).post(new Runnable() { // from class: A49QRPHynYLCBN0SqP.IPyIQcaNa8aB7drBED
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(i);
                }
            });
        }

        /* renamed from: IPyIQcaNa8aB7drBED, reason: merged with bridge method [inline-methods] */
        public abstract void KYHag8HRDlnO3X9zmZ(int i);

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: merged with bridge method [inline-methods] */
        public abstract void TCyPEKSzIyweCN5yp1(Typeface typeface);

        public final void zZKhbgvUfsK4AEX3r0(final Typeface typeface, Handler handler) {
            husNiw3snxdgZPAGJm(handler).post(new Runnable() { // from class: A49QRPHynYLCBN0SqP.TCyPEKSzIyweCN5yp1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(typeface);
                }
            });
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static Drawable lEeR5KfoEr4xU5yHH7(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable s3fjYDxWOUexjjVgyA(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public static int lEeR5KfoEr4xU5yHH7(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList s3fjYDxWOUexjjVgyA(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    public static final class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Resources f9lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Resources.Theme f10s3fjYDxWOUexjjVgyA;

        public zZKhbgvUfsK4AEX3r0(Resources resources, Resources.Theme theme) {
            this.f9lEeR5KfoEr4xU5yHH7 = resources;
            this.f10s3fjYDxWOUexjjVgyA = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || zZKhbgvUfsK4AEX3r0.class != obj.getClass()) {
                return false;
            }
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) obj;
            return this.f9lEeR5KfoEr4xU5yHH7.equals(zzkhbgvufsk4aex3r0.f9lEeR5KfoEr4xU5yHH7) && tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f10s3fjYDxWOUexjjVgyA, zzkhbgvufsk4aex3r0.f10s3fjYDxWOUexjjVgyA);
        }

        public int hashCode() {
            return tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f9lEeR5KfoEr4xU5yHH7, this.f10s3fjYDxWOUexjjVgyA);
        }
    }

    public static TypedValue Acstmh57AKoSEkEFNJ() {
        ThreadLocal threadLocal = f4lEeR5KfoEr4xU5yHH7;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static Typeface HJFh0TGMpafqLE9haL(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return T9PhQIpGRhE4yZDm1C(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static Typeface IPyIQcaNa8aB7drBED(Context context, int i, TypedValue typedValue, int i2, husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        if (context.isRestricted()) {
            return null;
        }
        return T9PhQIpGRhE4yZDm1C(context, i, typedValue, i2, husniw3snxdgzpagjm, null, true, false);
    }

    public static Drawable KYHag8HRDlnO3X9zmZ(Resources resources, int i, int i2, Resources.Theme theme) {
        return lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(resources, i, i2, theme);
    }

    public static Typeface T9PhQIpGRhE4yZDm1C(Context context, int i, TypedValue typedValue, int i2, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, Handler handler, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(context, resources, typedValue, i, i2, husniw3snxdgzpagjm, handler, z, z2);
        if (typefaceHoXrIDAFrSwfShk8da != null || husniw3snxdgzpagjm != null || z2) {
            return typefaceHoXrIDAFrSwfShk8da;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static Typeface TCyPEKSzIyweCN5yp1(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return T9PhQIpGRhE4yZDm1C(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static ColorStateList Z9WdNiOsPR0y54zHW4(Resources resources, int i, Resources.Theme theme) {
        if (e54J8UWNHWALQNixXM(resources, i)) {
            return null;
        }
        try {
            return A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    public static boolean e54J8UWNHWALQNixXM(Resources resources, int i) throws Resources.NotFoundException {
        TypedValue typedValueAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ();
        resources.getValue(i, typedValueAcstmh57AKoSEkEFNJ, true);
        int i2 = typedValueAcstmh57AKoSEkEFNJ.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface hoXrIDAFrSwfShk8da(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.hoXrIDAFrSwfShk8da(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ$husNiw3snxdgZPAGJm, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static Drawable husNiw3snxdgZPAGJm(Resources resources, int i, Resources.Theme theme) {
        return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(resources, i, theme);
    }

    public static void lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3HJFh0TGMpafqLE9haL) {
            try {
                WeakHashMap weakHashMap = f5s3fjYDxWOUexjjVgyA;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(zzkhbgvufsk4aex3r0);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(zzkhbgvufsk4aex3r0, sparseArray);
                }
                sparseArray.append(i, new HJFh0TGMpafqLE9haL(colorStateList, zzkhbgvufsk4aex3r0.f9lEeR5KfoEr4xU5yHH7.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void pbVGzGjWvY2LDXC8vo(Context context, int i, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, Handler handler) throws Resources.NotFoundException {
        tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(husniw3snxdgzpagjm);
        if (context.isRestricted()) {
            husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL(-4, handler);
        } else {
            T9PhQIpGRhE4yZDm1C(context, i, new TypedValue(), 0, husniw3snxdgzpagjm, handler, false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f6HJFh0TGMpafqLE9haL == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0 r5, int r6) {
        /*
            java.lang.Object r0 = A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.f3HJFh0TGMpafqLE9haL
            monitor-enter(r0)
            java.util.WeakHashMap r1 = A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.f5s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ$HJFh0TGMpafqLE9haL r2 = (A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f8s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f9lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f10s3fjYDxWOUexjjVgyA     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f6HJFh0TGMpafqLE9haL     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f6HJFh0TGMpafqLE9haL     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f7lEeR5KfoEr4xU5yHH7     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ$zZKhbgvUfsK4AEX3r0, int):android.content.res.ColorStateList");
    }

    public static ColorStateList zZKhbgvUfsK4AEX3r0(Resources resources, int i, Resources.Theme theme) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(resources, theme);
        ColorStateList colorStateListS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(zzkhbgvufsk4aex3r0, i);
        if (colorStateListS3fjYDxWOUexjjVgyA != null) {
            return colorStateListS3fjYDxWOUexjjVgyA;
        }
        ColorStateList colorStateListZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(resources, i, theme);
        if (colorStateListZ9WdNiOsPR0y54zHW4 == null) {
            return s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(resources, i, theme);
        }
        lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0, i, colorStateListZ9WdNiOsPR0y54zHW4, theme);
        return colorStateListZ9WdNiOsPR0y54zHW4;
    }
}
