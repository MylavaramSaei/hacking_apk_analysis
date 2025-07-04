package IPyIQcaNa8aB7drBED;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class G7AC3DWIx9i9fdanjk {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final Context f479Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public TextPaint f481IPyIQcaNa8aB7drBED;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final zZKhbgvUfsK4AEX3r0 f484Z9WdNiOsPR0y54zHW4;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final TextView f487pbVGzGjWvY2LDXC8vo;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final RectF f478e54J8UWNHWALQNixXM = new RectF();

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public static ConcurrentHashMap f477T9PhQIpGRhE4yZDm1C = new ConcurrentHashMap();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f486lEeR5KfoEr4xU5yHH7 = 0;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f488s3fjYDxWOUexjjVgyA = false;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public float f480HJFh0TGMpafqLE9haL = -1.0f;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public float f489zZKhbgvUfsK4AEX3r0 = -1.0f;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public float f485husNiw3snxdgZPAGJm = -1.0f;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public int[] f482KYHag8HRDlnO3X9zmZ = new int[0];

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f483TCyPEKSzIyweCN5yp1 = false;

    public static class HJFh0TGMpafqLE9haL extends s3fjYDxWOUexjjVgyA {
        @Override // IPyIQcaNa8aB7drBED.G7AC3DWIx9i9fdanjk.s3fjYDxWOUexjjVgyA, IPyIQcaNa8aB7drBED.G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0
        public void lEeR5KfoEr4xU5yHH7(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // IPyIQcaNa8aB7drBED.G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0
        public boolean s3fjYDxWOUexjjVgyA(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static final class lEeR5KfoEr4xU5yHH7 {
        public static StaticLayout lEeR5KfoEr4xU5yHH7(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends zZKhbgvUfsK4AEX3r0 {
        @Override // IPyIQcaNa8aB7drBED.G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0
        public void lEeR5KfoEr4xU5yHH7(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {
        public abstract void lEeR5KfoEr4xU5yHH7(StaticLayout.Builder builder, TextView textView);

        public boolean s3fjYDxWOUexjjVgyA(TextView textView) {
            return ((Boolean) G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public G7AC3DWIx9i9fdanjk(TextView textView) {
        this.f487pbVGzGjWvY2LDXC8vo = textView;
        this.f479Acstmh57AKoSEkEFNJ = textView.getContext();
        this.f484Z9WdNiOsPR0y54zHW4 = Build.VERSION.SDK_INT >= 29 ? new HJFh0TGMpafqLE9haL() : new s3fjYDxWOUexjjVgyA();
    }

    public static Object T9PhQIpGRhE4yZDm1C(Object obj, String str, Object obj2) {
        try {
            return Z9WdNiOsPR0y54zHW4(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public static Method Z9WdNiOsPR0y54zHW4(String str) throws SecurityException {
        try {
            Method declaredMethod = (Method) f477T9PhQIpGRhE4yZDm1C.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f477T9PhQIpGRhE4yZDm1C.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public final boolean A49QRPHynYLCBN0SqP(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f487pbVGzGjWvY2LDXC8vo.getText();
        TransformationMethod transformationMethod = this.f487pbVGzGjWvY2LDXC8vo.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f487pbVGzGjWvY2LDXC8vo)) != null) {
            text = transformation;
        }
        int maxLines = this.f487pbVGzGjWvY2LDXC8vo.getMaxLines();
        e54J8UWNHWALQNixXM(i);
        StaticLayout staticLayoutZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(text, (Layout.Alignment) T9PhQIpGRhE4yZDm1C(this.f487pbVGzGjWvY2LDXC8vo, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutZZKhbgvUfsK4AEX3r0.getLineCount() <= maxLines && staticLayoutZZKhbgvUfsK4AEX3r0.getLineEnd(staticLayoutZZKhbgvUfsK4AEX3r0.getLineCount() - 1) == text.length())) && ((float) staticLayoutZZKhbgvUfsK4AEX3r0.getHeight()) <= rectF.bottom;
    }

    public int Acstmh57AKoSEkEFNJ() {
        return this.f486lEeR5KfoEr4xU5yHH7;
    }

    public final boolean G7AC3DWIx9i9fdanjk() {
        if (VItLRw50eXTZeEfGl0() && this.f486lEeR5KfoEr4xU5yHH7 == 1) {
            if (!this.f483TCyPEKSzIyweCN5yp1 || this.f482KYHag8HRDlnO3X9zmZ.length == 0) {
                int iFloor = ((int) Math.floor((this.f485husNiw3snxdgZPAGJm - this.f489zZKhbgvUfsK4AEX3r0) / this.f480HJFh0TGMpafqLE9haL)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.f489zZKhbgvUfsK4AEX3r0 + (i * this.f480HJFh0TGMpafqLE9haL));
                }
                this.f482KYHag8HRDlnO3X9zmZ = s3fjYDxWOUexjjVgyA(iArr);
            }
            this.f488s3fjYDxWOUexjjVgyA = true;
        } else {
            this.f488s3fjYDxWOUexjjVgyA = false;
        }
        return this.f488s3fjYDxWOUexjjVgyA;
    }

    public final void HJFh0TGMpafqLE9haL() {
        this.f486lEeR5KfoEr4xU5yHH7 = 0;
        this.f489zZKhbgvUfsK4AEX3r0 = -1.0f;
        this.f485husNiw3snxdgZPAGJm = -1.0f;
        this.f480HJFh0TGMpafqLE9haL = -1.0f;
        this.f482KYHag8HRDlnO3X9zmZ = new int[0];
        this.f488s3fjYDxWOUexjjVgyA = false;
    }

    public int IPyIQcaNa8aB7drBED() {
        return Math.round(this.f480HJFh0TGMpafqLE9haL);
    }

    public int KYHag8HRDlnO3X9zmZ() {
        return Math.round(this.f485husNiw3snxdgZPAGJm);
    }

    public final boolean LIMtzhnLwQyigzK0KO() {
        boolean z = this.f482KYHag8HRDlnO3X9zmZ.length > 0;
        this.f483TCyPEKSzIyweCN5yp1 = z;
        if (z) {
            this.f486lEeR5KfoEr4xU5yHH7 = 1;
            this.f489zZKhbgvUfsK4AEX3r0 = r0[0];
            this.f485husNiw3snxdgZPAGJm = r0[r1 - 1];
            this.f480HJFh0TGMpafqLE9haL = -1.0f;
        }
        return z;
    }

    public void OANkd3mP6AYvwbNLJM(int i, int i2, int i3, int i4) {
        if (VItLRw50eXTZeEfGl0()) {
            DisplayMetrics displayMetrics = this.f479Acstmh57AKoSEkEFNJ.getResources().getDisplayMetrics();
            WWC27LAMFqFFBzfbNw(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (G7AC3DWIx9i9fdanjk()) {
                lEeR5KfoEr4xU5yHH7();
            }
        }
    }

    public void R9SAhYMerGybF9OAjL(int i, float f) {
        Context context = this.f479Acstmh57AKoSEkEFNJ;
        Y43RdunnpKgpbny0lE(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public int TCyPEKSzIyweCN5yp1() {
        return Math.round(this.f489zZKhbgvUfsK4AEX3r0);
    }

    public final boolean VItLRw50eXTZeEfGl0() {
        return !(this.f487pbVGzGjWvY2LDXC8vo instanceof pbVGzGjWvY2LDXC8vo);
    }

    public final void WWC27LAMFqFFBzfbNw(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f486lEeR5KfoEr4xU5yHH7 = 1;
        this.f489zZKhbgvUfsK4AEX3r0 = f;
        this.f485husNiw3snxdgZPAGJm = f2;
        this.f480HJFh0TGMpafqLE9haL = f3;
        this.f483TCyPEKSzIyweCN5yp1 = false;
    }

    public final void Y43RdunnpKgpbny0lE(float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f != this.f487pbVGzGjWvY2LDXC8vo.getPaint().getTextSize()) {
            this.f487pbVGzGjWvY2LDXC8vo.getPaint().setTextSize(f);
            boolean zIsInLayout = this.f487pbVGzGjWvY2LDXC8vo.isInLayout();
            if (this.f487pbVGzGjWvY2LDXC8vo.getLayout() != null) {
                this.f488s3fjYDxWOUexjjVgyA = false;
                try {
                    Method methodZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4("nullLayouts");
                    if (methodZ9WdNiOsPR0y54zHW4 != null) {
                        methodZ9WdNiOsPR0y54zHW4.invoke(this.f487pbVGzGjWvY2LDXC8vo, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    this.f487pbVGzGjWvY2LDXC8vo.forceLayout();
                } else {
                    this.f487pbVGzGjWvY2LDXC8vo.requestLayout();
                }
                this.f487pbVGzGjWvY2LDXC8vo.invalidate();
            }
        }
    }

    public void aPyGSIylzVNKPT1Bls(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f479Acstmh57AKoSEkEFNJ.obtainStyledAttributes(attributeSet, lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6449zcy2NNbtVXgoGQbfuq, i, 0);
        TextView textView = this.f487pbVGzGjWvY2LDXC8vo;
        W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.jocVUfxESVhVJU8LoH(textView, textView.getContext(), lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6449zcy2NNbtVXgoGQbfuq, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6394hUNBy66ZO1wVLJGW3l)) {
            this.f486lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getInt(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6394hUNBy66ZO1wVLJGW3l, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6371cT5Hs3CQpLK8NvlZAw) ? typedArrayObtainStyledAttributes.getDimension(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6371cT5Hs3CQpLK8NvlZAw, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6414oocVJL811qFf0j0XXZ) ? typedArrayObtainStyledAttributes.getDimension(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6414oocVJL811qFf0j0XXZ, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6356YlLW4G6OV9TFyuw5ix) ? typedArrayObtainStyledAttributes.getDimension(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6356YlLW4G6OV9TFyuw5ix, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6430udcVtCzLTM1Loe9KrX) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo.f6430udcVtCzLTM1Loe9KrX, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            xHA29AmDt6y96AnB3t(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!VItLRw50eXTZeEfGl0()) {
            this.f486lEeR5KfoEr4xU5yHH7 = 0;
            return;
        }
        if (this.f486lEeR5KfoEr4xU5yHH7 == 1) {
            if (!this.f483TCyPEKSzIyweCN5yp1) {
                DisplayMetrics displayMetrics = this.f479Acstmh57AKoSEkEFNJ.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                WWC27LAMFqFFBzfbNw(dimension2, dimension3, dimension);
            }
            G7AC3DWIx9i9fdanjk();
        }
    }

    public void e54J8UWNHWALQNixXM(int i) {
        TextPaint textPaint = this.f481IPyIQcaNa8aB7drBED;
        if (textPaint == null) {
            this.f481IPyIQcaNa8aB7drBED = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f481IPyIQcaNa8aB7drBED.set(this.f487pbVGzGjWvY2LDXC8vo.getPaint());
        this.f481IPyIQcaNa8aB7drBED.setTextSize(i);
    }

    public boolean hoXrIDAFrSwfShk8da() {
        return VItLRw50eXTZeEfGl0() && this.f486lEeR5KfoEr4xU5yHH7 != 0;
    }

    public final int husNiw3snxdgZPAGJm(RectF rectF) {
        int length = this.f482KYHag8HRDlnO3X9zmZ.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (A49QRPHynYLCBN0SqP(this.f482KYHag8HRDlnO3X9zmZ[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.f482KYHag8HRDlnO3X9zmZ[i3];
    }

    public void lEeR5KfoEr4xU5yHH7() {
        if (hoXrIDAFrSwfShk8da()) {
            if (this.f488s3fjYDxWOUexjjVgyA) {
                if (this.f487pbVGzGjWvY2LDXC8vo.getMeasuredHeight() <= 0 || this.f487pbVGzGjWvY2LDXC8vo.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f484Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(this.f487pbVGzGjWvY2LDXC8vo) ? 1048576 : (this.f487pbVGzGjWvY2LDXC8vo.getMeasuredWidth() - this.f487pbVGzGjWvY2LDXC8vo.getTotalPaddingLeft()) - this.f487pbVGzGjWvY2LDXC8vo.getTotalPaddingRight();
                int height = (this.f487pbVGzGjWvY2LDXC8vo.getHeight() - this.f487pbVGzGjWvY2LDXC8vo.getCompoundPaddingBottom()) - this.f487pbVGzGjWvY2LDXC8vo.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f478e54J8UWNHWALQNixXM;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(rectF);
                        if (fHusNiw3snxdgZPAGJm != this.f487pbVGzGjWvY2LDXC8vo.getTextSize()) {
                            R9SAhYMerGybF9OAjL(0, fHusNiw3snxdgZPAGJm);
                        }
                    } finally {
                    }
                }
            }
            this.f488s3fjYDxWOUexjjVgyA = true;
        }
    }

    public int[] pbVGzGjWvY2LDXC8vo() {
        return this.f482KYHag8HRDlnO3X9zmZ;
    }

    public final int[] s3fjYDxWOUexjjVgyA(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public void sTkWmhpZ5b1ArQIw4K(int i) {
        if (VItLRw50eXTZeEfGl0()) {
            if (i == 0) {
                HJFh0TGMpafqLE9haL();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.f479Acstmh57AKoSEkEFNJ.getResources().getDisplayMetrics();
            WWC27LAMFqFFBzfbNw(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (G7AC3DWIx9i9fdanjk()) {
                lEeR5KfoEr4xU5yHH7();
            }
        }
    }

    public final void xHA29AmDt6y96AnB3t(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f482KYHag8HRDlnO3X9zmZ = s3fjYDxWOUexjjVgyA(iArr);
            LIMtzhnLwQyigzK0KO();
        }
    }

    public StaticLayout zZKhbgvUfsK4AEX3r0(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(charSequence, alignment, i, i2, this.f487pbVGzGjWvY2LDXC8vo, this.f481IPyIQcaNa8aB7drBED, this.f484Z9WdNiOsPR0y54zHW4);
    }

    public void zaq8hOURtfwbcX17cG(int[] iArr, int i) {
        if (VItLRw50eXTZeEfGl0()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f479Acstmh57AKoSEkEFNJ.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f482KYHag8HRDlnO3X9zmZ = s3fjYDxWOUexjjVgyA(iArrCopyOf);
                if (!LIMtzhnLwQyigzK0KO()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f483TCyPEKSzIyweCN5yp1 = false;
            }
            if (G7AC3DWIx9i9fdanjk()) {
                lEeR5KfoEr4xU5yHH7();
            }
        }
    }
}
