package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f5255IPyIQcaNa8aB7drBED;

    public SearchBar$ScrollingViewBehavior() {
        this.f5255IPyIQcaNa8aB7drBED = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.s3fjYDxWOUexjjVgyA
    public boolean IPyIQcaNa8aB7drBED(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return super.IPyIQcaNa8aB7drBED(coordinatorLayout, view, view2);
    }

    @Override // EscIOBqRhG6irG5q11.s3fjYDxWOUexjjVgyA
    public boolean aAp6BD79BhftLCnuvf() {
        return true;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5255IPyIQcaNa8aB7drBED = false;
    }
}
