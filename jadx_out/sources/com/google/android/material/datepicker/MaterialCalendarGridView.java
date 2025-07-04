package com.google.android.material.datepicker;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Calendar f5104lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final boolean f5105s3fjYDxWOUexjjVgyA;

    public class lEeR5KfoEr4xU5yHH7 extends W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // W3RZ2dTDKrKpS5Mxdk.lEeR5KfoEr4xU5yHH7
        public void TCyPEKSzIyweCN5yp1(View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
            super.TCyPEKSzIyweCN5yp1(view, a49QRPHynYLCBN0SqP);
            a49QRPHynYLCBN0SqP.evSiTWao80SbJUZk9E(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void lEeR5KfoEr4xU5yHH7(int i, Rect rect) {
        int iS3fjYDxWOUexjjVgyA;
        if (i == 33) {
            iS3fjYDxWOUexjjVgyA = getAdapter().Z9WdNiOsPR0y54zHW4();
        } else {
            if (i != 130) {
                super.onFocusChanged(true, i, rect);
                return;
            }
            iS3fjYDxWOUexjjVgyA = getAdapter().s3fjYDxWOUexjjVgyA();
        }
        setSelection(iS3fjYDxWOUexjjVgyA);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hoXrIDAFrSwfShk8da adapter = getAdapter();
        adapter.getClass();
        int iMax = Math.max(adapter.s3fjYDxWOUexjjVgyA(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.Z9WdNiOsPR0y54zHW4(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            lEeR5KfoEr4xU5yHH7(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().s3fjYDxWOUexjjVgyA()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().s3fjYDxWOUexjjVgyA());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f5105s3fjYDxWOUexjjVgyA) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
    public hoXrIDAFrSwfShk8da getAdapter() {
        return (hoXrIDAFrSwfShk8da) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().s3fjYDxWOUexjjVgyA()) {
            i = getAdapter().s3fjYDxWOUexjjVgyA();
        }
        super.setSelection(i);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5104lEeR5KfoEr4xU5yHH7 = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();
        if (Z9WdNiOsPR0y54zHW4.hUNDUI3oB5uci3ylnY(getContext())) {
            setNextFocusLeftId(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7118lEeR5KfoEr4xU5yHH7);
            setNextFocusRightId(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7092HJFh0TGMpafqLE9haL);
        }
        this.f5105s3fjYDxWOUexjjVgyA = Z9WdNiOsPR0y54zHW4.Nm04cZudeGY9NQf1y2(getContext());
        lLKzvdU99Iw80uVD5I.eWK41qw3g36LVd4UnS(this, new lEeR5KfoEr4xU5yHH7());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof hoXrIDAFrSwfShk8da)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), hoXrIDAFrSwfShk8da.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
