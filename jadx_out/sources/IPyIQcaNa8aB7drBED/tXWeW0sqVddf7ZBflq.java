package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class tXWeW0sqVddf7ZBflq {

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static tXWeW0sqVddf7ZBflq f714pbVGzGjWvY2LDXC8vo;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED f715HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f716KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f717TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public TypedValue f718husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public WeakHashMap f719lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 f720s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final WeakHashMap f721zZKhbgvUfsK4AEX3r0 = new WeakHashMap(0);

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final PorterDuff.Mode f713IPyIQcaNa8aB7drBED = PorterDuff.Mode.SRC_IN;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f712Acstmh57AKoSEkEFNJ = new lEeR5KfoEr4xU5yHH7(6);

    public interface HJFh0TGMpafqLE9haL {
        ColorStateList HJFh0TGMpafqLE9haL(Context context, int i);

        PorterDuff.Mode husNiw3snxdgZPAGJm(int i);

        boolean lEeR5KfoEr4xU5yHH7(Context context, int i, Drawable drawable);

        Drawable s3fjYDxWOUexjjVgyA(tXWeW0sqVddf7ZBflq txwew0sqvddf7zbflq, Context context, int i);

        boolean zZKhbgvUfsK4AEX3r0(Context context, int i, Drawable drawable);
    }

    public static class lEeR5KfoEr4xU5yHH7 extends Z9WdNiOsPR0y54zHW4.husNiw3snxdgZPAGJm {
        public lEeR5KfoEr4xU5yHH7(int i) {
            super(i);
        }

        public static int IPyIQcaNa8aB7drBED(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter Acstmh57AKoSEkEFNJ(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) zZKhbgvUfsK4AEX3r0(Integer.valueOf(IPyIQcaNa8aB7drBED(i, mode)), porterDuffColorFilter);
        }

        public PorterDuffColorFilter pbVGzGjWvY2LDXC8vo(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) HJFh0TGMpafqLE9haL(Integer.valueOf(IPyIQcaNa8aB7drBED(i, mode)));
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
        Drawable lEeR5KfoEr4xU5yHH7(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static void G7AC3DWIx9i9fdanjk(Drawable drawable, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = e2f9f6h8yjxthwlca0.f676zZKhbgvUfsK4AEX3r0;
        if (z || e2f9f6h8yjxthwlca0.f673HJFh0TGMpafqLE9haL) {
            drawable.setColorFilter(KYHag8HRDlnO3X9zmZ(z ? e2f9f6h8yjxthwlca0.f674lEeR5KfoEr4xU5yHH7 : null, e2f9f6h8yjxthwlca0.f673HJFh0TGMpafqLE9haL ? e2f9f6h8yjxthwlca0.f675s3fjYDxWOUexjjVgyA : f713IPyIQcaNa8aB7drBED, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public static PorterDuffColorFilter KYHag8HRDlnO3X9zmZ(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return Z9WdNiOsPR0y54zHW4(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static boolean OANkd3mP6AYvwbNLJM(Drawable drawable) {
        return (drawable instanceof k0CbjZvfUz23r8IN6W.s3fjYDxWOUexjjVgyA) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static synchronized tXWeW0sqVddf7ZBflq TCyPEKSzIyweCN5yp1() {
        try {
            if (f714pbVGzGjWvY2LDXC8vo == null) {
                tXWeW0sqVddf7ZBflq txwew0sqvddf7zbflq = new tXWeW0sqVddf7ZBflq();
                f714pbVGzGjWvY2LDXC8vo = txwew0sqvddf7zbflq;
                aPyGSIylzVNKPT1Bls(txwew0sqvddf7zbflq);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f714pbVGzGjWvY2LDXC8vo;
    }

    public static synchronized PorterDuffColorFilter Z9WdNiOsPR0y54zHW4(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterPbVGzGjWvY2LDXC8vo;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = f712Acstmh57AKoSEkEFNJ;
        porterDuffColorFilterPbVGzGjWvY2LDXC8vo = leer5kfoer4xu5yhh7.pbVGzGjWvY2LDXC8vo(i, mode);
        if (porterDuffColorFilterPbVGzGjWvY2LDXC8vo == null) {
            porterDuffColorFilterPbVGzGjWvY2LDXC8vo = new PorterDuffColorFilter(i, mode);
            leer5kfoer4xu5yhh7.Acstmh57AKoSEkEFNJ(i, mode, porterDuffColorFilterPbVGzGjWvY2LDXC8vo);
        }
        return porterDuffColorFilterPbVGzGjWvY2LDXC8vo;
    }

    public static long zZKhbgvUfsK4AEX3r0(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public synchronized Drawable Acstmh57AKoSEkEFNJ(Context context, int i, boolean z) {
        Drawable drawableZaq8hOURtfwbcX17cG;
        try {
            HJFh0TGMpafqLE9haL(context);
            drawableZaq8hOURtfwbcX17cG = zaq8hOURtfwbcX17cG(context, i);
            if (drawableZaq8hOURtfwbcX17cG == null) {
                drawableZaq8hOURtfwbcX17cG = husNiw3snxdgZPAGJm(context, i);
            }
            if (drawableZaq8hOURtfwbcX17cG == null) {
                drawableZaq8hOURtfwbcX17cG = LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(context, i);
            }
            if (drawableZaq8hOURtfwbcX17cG != null) {
                drawableZaq8hOURtfwbcX17cG = R9SAhYMerGybF9OAjL(context, i, z, drawableZaq8hOURtfwbcX17cG);
            }
            if (drawableZaq8hOURtfwbcX17cG != null) {
                VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA(drawableZaq8hOURtfwbcX17cG);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableZaq8hOURtfwbcX17cG;
    }

    public final void HJFh0TGMpafqLE9haL(Context context) {
        if (this.f716KYHag8HRDlnO3X9zmZ) {
            return;
        }
        this.f716KYHag8HRDlnO3X9zmZ = true;
        Drawable drawablePbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(context, husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7.f6041lEeR5KfoEr4xU5yHH7);
        if (drawablePbVGzGjWvY2LDXC8vo == null || !OANkd3mP6AYvwbNLJM(drawablePbVGzGjWvY2LDXC8vo)) {
            this.f716KYHag8HRDlnO3X9zmZ = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final synchronized Drawable IPyIQcaNa8aB7drBED(Context context, long j) {
        Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0) this.f721zZKhbgvUfsK4AEX3r0.get(context);
        if (zzkhbgvufsk4aex3r0 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            zzkhbgvufsk4aex3r0.pbVGzGjWvY2LDXC8vo(j);
        }
        return null;
    }

    public final Drawable R9SAhYMerGybF9OAjL(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(context, i);
        if (colorStateListE54J8UWNHWALQNixXM != null) {
            Drawable drawableE54J8UWNHWALQNixXM = WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(drawable.mutate());
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(drawableE54J8UWNHWALQNixXM, colorStateListE54J8UWNHWALQNixXM);
            PorterDuff.Mode modeHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(i);
            if (modeHoXrIDAFrSwfShk8da == null) {
                return drawableE54J8UWNHWALQNixXM;
            }
            WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(drawableE54J8UWNHWALQNixXM, modeHoXrIDAFrSwfShk8da);
            return drawableE54J8UWNHWALQNixXM;
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f717TCyPEKSzIyweCN5yp1;
        if ((hJFh0TGMpafqLE9haL == null || !hJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(context, i, drawable)) && !xHA29AmDt6y96AnB3t(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public final ColorStateList T9PhQIpGRhE4yZDm1C(Context context, int i) {
        Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED;
        WeakHashMap weakHashMap = this.f719lEeR5KfoEr4xU5yHH7;
        if (weakHashMap == null || (iPyIQcaNa8aB7drBED = (Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) iPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm(i);
    }

    public synchronized void Y43RdunnpKgpbny0lE(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f717TCyPEKSzIyweCN5yp1 = hJFh0TGMpafqLE9haL;
    }

    public synchronized ColorStateList e54J8UWNHWALQNixXM(Context context, int i) {
        ColorStateList colorStateListT9PhQIpGRhE4yZDm1C;
        colorStateListT9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C(context, i);
        if (colorStateListT9PhQIpGRhE4yZDm1C == null) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f717TCyPEKSzIyweCN5yp1;
            colorStateListT9PhQIpGRhE4yZDm1C = hJFh0TGMpafqLE9haL == null ? null : hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(context, i);
            if (colorStateListT9PhQIpGRhE4yZDm1C != null) {
                s3fjYDxWOUexjjVgyA(context, i, colorStateListT9PhQIpGRhE4yZDm1C);
            }
        }
        return colorStateListT9PhQIpGRhE4yZDm1C;
    }

    public PorterDuff.Mode hoXrIDAFrSwfShk8da(int i) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f717TCyPEKSzIyweCN5yp1;
        if (hJFh0TGMpafqLE9haL == null) {
            return null;
        }
        return hJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm(i);
    }

    public final Drawable husNiw3snxdgZPAGJm(Context context, int i) throws Resources.NotFoundException {
        if (this.f718husNiw3snxdgZPAGJm == null) {
            this.f718husNiw3snxdgZPAGJm = new TypedValue();
        }
        TypedValue typedValue = this.f718husNiw3snxdgZPAGJm;
        context.getResources().getValue(i, typedValue, true);
        long jZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(typedValue);
        Drawable drawableIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(context, jZZKhbgvUfsK4AEX3r0);
        if (drawableIPyIQcaNa8aB7drBED != null) {
            return drawableIPyIQcaNa8aB7drBED;
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f717TCyPEKSzIyweCN5yp1;
        Drawable drawableS3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL == null ? null : hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this, context, i);
        if (drawableS3fjYDxWOUexjjVgyA != null) {
            drawableS3fjYDxWOUexjjVgyA.setChangingConfigurations(typedValue.changingConfigurations);
            lEeR5KfoEr4xU5yHH7(context, jZZKhbgvUfsK4AEX3r0, drawableS3fjYDxWOUexjjVgyA);
        }
        return drawableS3fjYDxWOUexjjVgyA;
    }

    public final synchronized boolean lEeR5KfoEr4xU5yHH7(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0) this.f721zZKhbgvUfsK4AEX3r0.get(context);
            if (zzkhbgvufsk4aex3r0 == null) {
                zzkhbgvufsk4aex3r0 = new Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0();
                this.f721zZKhbgvUfsK4AEX3r0.put(context, zzkhbgvufsk4aex3r0);
            }
            zzkhbgvufsk4aex3r0.IPyIQcaNa8aB7drBED(j, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Drawable pbVGzGjWvY2LDXC8vo(Context context, int i) {
        return Acstmh57AKoSEkEFNJ(context, i, false);
    }

    public final void s3fjYDxWOUexjjVgyA(Context context, int i, ColorStateList colorStateList) {
        if (this.f719lEeR5KfoEr4xU5yHH7 == null) {
            this.f719lEeR5KfoEr4xU5yHH7 = new WeakHashMap();
        }
        Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = (Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED) this.f719lEeR5KfoEr4xU5yHH7.get(context);
        if (iPyIQcaNa8aB7drBED == null) {
            iPyIQcaNa8aB7drBED = new Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED();
            this.f719lEeR5KfoEr4xU5yHH7.put(context, iPyIQcaNa8aB7drBED);
        }
        iPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(i, colorStateList);
    }

    public synchronized Drawable sTkWmhpZ5b1ArQIw4K(Context context, udcVtCzLTM1Loe9KrX udcvtczltm1loe9krx, int i) {
        try {
            Drawable drawableZaq8hOURtfwbcX17cG = zaq8hOURtfwbcX17cG(context, i);
            if (drawableZaq8hOURtfwbcX17cG == null) {
                drawableZaq8hOURtfwbcX17cG = udcvtczltm1loe9krx.lEeR5KfoEr4xU5yHH7(i);
            }
            if (drawableZaq8hOURtfwbcX17cG == null) {
                return null;
            }
            return R9SAhYMerGybF9OAjL(context, i, false, drawableZaq8hOURtfwbcX17cG);
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean xHA29AmDt6y96AnB3t(Context context, int i, Drawable drawable) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f717TCyPEKSzIyweCN5yp1;
        return hJFh0TGMpafqLE9haL != null && hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(context, i, drawable);
    }

    public final Drawable zaq8hOURtfwbcX17cG(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = this.f720s3fjYDxWOUexjjVgyA;
        if (tCyPEKSzIyweCN5yp1 == null || tCyPEKSzIyweCN5yp1.isEmpty()) {
            return null;
        }
        Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = this.f715HJFh0TGMpafqLE9haL;
        if (iPyIQcaNa8aB7drBED != null) {
            String str = (String) iPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f720s3fjYDxWOUexjjVgyA.get(str) == null)) {
                return null;
            }
        } else {
            this.f715HJFh0TGMpafqLE9haL = new Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED();
        }
        if (this.f718husNiw3snxdgZPAGJm == null) {
            this.f718husNiw3snxdgZPAGJm = new TypedValue();
        }
        TypedValue typedValue = this.f718husNiw3snxdgZPAGJm;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(typedValue);
        Drawable drawableIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(context, jZZKhbgvUfsK4AEX3r0);
        if (drawableIPyIQcaNa8aB7drBED != null) {
            return drawableIPyIQcaNa8aB7drBED;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f715HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(i, name);
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) this.f720s3fjYDxWOUexjjVgyA.get(name);
                if (s3fjydxwouexjjvgya != null) {
                    drawableIPyIQcaNa8aB7drBED = s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableIPyIQcaNa8aB7drBED != null) {
                    drawableIPyIQcaNa8aB7drBED.setChangingConfigurations(typedValue.changingConfigurations);
                    lEeR5KfoEr4xU5yHH7(context, jZZKhbgvUfsK4AEX3r0, drawableIPyIQcaNa8aB7drBED);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableIPyIQcaNa8aB7drBED == null) {
            this.f715HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(i, "appcompat_skip_skip");
        }
        return drawableIPyIQcaNa8aB7drBED;
    }

    public static void aPyGSIylzVNKPT1Bls(tXWeW0sqVddf7ZBflq txwew0sqvddf7zbflq) {
    }
}
