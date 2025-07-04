package IPyIQcaNa8aB7drBED;

import A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class Y43RdunnpKgpbny0lE {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public e2F9F6h8YJxTHwLCa0 f623HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public e2F9F6h8YJxTHwLCa0 f624IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public e2F9F6h8YJxTHwLCa0 f625KYHag8HRDlnO3X9zmZ;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public boolean f626T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public e2F9F6h8YJxTHwLCa0 f627TCyPEKSzIyweCN5yp1;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public Typeface f629e54J8UWNHWALQNixXM;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public e2F9F6h8YJxTHwLCa0 f630husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final TextView f631lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final G7AC3DWIx9i9fdanjk f632pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public e2F9F6h8YJxTHwLCa0 f633s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public e2F9F6h8YJxTHwLCa0 f634zZKhbgvUfsK4AEX3r0;

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public int f622Acstmh57AKoSEkEFNJ = 0;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public int f628Z9WdNiOsPR0y54zHW4 = -1;

    public static class HJFh0TGMpafqLE9haL {
        public static LocaleList lEeR5KfoEr4xU5yHH7(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void s3fjYDxWOUexjjVgyA(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class husNiw3snxdgZPAGJm {
        public static Typeface lEeR5KfoEr4xU5yHH7(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ int f639HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ TextView f640lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ Typeface f641s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(TextView textView, Typeface typeface, int i) {
            this.f640lEeR5KfoEr4xU5yHH7 = textView;
            this.f641s3fjYDxWOUexjjVgyA = typeface;
            this.f639HJFh0TGMpafqLE9haL = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f640lEeR5KfoEr4xU5yHH7.setTypeface(this.f641s3fjYDxWOUexjjVgyA, this.f639HJFh0TGMpafqLE9haL);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {
        public static void HJFh0TGMpafqLE9haL(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static int lEeR5KfoEr4xU5yHH7(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void s3fjYDxWOUexjjVgyA(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static boolean zZKhbgvUfsK4AEX3r0(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public Y43RdunnpKgpbny0lE(TextView textView) {
        this.f631lEeR5KfoEr4xU5yHH7 = textView;
        this.f632pbVGzGjWvY2LDXC8vo = new G7AC3DWIx9i9fdanjk(textView);
    }

    public static e2F9F6h8YJxTHwLCa0 zZKhbgvUfsK4AEX3r0(Context context, IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED, int i) {
        ColorStateList colorStateListHusNiw3snxdgZPAGJm = iPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm(context, i);
        if (colorStateListHusNiw3snxdgZPAGJm == null) {
            return null;
        }
        e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0 = new e2F9F6h8YJxTHwLCa0();
        e2f9f6h8yjxthwlca0.f676zZKhbgvUfsK4AEX3r0 = true;
        e2f9f6h8yjxthwlca0.f674lEeR5KfoEr4xU5yHH7 = colorStateListHusNiw3snxdgZPAGJm;
        return e2f9f6h8yjxthwlca0;
    }

    public void A49QRPHynYLCBN0SqP(PorterDuff.Mode mode) {
        if (this.f624IPyIQcaNa8aB7drBED == null) {
            this.f624IPyIQcaNa8aB7drBED = new e2F9F6h8YJxTHwLCa0();
        }
        e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0 = this.f624IPyIQcaNa8aB7drBED;
        e2f9f6h8yjxthwlca0.f675s3fjYDxWOUexjjVgyA = mode;
        e2f9f6h8yjxthwlca0.f673HJFh0TGMpafqLE9haL = mode != null;
        WWC27LAMFqFFBzfbNw();
    }

    public ColorStateList Acstmh57AKoSEkEFNJ() {
        e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0 = this.f624IPyIQcaNa8aB7drBED;
        if (e2f9f6h8yjxthwlca0 != null) {
            return e2f9f6h8yjxthwlca0.f674lEeR5KfoEr4xU5yHH7;
        }
        return null;
    }

    public void G7AC3DWIx9i9fdanjk(int[] iArr, int i) {
        this.f632pbVGzGjWvY2LDXC8vo.zaq8hOURtfwbcX17cG(iArr, i);
    }

    public void HJFh0TGMpafqLE9haL() {
        this.f632pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7();
    }

    public int[] IPyIQcaNa8aB7drBED() {
        return this.f632pbVGzGjWvY2LDXC8vo.pbVGzGjWvY2LDXC8vo();
    }

    public int KYHag8HRDlnO3X9zmZ() {
        return this.f632pbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1();
    }

    public void LIMtzhnLwQyigzK0KO(ColorStateList colorStateList) {
        if (this.f624IPyIQcaNa8aB7drBED == null) {
            this.f624IPyIQcaNa8aB7drBED = new e2F9F6h8YJxTHwLCa0();
        }
        e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0 = this.f624IPyIQcaNa8aB7drBED;
        e2f9f6h8yjxthwlca0.f674lEeR5KfoEr4xU5yHH7 = colorStateList;
        e2f9f6h8yjxthwlca0.f676zZKhbgvUfsK4AEX3r0 = colorStateList != null;
        WWC27LAMFqFFBzfbNw();
    }

    public void OANkd3mP6AYvwbNLJM() {
        s3fjYDxWOUexjjVgyA();
    }

    public final void OUd9THiLjZndMj0qdF(Context context, PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLT) {
        String strHoXrIDAFrSwfShk8da;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f622Acstmh57AKoSEkEFNJ = pPkm9uUfOJHHYveeLT.Acstmh57AKoSEkEFNJ(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6434w859GrF8FXGM1qrYSH, this.f622Acstmh57AKoSEkEFNJ);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iAcstmh57AKoSEkEFNJ = pPkm9uUfOJHHYveeLT.Acstmh57AKoSEkEFNJ(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6384fB1XGht2x9XoIgekQ8, -1);
            this.f628Z9WdNiOsPR0y54zHW4 = iAcstmh57AKoSEkEFNJ;
            if (iAcstmh57AKoSEkEFNJ != -1) {
                this.f622Acstmh57AKoSEkEFNJ &= 2;
            }
        }
        if (!pPkm9uUfOJHHYveeLT.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6422sKvjC8bExN3ISwwWsb) && !pPkm9uUfOJHHYveeLT.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6359ZH7ZBRiZvcOTI9arA2)) {
            if (pPkm9uUfOJHHYveeLT.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6439xt9LcS8xZRgoStfDrh)) {
                this.f626T9PhQIpGRhE4yZDm1C = false;
                int iAcstmh57AKoSEkEFNJ2 = pPkm9uUfOJHHYveeLT.Acstmh57AKoSEkEFNJ(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6439xt9LcS8xZRgoStfDrh, 1);
                if (iAcstmh57AKoSEkEFNJ2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iAcstmh57AKoSEkEFNJ2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iAcstmh57AKoSEkEFNJ2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f629e54J8UWNHWALQNixXM = typeface;
                return;
            }
            return;
        }
        this.f629e54J8UWNHWALQNixXM = null;
        int i2 = pPkm9uUfOJHHYveeLT.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6359ZH7ZBRiZvcOTI9arA2) ? lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6359ZH7ZBRiZvcOTI9arA2 : lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6422sKvjC8bExN3ISwwWsb;
        int i3 = this.f628Z9WdNiOsPR0y54zHW4;
        int i4 = this.f622Acstmh57AKoSEkEFNJ;
        if (!context.isRestricted()) {
            try {
                Typeface typefacePbVGzGjWvY2LDXC8vo = pPkm9uUfOJHHYveeLT.pbVGzGjWvY2LDXC8vo(i2, this.f622Acstmh57AKoSEkEFNJ, new lEeR5KfoEr4xU5yHH7(i3, i4, new WeakReference(this.f631lEeR5KfoEr4xU5yHH7)));
                if (typefacePbVGzGjWvY2LDXC8vo != null) {
                    if (i >= 28 && this.f628Z9WdNiOsPR0y54zHW4 != -1) {
                        typefacePbVGzGjWvY2LDXC8vo = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(Typeface.create(typefacePbVGzGjWvY2LDXC8vo, 0), this.f628Z9WdNiOsPR0y54zHW4, (this.f622Acstmh57AKoSEkEFNJ & 2) != 0);
                    }
                    this.f629e54J8UWNHWALQNixXM = typefacePbVGzGjWvY2LDXC8vo;
                }
                this.f626T9PhQIpGRhE4yZDm1C = this.f629e54J8UWNHWALQNixXM == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f629e54J8UWNHWALQNixXM != null || (strHoXrIDAFrSwfShk8da = pPkm9uUfOJHHYveeLT.hoXrIDAFrSwfShk8da(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f628Z9WdNiOsPR0y54zHW4 == -1) {
            typefaceCreate = Typeface.create(strHoXrIDAFrSwfShk8da, this.f622Acstmh57AKoSEkEFNJ);
        } else {
            typefaceCreate = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(Typeface.create(strHoXrIDAFrSwfShk8da, 0), this.f628Z9WdNiOsPR0y54zHW4, (this.f622Acstmh57AKoSEkEFNJ & 2) != 0);
        }
        this.f629e54J8UWNHWALQNixXM = typefaceCreate;
    }

    public void R9SAhYMerGybF9OAjL(int i, int i2, int i3, int i4) {
        this.f632pbVGzGjWvY2LDXC8vo.OANkd3mP6AYvwbNLJM(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T9PhQIpGRhE4yZDm1C(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: IPyIQcaNa8aB7drBED.Y43RdunnpKgpbny0lE.T9PhQIpGRhE4yZDm1C(android.util.AttributeSet, int):void");
    }

    public int TCyPEKSzIyweCN5yp1() {
        return this.f632pbVGzGjWvY2LDXC8vo.IPyIQcaNa8aB7drBED();
    }

    public void THTDvPxsHqMeGb512f(int i, float f) {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7 || e54J8UWNHWALQNixXM()) {
            return;
        }
        ao3wqKm5CXFuvC0q47(i, f);
    }

    public final void VItLRw50eXTZeEfGl0(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f631lEeR5KfoEr4xU5yHH7.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f631lEeR5KfoEr4xU5yHH7;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f631lEeR5KfoEr4xU5yHH7.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f631lEeR5KfoEr4xU5yHH7.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f631lEeR5KfoEr4xU5yHH7.getCompoundDrawables();
        TextView textView2 = this.f631lEeR5KfoEr4xU5yHH7;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void WWC27LAMFqFFBzfbNw() {
        e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0 = this.f624IPyIQcaNa8aB7drBED;
        this.f633s3fjYDxWOUexjjVgyA = e2f9f6h8yjxthwlca0;
        this.f623HJFh0TGMpafqLE9haL = e2f9f6h8yjxthwlca0;
        this.f634zZKhbgvUfsK4AEX3r0 = e2f9f6h8yjxthwlca0;
        this.f630husNiw3snxdgZPAGJm = e2f9f6h8yjxthwlca0;
        this.f625KYHag8HRDlnO3X9zmZ = e2f9f6h8yjxthwlca0;
        this.f627TCyPEKSzIyweCN5yp1 = e2f9f6h8yjxthwlca0;
    }

    public void Y43RdunnpKgpbny0lE(boolean z) {
        this.f631lEeR5KfoEr4xU5yHH7.setAllCaps(z);
    }

    public PorterDuff.Mode Z9WdNiOsPR0y54zHW4() {
        e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0 = this.f624IPyIQcaNa8aB7drBED;
        if (e2f9f6h8yjxthwlca0 != null) {
            return e2f9f6h8yjxthwlca0.f675s3fjYDxWOUexjjVgyA;
        }
        return null;
    }

    public void aPyGSIylzVNKPT1Bls(boolean z, int i, int i2, int i3, int i4) {
        if (cT5Hs3CQpLK8NvlZAw.f672lEeR5KfoEr4xU5yHH7) {
            return;
        }
        HJFh0TGMpafqLE9haL();
    }

    public final void ao3wqKm5CXFuvC0q47(int i, float f) {
        this.f632pbVGzGjWvY2LDXC8vo.R9SAhYMerGybF9OAjL(i, f);
    }

    public boolean e54J8UWNHWALQNixXM() {
        return this.f632pbVGzGjWvY2LDXC8vo.hoXrIDAFrSwfShk8da();
    }

    public void hoXrIDAFrSwfShk8da(WeakReference weakReference, Typeface typeface) {
        if (this.f626T9PhQIpGRhE4yZDm1C) {
            this.f629e54J8UWNHWALQNixXM = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new s3fjYDxWOUexjjVgyA(textView, typeface, this.f622Acstmh57AKoSEkEFNJ));
                } else {
                    textView.setTypeface(typeface, this.f622Acstmh57AKoSEkEFNJ);
                }
            }
        }
    }

    public int husNiw3snxdgZPAGJm() {
        return this.f632pbVGzGjWvY2LDXC8vo.KYHag8HRDlnO3X9zmZ();
    }

    public final void lEeR5KfoEr4xU5yHH7(Drawable drawable, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0) {
        if (drawable == null || e2f9f6h8yjxthwlca0 == null) {
            return;
        }
        IPyIQcaNa8aB7drBED.TCyPEKSzIyweCN5yp1(drawable, e2f9f6h8yjxthwlca0, this.f631lEeR5KfoEr4xU5yHH7.getDrawableState());
    }

    public int pbVGzGjWvY2LDXC8vo() {
        return this.f632pbVGzGjWvY2LDXC8vo.Acstmh57AKoSEkEFNJ();
    }

    public void s3fjYDxWOUexjjVgyA() {
        if (this.f633s3fjYDxWOUexjjVgyA != null || this.f623HJFh0TGMpafqLE9haL != null || this.f634zZKhbgvUfsK4AEX3r0 != null || this.f630husNiw3snxdgZPAGJm != null) {
            Drawable[] compoundDrawables = this.f631lEeR5KfoEr4xU5yHH7.getCompoundDrawables();
            lEeR5KfoEr4xU5yHH7(compoundDrawables[0], this.f633s3fjYDxWOUexjjVgyA);
            lEeR5KfoEr4xU5yHH7(compoundDrawables[1], this.f623HJFh0TGMpafqLE9haL);
            lEeR5KfoEr4xU5yHH7(compoundDrawables[2], this.f634zZKhbgvUfsK4AEX3r0);
            lEeR5KfoEr4xU5yHH7(compoundDrawables[3], this.f630husNiw3snxdgZPAGJm);
        }
        if (this.f625KYHag8HRDlnO3X9zmZ == null && this.f627TCyPEKSzIyweCN5yp1 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f631lEeR5KfoEr4xU5yHH7.getCompoundDrawablesRelative();
        lEeR5KfoEr4xU5yHH7(compoundDrawablesRelative[0], this.f625KYHag8HRDlnO3X9zmZ);
        lEeR5KfoEr4xU5yHH7(compoundDrawablesRelative[2], this.f627TCyPEKSzIyweCN5yp1);
    }

    public void sTkWmhpZ5b1ArQIw4K(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        KqgKJKIWne3kz1AdHk.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(editorInfo, textView.getText());
    }

    public void xHA29AmDt6y96AnB3t(int i) {
        this.f632pbVGzGjWvY2LDXC8vo.sTkWmhpZ5b1ArQIw4K(i);
    }

    public void zaq8hOURtfwbcX17cG(Context context, int i) {
        String strHoXrIDAFrSwfShk8da;
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K = PPkm9uUfOJHHYveeLT.sTkWmhpZ5b1ArQIw4K(context, i, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6444zQjb36M22TWHJmh54i);
        if (pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6336SF66oTSCsXABfwyWiU)) {
            Y43RdunnpKgpbny0lE(pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K.lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6336SF66oTSCsXABfwyWiU, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6436wUKf1mNArSjssthGmN) && pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K.KYHag8HRDlnO3X9zmZ(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6436wUKf1mNArSjssthGmN, -1) == 0) {
            this.f631lEeR5KfoEr4xU5yHH7.setTextSize(0, 0.0f);
        }
        OUd9THiLjZndMj0qdF(context, pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K);
        if (i2 >= 26 && pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K.zaq8hOURtfwbcX17cG(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6292D3qEI0j1Bvj6FYKAih) && (strHoXrIDAFrSwfShk8da = pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K.hoXrIDAFrSwfShk8da(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6292D3qEI0j1Bvj6FYKAih)) != null) {
            zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0(this.f631lEeR5KfoEr4xU5yHH7, strHoXrIDAFrSwfShk8da);
        }
        pPkm9uUfOJHHYveeLTSTkWmhpZ5b1ArQIw4K.xHA29AmDt6y96AnB3t();
        Typeface typeface = this.f629e54J8UWNHWALQNixXM;
        if (typeface != null) {
            this.f631lEeR5KfoEr4xU5yHH7.setTypeface(typeface, this.f622Acstmh57AKoSEkEFNJ);
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ WeakReference f635HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ int f636lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ int f637s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(int i, int i2, WeakReference weakReference) {
            this.f636lEeR5KfoEr4xU5yHH7 = i;
            this.f637s3fjYDxWOUexjjVgyA = i2;
            this.f635HJFh0TGMpafqLE9haL = weakReference;
        }

        @Override // A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm
        /* renamed from: pbVGzGjWvY2LDXC8vo */
        public void TCyPEKSzIyweCN5yp1(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f636lEeR5KfoEr4xU5yHH7) != -1) {
                typeface = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(typeface, i, (this.f637s3fjYDxWOUexjjVgyA & 2) != 0);
            }
            Y43RdunnpKgpbny0lE.this.hoXrIDAFrSwfShk8da(this.f635HJFh0TGMpafqLE9haL, typeface);
        }

        @Override // A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm
        /* renamed from: IPyIQcaNa8aB7drBED */
        public void KYHag8HRDlnO3X9zmZ(int i) {
        }
    }
}
