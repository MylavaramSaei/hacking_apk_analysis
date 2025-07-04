package com.google.android.material.timepicker;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ayaSAlBnO403UB0TMR.TCyPEKSzIyweCN5yp1;
import ayaSAlBnO403UB0TMR.pbVGzGjWvY2LDXC8vo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 extends ConstraintLayout {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public final Runnable f5497A49QRPHynYLCBN0SqP;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public int f5498VItLRw50eXTZeEfGl0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1 f5499WWC27LAMFqFFBzfbNw;

    public zZKhbgvUfsK4AEX3r0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1.f7073KYHag8HRDlnO3X9zmZ, this);
        lLKzvdU99Iw80uVD5I.ayduHasC7VpxsVXE0T(this, G7AC3DWIx9i9fdanjk());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.ojOFljVHhgv79qoaOh, i, 0);
        this.f5498VItLRw50eXTZeEfGl0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Acstmh57AKoSEkEFNJ.C3mYeVlq5GzYsTPpOy, 0);
        this.f5497A49QRPHynYLCBN0SqP = new Runnable() { // from class: com.google.android.material.timepicker.HJFh0TGMpafqLE9haL
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                this.f5476lEeR5KfoEr4xU5yHH7.WWC27LAMFqFFBzfbNw();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean VItLRw50eXTZeEfGl0(View view) {
        return "skip".equals(view.getTag());
    }

    public void A49QRPHynYLCBN0SqP(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f5498VItLRw50eXTZeEfGl0 = i;
        WWC27LAMFqFFBzfbNw();
    }

    public final Drawable G7AC3DWIx9i9fdanjk() {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1();
        this.f5499WWC27LAMFqFFBzfbNw = tCyPEKSzIyweCN5yp1;
        tCyPEKSzIyweCN5yp1.LU0fFDMACqnfIfA1AZ(new pbVGzGjWvY2LDXC8vo(0.5f));
        this.f5499WWC27LAMFqFFBzfbNw.YlLW4G6OV9TFyuw5ix(ColorStateList.valueOf(-1));
        return this.f5499WWC27LAMFqFFBzfbNw;
    }

    public int LIMtzhnLwQyigzK0KO() {
        return this.f5498VItLRw50eXTZeEfGl0;
    }

    public final void R9SAhYMerGybF9OAjL(List list, androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1(((View) it.next()).getId(), tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7120s3fjYDxWOUexjjVgyA, i, size);
            size += 360.0f / list.size();
        }
    }

    public final void THTDvPxsHqMeGb512f() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f5497A49QRPHynYLCBN0SqP);
            handler.post(this.f5497A49QRPHynYLCBN0SqP);
        }
    }

    public void WWC27LAMFqFFBzfbNw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new androidx.constraintlayout.widget.zZKhbgvUfsK4AEX3r0();
        zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7120s3fjYDxWOUexjjVgyA && !VItLRw50eXTZeEfGl0(childAt)) {
                int i2 = (Integer) childAt.getTag(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7119pbVGzGjWvY2LDXC8vo);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            R9SAhYMerGybF9OAjL((List) entry.getValue(), zzkhbgvufsk4aex3r0, xHA29AmDt6y96AnB3t(((Integer) entry.getKey()).intValue()));
        }
        zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED());
        }
        THTDvPxsHqMeGb512f();
    }

    @Override // android.view.View
    public void onFinishInflate() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onFinishInflate();
        WWC27LAMFqFFBzfbNw();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        THTDvPxsHqMeGb512f();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f5499WWC27LAMFqFFBzfbNw.YlLW4G6OV9TFyuw5ix(ColorStateList.valueOf(i));
    }

    public int xHA29AmDt6y96AnB3t(int i) {
        return i == 2 ? Math.round(this.f5498VItLRw50eXTZeEfGl0 * 0.66f) : this.f5498VItLRw50eXTZeEfGl0;
    }
}
