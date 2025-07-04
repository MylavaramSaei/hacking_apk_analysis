package WaWv1mJ1ya3uoEaKqz;

import W3RZ2dTDKrKpS5Mxdk.OUd9THiLjZndMj0qdF;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import W3RZ2dTDKrKpS5Mxdk.vlBaBOcZ1q1ndWVoXn;
import W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public abstract class hoXrIDAFrSwfShk8da {

    public interface HJFh0TGMpafqLE9haL {
        zXY7dgnTfw9Pd9RXel lEeR5KfoEr4xU5yHH7(View view, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0);
    }

    public class lEeR5KfoEr4xU5yHH7 implements OUd9THiLjZndMj0qdF {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ HJFh0TGMpafqLE9haL f1988lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ zZKhbgvUfsK4AEX3r0 f1989s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f1988lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
            this.f1989s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0;
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.OUd9THiLjZndMj0qdF
        public zXY7dgnTfw9Pd9RXel lEeR5KfoEr4xU5yHH7(View view, zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxel) {
            return this.f1988lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(view, zxy7dgntfw9pd9rxel, new zZKhbgvUfsK4AEX3r0(this.f1989s3fjYDxWOUexjjVgyA));
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f1990HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f1991lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f1992s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f1993zZKhbgvUfsK4AEX3r0;

        public zZKhbgvUfsK4AEX3r0(int i, int i2, int i3, int i4) {
            this.f1991lEeR5KfoEr4xU5yHH7 = i;
            this.f1992s3fjYDxWOUexjjVgyA = i2;
            this.f1990HJFh0TGMpafqLE9haL = i3;
            this.f1993zZKhbgvUfsK4AEX3r0 = i4;
        }

        public zZKhbgvUfsK4AEX3r0(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f1991lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0.f1991lEeR5KfoEr4xU5yHH7;
            this.f1992s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0.f1992s3fjYDxWOUexjjVgyA;
            this.f1990HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0.f1990HJFh0TGMpafqLE9haL;
            this.f1993zZKhbgvUfsK4AEX3r0 = zzkhbgvufsk4aex3r0.f1993zZKhbgvUfsK4AEX3r0;
        }
    }

    public static void Acstmh57AKoSEkEFNJ(View view) {
        if (lLKzvdU99Iw80uVD5I.aAp6BD79BhftLCnuvf(view)) {
            lLKzvdU99Iw80uVD5I.ctWLFN70QQINH1kyYo(view);
        } else {
            view.addOnAttachStateChangeListener(new s3fjYDxWOUexjjVgyA());
        }
    }

    public static float HJFh0TGMpafqLE9haL(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float KYHag8HRDlnO3X9zmZ(View view) {
        float fY43RdunnpKgpbny0lE = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fY43RdunnpKgpbny0lE += lLKzvdU99Iw80uVD5I.Y43RdunnpKgpbny0lE((View) parent);
        }
        return fY43RdunnpKgpbny0lE;
    }

    public static boolean TCyPEKSzIyweCN5yp1(View view) {
        return lLKzvdU99Iw80uVD5I.A49QRPHynYLCBN0SqP(view) == 1;
    }

    public static void Z9WdNiOsPR0y54zHW4(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: WaWv1mJ1ya3uoEaKqz.T9PhQIpGRhE4yZDm1C
            @Override // java.lang.Runnable
            public final void run() {
                hoXrIDAFrSwfShk8da.e54J8UWNHWALQNixXM(view, z);
            }
        });
    }

    public static void e54J8UWNHWALQNixXM(View view, boolean z) {
        vlBaBOcZ1q1ndWVoXn vlbabocz1q1ndwvoxnW3RZ2dTDKrKpS5Mxdk;
        if (!z || (vlbabocz1q1ndwvoxnW3RZ2dTDKrKpS5Mxdk = lLKzvdU99Iw80uVD5I.W3RZ2dTDKrKpS5Mxdk(view)) == null) {
            husNiw3snxdgZPAGJm(view).showSoftInput(view, 1);
        } else {
            vlbabocz1q1ndwvoxnW3RZ2dTDKrKpS5Mxdk.HJFh0TGMpafqLE9haL(zXY7dgnTfw9Pd9RXel.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7());
        }
    }

    public static InputMethodManager husNiw3snxdgZPAGJm(View view) {
        return (InputMethodManager) LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view.getContext(), InputMethodManager.class);
    }

    public static PorterDuff.Mode pbVGzGjWvY2LDXC8vo(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void s3fjYDxWOUexjjVgyA(View view, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        lLKzvdU99Iw80uVD5I.Er40JrQbOM51vCQI8w(view, new lEeR5KfoEr4xU5yHH7(hJFh0TGMpafqLE9haL, new zZKhbgvUfsK4AEX3r0(lLKzvdU99Iw80uVD5I.OUd9THiLjZndMj0qdF(view), view.getPaddingTop(), lLKzvdU99Iw80uVD5I.ao3wqKm5CXFuvC0q47(view), view.getPaddingBottom())));
        Acstmh57AKoSEkEFNJ(view);
    }

    public static Integer zZKhbgvUfsK4AEX3r0(View view) {
        ColorStateList colorStateListLEeR5KfoEr4xU5yHH7 = h6NrAcYSuIyiU1qV6F.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(view.getBackground());
        if (colorStateListLEeR5KfoEr4xU5yHH7 != null) {
            return Integer.valueOf(colorStateListLEeR5KfoEr4xU5yHH7.getDefaultColor());
        }
        return null;
    }

    public class s3fjYDxWOUexjjVgyA implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            lLKzvdU99Iw80uVD5I.ctWLFN70QQINH1kyYo(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
