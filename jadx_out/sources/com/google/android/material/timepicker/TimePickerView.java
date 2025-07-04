package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public final Chip f5478A49QRPHynYLCBN0SqP;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public final View.OnClickListener f5479OUd9THiLjZndMj0qdF;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public final ClockFaceView f5480THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public final Chip f5481VItLRw50eXTZeEfGl0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public final ClockHandView f5482WWC27LAMFqFFBzfbNw;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public final MaterialButtonToggleGroup f5483ao3wqKm5CXFuvC0q47;

    public class HJFh0TGMpafqLE9haL implements View.OnTouchListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f5484lEeR5KfoEr4xU5yHH7;

        public HJFh0TGMpafqLE9haL(GestureDetector gestureDetector) {
            this.f5484lEeR5KfoEr4xU5yHH7 = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f5484lEeR5KfoEr4xU5yHH7.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface husNiw3snxdgZPAGJm {
    }

    public class lEeR5KfoEr4xU5yHH7 implements View.OnClickListener {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.G7AC3DWIx9i9fdanjk(TimePickerView.this);
        }
    }

    public class s3fjYDxWOUexjjVgyA extends GestureDetector.SimpleOnGestureListener {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.xHA29AmDt6y96AnB3t(TimePickerView.this);
            return false;
        }
    }

    public interface zZKhbgvUfsK4AEX3r0 {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ husNiw3snxdgZPAGJm G7AC3DWIx9i9fdanjk(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ zZKhbgvUfsK4AEX3r0 xHA29AmDt6y96AnB3t(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public final void A49QRPHynYLCBN0SqP() {
        this.f5478A49QRPHynYLCBN0SqP.setTag(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7098OUd9THiLjZndMj0qdF, 12);
        this.f5481VItLRw50eXTZeEfGl0.setTag(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7098OUd9THiLjZndMj0qdF, 10);
        this.f5478A49QRPHynYLCBN0SqP.setOnClickListener(this.f5479OUd9THiLjZndMj0qdF);
        this.f5481VItLRw50eXTZeEfGl0.setOnClickListener(this.f5479OUd9THiLjZndMj0qdF);
        this.f5478A49QRPHynYLCBN0SqP.setAccessibilityClassName("android.view.View");
        this.f5481VItLRw50eXTZeEfGl0.setAccessibilityClassName("android.view.View");
    }

    public final /* synthetic */ void LIMtzhnLwQyigzK0KO(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
    }

    public final void VItLRw50eXTZeEfGl0() {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(new GestureDetector(getContext(), new s3fjYDxWOUexjjVgyA()));
        this.f5478A49QRPHynYLCBN0SqP.setOnTouchListener(hJFh0TGMpafqLE9haL);
        this.f5481VItLRw50eXTZeEfGl0.setOnTouchListener(hJFh0TGMpafqLE9haL);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f5481VItLRw50eXTZeEfGl0.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5479OUd9THiLjZndMj0qdF = new lEeR5KfoEr4xU5yHH7();
        LayoutInflater.from(context).inflate(TCyPEKSzIyweCN5yp1.f7083pbVGzGjWvY2LDXC8vo, this);
        this.f5480THTDvPxsHqMeGb512f = (ClockFaceView) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7103TCyPEKSzIyweCN5yp1);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7088Acstmh57AKoSEkEFNJ);
        this.f5483ao3wqKm5CXFuvC0q47 = materialButtonToggleGroup;
        materialButtonToggleGroup.s3fjYDxWOUexjjVgyA(new MaterialButtonToggleGroup.zZKhbgvUfsK4AEX3r0() { // from class: com.google.android.material.timepicker.KYHag8HRDlnO3X9zmZ
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.zZKhbgvUfsK4AEX3r0
            public final void lEeR5KfoEr4xU5yHH7(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                this.f5477lEeR5KfoEr4xU5yHH7.LIMtzhnLwQyigzK0KO(materialButtonToggleGroup2, i2, z);
            }
        });
        this.f5478A49QRPHynYLCBN0SqP = (Chip) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7102T9PhQIpGRhE4yZDm1C);
        this.f5481VItLRw50eXTZeEfGl0 = (Chip) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7110Z9WdNiOsPR0y54zHW4);
        this.f5482WWC27LAMFqFFBzfbNw = (ClockHandView) findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7093IPyIQcaNa8aB7drBED);
        VItLRw50eXTZeEfGl0();
        A49QRPHynYLCBN0SqP();
    }
}
