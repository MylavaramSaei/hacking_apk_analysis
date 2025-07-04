package WaWv1mJ1ya3uoEaKqz;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e54J8UWNHWALQNixXM {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Comparator f1987lEeR5KfoEr4xU5yHH7 = new lEeR5KfoEr4xU5yHH7();

    public class lEeR5KfoEr4xU5yHH7 implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static TextView HJFh0TGMpafqLE9haL(Toolbar toolbar) {
        List listZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(toolbar, toolbar.getSubtitle());
        if (listZZKhbgvUfsK4AEX3r0.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listZZKhbgvUfsK4AEX3r0, f1987lEeR5KfoEr4xU5yHH7);
    }

    public static TextView husNiw3snxdgZPAGJm(Toolbar toolbar) {
        List listZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(toolbar, toolbar.getTitle());
        if (listZZKhbgvUfsK4AEX3r0.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listZZKhbgvUfsK4AEX3r0, f1987lEeR5KfoEr4xU5yHH7);
    }

    public static ImageView lEeR5KfoEr4xU5yHH7(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static ImageView s3fjYDxWOUexjjVgyA(Toolbar toolbar) {
        return lEeR5KfoEr4xU5yHH7(toolbar, toolbar.getLogo());
    }

    public static List zZKhbgvUfsK4AEX3r0(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
