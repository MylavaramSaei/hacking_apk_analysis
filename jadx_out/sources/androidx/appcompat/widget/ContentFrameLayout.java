package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public TypedValue f2837HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public TypedValue f2838KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Rect f2839TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public TypedValue f2840husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public TypedValue f2841lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public TypedValue f2842s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public TypedValue f2843zZKhbgvUfsK4AEX3r0;

    public interface lEeR5KfoEr4xU5yHH7 {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2840husNiw3snxdgZPAGJm == null) {
            this.f2840husNiw3snxdgZPAGJm = new TypedValue();
        }
        return this.f2840husNiw3snxdgZPAGJm;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2838KYHag8HRDlnO3X9zmZ == null) {
            this.f2838KYHag8HRDlnO3X9zmZ = new TypedValue();
        }
        return this.f2838KYHag8HRDlnO3X9zmZ;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2837HJFh0TGMpafqLE9haL == null) {
            this.f2837HJFh0TGMpafqLE9haL = new TypedValue();
        }
        return this.f2837HJFh0TGMpafqLE9haL;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2843zZKhbgvUfsK4AEX3r0 == null) {
            this.f2843zZKhbgvUfsK4AEX3r0 = new TypedValue();
        }
        return this.f2843zZKhbgvUfsK4AEX3r0;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2841lEeR5KfoEr4xU5yHH7 == null) {
            this.f2841lEeR5KfoEr4xU5yHH7 = new TypedValue();
        }
        return this.f2841lEeR5KfoEr4xU5yHH7;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2842s3fjYDxWOUexjjVgyA == null) {
            this.f2842s3fjYDxWOUexjjVgyA = new TypedValue();
        }
        return this.f2842s3fjYDxWOUexjjVgyA;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2839TCyPEKSzIyweCN5yp1 = new Rect();
    }
}
