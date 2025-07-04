package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public WeakReference f2903HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f2904lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2905s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public LayoutInflater f2906zZKhbgvUfsK4AEX3r0;

    public interface lEeR5KfoEr4xU5yHH7 {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2905s3fjYDxWOUexjjVgyA;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2906zZKhbgvUfsK4AEX3r0;
    }

    public int getLayoutResource() {
        return this.f2904lEeR5KfoEr4xU5yHH7;
    }

    public View lEeR5KfoEr4xU5yHH7() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f2904lEeR5KfoEr4xU5yHH7 == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f2906zZKhbgvUfsK4AEX3r0;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f2904lEeR5KfoEr4xU5yHH7, viewGroup, false);
        int i = this.f2905s3fjYDxWOUexjjVgyA;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f2903HJFh0TGMpafqLE9haL = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2905s3fjYDxWOUexjjVgyA = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2906zZKhbgvUfsK4AEX3r0 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2904lEeR5KfoEr4xU5yHH7 = i;
    }

    public void setOnInflateListener(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f2903HJFh0TGMpafqLE9haL;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            lEeR5KfoEr4xU5yHH7();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2904lEeR5KfoEr4xU5yHH7 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pbVGzGjWvY2LDXC8vo.nZURNaK44ts4XNCkYr, i, 0);
        this.f2905s3fjYDxWOUexjjVgyA = typedArrayObtainStyledAttributes.getResourceId(pbVGzGjWvY2LDXC8vo.iiJlEZjcw2pMDvSjYw, -1);
        this.f2904lEeR5KfoEr4xU5yHH7 = typedArrayObtainStyledAttributes.getResourceId(pbVGzGjWvY2LDXC8vo.exhPLopOJ5QWEzRjTU, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(pbVGzGjWvY2LDXC8vo.suHivzALoCSfNps0XP, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
