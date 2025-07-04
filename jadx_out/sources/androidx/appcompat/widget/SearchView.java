package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public abstract class SearchView extends s3fjYDxWOUexjjVgyA {

    public static class SearchAutoComplete extends IPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL {

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public boolean f2844KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public final Runnable f2845TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f2846husNiw3snxdgZPAGJm;

        public class lEeR5KfoEr4xU5yHH7 implements Runnable {
            public lEeR5KfoEr4xU5yHH7() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.s3fjYDxWOUexjjVgyA();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7.f6274TCyPEKSzIyweCN5yp1);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f2846husNiw3snxdgZPAGJm <= 0 || super.enoughToFilter();
        }

        @Override // IPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2844KYHag8HRDlnO3X9zmZ) {
                removeCallbacks(this.f2845TCyPEKSzIyweCN5yp1);
                post(this.f2845TCyPEKSzIyweCN5yp1);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            throw null;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        throw null;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z) {
                throw null;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void s3fjYDxWOUexjjVgyA() {
            if (this.f2844KYHag8HRDlnO3X9zmZ) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2844KYHag8HRDlnO3X9zmZ = false;
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2844KYHag8HRDlnO3X9zmZ = false;
                removeCallbacks(this.f2845TCyPEKSzIyweCN5yp1);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2844KYHag8HRDlnO3X9zmZ = true;
                    return;
                }
                this.f2844KYHag8HRDlnO3X9zmZ = false;
                removeCallbacks(this.f2845TCyPEKSzIyweCN5yp1);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2846husNiw3snxdgZPAGJm = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2845TCyPEKSzIyweCN5yp1 = new lEeR5KfoEr4xU5yHH7();
            this.f2846husNiw3snxdgZPAGJm = getThreshold();
        }
    }
}
