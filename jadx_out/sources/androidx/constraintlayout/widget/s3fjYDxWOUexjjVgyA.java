package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f3080HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f3081KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public int f3082TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public String f3083husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public String f3084lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public EnumC0035s3fjYDxWOUexjjVgyA f3085s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public float f3086zZKhbgvUfsK4AEX3r0;

    public static /* synthetic */ class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final /* synthetic */ int[] f3087lEeR5KfoEr4xU5yHH7;

        static {
            int[] iArr = new int[EnumC0035s3fjYDxWOUexjjVgyA.values().length];
            f3087lEeR5KfoEr4xU5yHH7 = iArr;
            try {
                iArr[EnumC0035s3fjYDxWOUexjjVgyA.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3087lEeR5KfoEr4xU5yHH7[EnumC0035s3fjYDxWOUexjjVgyA.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3087lEeR5KfoEr4xU5yHH7[EnumC0035s3fjYDxWOUexjjVgyA.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3087lEeR5KfoEr4xU5yHH7[EnumC0035s3fjYDxWOUexjjVgyA.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3087lEeR5KfoEr4xU5yHH7[EnumC0035s3fjYDxWOUexjjVgyA.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3087lEeR5KfoEr4xU5yHH7[EnumC0035s3fjYDxWOUexjjVgyA.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3087lEeR5KfoEr4xU5yHH7[EnumC0035s3fjYDxWOUexjjVgyA.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, reason: collision with other inner class name */
    public enum EnumC0035s3fjYDxWOUexjjVgyA {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, Object obj) {
        this.f3084lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya.f3084lEeR5KfoEr4xU5yHH7;
        this.f3085s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya.f3085s3fjYDxWOUexjjVgyA;
        zZKhbgvUfsK4AEX3r0(obj);
    }

    public static void HJFh0TGMpafqLE9haL(View view, HashMap map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) map.get(str);
            String str2 = "set" + str;
            try {
                switch (lEeR5KfoEr4xU5yHH7.f3087lEeR5KfoEr4xU5yHH7[s3fjydxwouexjjvgya.f3085s3fjYDxWOUexjjVgyA.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(s3fjydxwouexjjvgya.f3082TCyPEKSzIyweCN5yp1));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(s3fjydxwouexjjvgya.f3082TCyPEKSzIyweCN5yp1);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(s3fjydxwouexjjvgya.f3080HJFh0TGMpafqLE9haL));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(s3fjydxwouexjjvgya.f3086zZKhbgvUfsK4AEX3r0));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, s3fjydxwouexjjvgya.f3083husNiw3snxdgZPAGJm);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(s3fjydxwouexjjvgya.f3081KYHag8HRDlnO3X9zmZ));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(s3fjydxwouexjjvgya.f3086zZKhbgvUfsK4AEX3r0));
                        break;
                }
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public static HashMap lEeR5KfoEr4xU5yHH7(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya, cls.getMethod("getMap" + str, null).invoke(view, null)));
            } catch (IllegalAccessException e) {
                e = e;
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e = e2;
                e.printStackTrace();
            } catch (InvocationTargetException e3) {
                e = e3;
                e.printStackTrace();
            }
        }
        return map2;
    }

    public static void s3fjYDxWOUexjjVgyA(Context context, XmlPullParser xmlPullParser, HashMap map) {
        EnumC0035s3fjYDxWOUexjjVgyA enumC0035s3fjYDxWOUexjjVgyA;
        Object string;
        int integer;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.INlqdFKQnSaOPxk27m);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        EnumC0035s3fjYDxWOUexjjVgyA enumC0035s3fjYDxWOUexjjVgyA2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.MfX5YxttElJdOx4uDl) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.sFPmpDxgppcnCCjn0l) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0035s3fjYDxWOUexjjVgyA2 = EnumC0035s3fjYDxWOUexjjVgyA.BOOLEAN_TYPE;
            } else {
                if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.hV7XaowQwpA0oB6Ofm) {
                    enumC0035s3fjYDxWOUexjjVgyA = EnumC0035s3fjYDxWOUexjjVgyA.COLOR_TYPE;
                } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.QlwekCdhwU6BfwkNVu) {
                    enumC0035s3fjYDxWOUexjjVgyA = EnumC0035s3fjYDxWOUexjjVgyA.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.fGfZ0eiHdNE5vUmzRo) {
                        enumC0035s3fjYDxWOUexjjVgyA = EnumC0035s3fjYDxWOUexjjVgyA.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.NdFAAYJe0jjbk44RHZ) {
                        enumC0035s3fjYDxWOUexjjVgyA = EnumC0035s3fjYDxWOUexjjVgyA.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.njvkblNMI9Su0OX3PB) {
                        enumC0035s3fjYDxWOUexjjVgyA = EnumC0035s3fjYDxWOUexjjVgyA.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.xDm0kltYAUFsNtkWXq) {
                        enumC0035s3fjYDxWOUexjjVgyA = EnumC0035s3fjYDxWOUexjjVgyA.INT_TYPE;
                        integer = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj = string;
                        enumC0035s3fjYDxWOUexjjVgyA2 = enumC0035s3fjYDxWOUexjjVgyA;
                        objValueOf = obj;
                    } else if (index == sTkWmhpZ5b1ArQIw4K.zZKhbgvUfsK4AEX3r0.lHPkE93Dmy5iD2yQiG) {
                        enumC0035s3fjYDxWOUexjjVgyA = EnumC0035s3fjYDxWOUexjjVgyA.STRING_TYPE;
                        string = typedArrayObtainStyledAttributes.getString(index);
                        Object obj2 = string;
                        enumC0035s3fjYDxWOUexjjVgyA2 = enumC0035s3fjYDxWOUexjjVgyA;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj22 = string;
                    enumC0035s3fjYDxWOUexjjVgyA2 = enumC0035s3fjYDxWOUexjjVgyA;
                    objValueOf = obj22;
                }
                integer = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj222 = string;
                enumC0035s3fjYDxWOUexjjVgyA2 = enumC0035s3fjYDxWOUexjjVgyA;
                objValueOf = obj222;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new s3fjYDxWOUexjjVgyA(string2, enumC0035s3fjYDxWOUexjjVgyA2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void zZKhbgvUfsK4AEX3r0(Object obj) {
        switch (lEeR5KfoEr4xU5yHH7.f3087lEeR5KfoEr4xU5yHH7[this.f3085s3fjYDxWOUexjjVgyA.ordinal()]) {
            case 1:
            case 2:
                this.f3082TCyPEKSzIyweCN5yp1 = ((Integer) obj).intValue();
                break;
            case 3:
                this.f3080HJFh0TGMpafqLE9haL = ((Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.f3086zZKhbgvUfsK4AEX3r0 = ((Float) obj).floatValue();
                break;
            case 5:
                this.f3083husNiw3snxdgZPAGJm = (String) obj;
                break;
            case 6:
                this.f3081KYHag8HRDlnO3X9zmZ = ((Boolean) obj).booleanValue();
                break;
        }
    }

    public s3fjYDxWOUexjjVgyA(String str, EnumC0035s3fjYDxWOUexjjVgyA enumC0035s3fjYDxWOUexjjVgyA, Object obj) {
        this.f3084lEeR5KfoEr4xU5yHH7 = str;
        this.f3085s3fjYDxWOUexjjVgyA = enumC0035s3fjYDxWOUexjjVgyA;
        zZKhbgvUfsK4AEX3r0(obj);
    }
}
