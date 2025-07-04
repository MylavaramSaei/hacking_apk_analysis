package androidx.fragment.app;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import W3RZ2dTDKrKpS5Mxdk.zXY7dgnTfw9Pd9RXel;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f3474HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final List f3475lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final List f3476s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f3477zZKhbgvUfsK4AEX3r0;

    public static final class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final lEeR5KfoEr4xU5yHH7 f3478lEeR5KfoEr4xU5yHH7 = new lEeR5KfoEr4xU5yHH7();

        public final WindowInsets lEeR5KfoEr4xU5yHH7(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "v");
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "child");
        if (zaq8hOURtfwbcX17cG.FtYx4GXtxwA8al5hBy(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelCT5Hs3CQpLK8NvlZAw;
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(windowInsets, "insets");
        zXY7dgnTfw9Pd9RXel zxy7dgntfw9pd9rxelR9SAhYMerGybF9OAjL = zXY7dgnTfw9Pd9RXel.R9SAhYMerGybF9OAjL(windowInsets);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(zxy7dgntfw9pd9rxelR9SAhYMerGybF9OAjL, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3474HJFh0TGMpafqLE9haL;
        if (onApplyWindowInsetsListener != null) {
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = lEeR5KfoEr4xU5yHH7.f3478lEeR5KfoEr4xU5yHH7;
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(onApplyWindowInsetsListener);
            zxy7dgntfw9pd9rxelCT5Hs3CQpLK8NvlZAw = zXY7dgnTfw9Pd9RXel.R9SAhYMerGybF9OAjL(leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            zxy7dgntfw9pd9rxelCT5Hs3CQpLK8NvlZAw = lLKzvdU99Iw80uVD5I.cT5Hs3CQpLK8NvlZAw(this, zxy7dgntfw9pd9rxelR9SAhYMerGybF9OAjL);
        }
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(zxy7dgntfw9pd9rxelCT5Hs3CQpLK8NvlZAw, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!zxy7dgntfw9pd9rxelCT5Hs3CQpLK8NvlZAw.hoXrIDAFrSwfShk8da()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                lLKzvdU99Iw80uVD5I.KYHag8HRDlnO3X9zmZ(getChildAt(i), zxy7dgntfw9pd9rxelCT5Hs3CQpLK8NvlZAw);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(canvas, "canvas");
        if (this.f3477zZKhbgvUfsK4AEX3r0) {
            Iterator it = this.f3475lEeR5KfoEr4xU5yHH7.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(canvas, "canvas");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "child");
        if (this.f3477zZKhbgvUfsK4AEX3r0 && (!this.f3475lEeR5KfoEr4xU5yHH7.isEmpty()) && this.f3475lEeR5KfoEr4xU5yHH7.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "view");
        this.f3476s3fjYDxWOUexjjVgyA.remove(view);
        if (this.f3475lEeR5KfoEr4xU5yHH7.remove(view)) {
            this.f3477zZKhbgvUfsK4AEX3r0 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) zaq8hOURtfwbcX17cG.bMSdooljgH14Jgudph(this).cT5Hs3CQpLK8NvlZAw(getId());
    }

    public final void lEeR5KfoEr4xU5yHH7(View view) {
        if (this.f3476s3fjYDxWOUexjjVgyA.contains(view)) {
            this.f3475lEeR5KfoEr4xU5yHH7.add(view);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(childAt, "view");
                lEeR5KfoEr4xU5yHH7(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "view");
        lEeR5KfoEr4xU5yHH7(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(childAt, "view");
        lEeR5KfoEr4xU5yHH7(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "view");
        lEeR5KfoEr4xU5yHH7(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(childAt, "view");
            lEeR5KfoEr4xU5yHH7(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(childAt, "view");
            lEeR5KfoEr4xU5yHH7(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f3477zZKhbgvUfsK4AEX3r0 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(onApplyWindowInsetsListener, "listener");
        this.f3474HJFh0TGMpafqLE9haL = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(view, "view");
        if (view.getParent() == this) {
            this.f3476s3fjYDxWOUexjjVgyA.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
        this.f3475lEeR5KfoEr4xU5yHH7 = new ArrayList();
        this.f3476s3fjYDxWOUexjjVgyA = new ArrayList();
        this.f3477zZKhbgvUfsK4AEX3r0 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f926husNiw3snxdgZPAGJm;
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f924KYHag8HRDlnO3X9zmZ);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg) {
        String str;
        super(context, attributeSet);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(attributeSet, "attrs");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(zaq8hourtfwbcx17cg, "fm");
        this.f3475lEeR5KfoEr4xU5yHH7 = new ArrayList();
        this.f3476s3fjYDxWOUexjjVgyA = new ArrayList();
        this.f3477zZKhbgvUfsK4AEX3r0 = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f926husNiw3snxdgZPAGJm;
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f924KYHag8HRDlnO3X9zmZ) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL.f925TCyPEKSzIyweCN5yp1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentCT5Hs3CQpLK8NvlZAw = zaq8hourtfwbcx17cg.cT5Hs3CQpLK8NvlZAw(id);
        if (classAttribute != null && fragmentCT5Hs3CQpLK8NvlZAw == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentLEeR5KfoEr4xU5yHH7 = zaq8hourtfwbcx17cg.Pum9NZyDBKoCnecvlx().lEeR5KfoEr4xU5yHH7(context.getClassLoader(), classAttribute);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(fragmentLEeR5KfoEr4xU5yHH7, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentLEeR5KfoEr4xU5yHH7.jocVUfxESVhVJU8LoH(context, attributeSet, null);
            zaq8hourtfwbcx17cg.T9PhQIpGRhE4yZDm1C().hoXrIDAFrSwfShk8da(true).HJFh0TGMpafqLE9haL(this, fragmentLEeR5KfoEr4xU5yHH7, string).IPyIQcaNa8aB7drBED();
        }
        zaq8hourtfwbcx17cg.fDXXEWvhMVO3O8mnuS(this);
    }
}
